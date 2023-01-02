package com.baccarin.universidade.repository.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.baccarin.universidade.domain.Aluno;
import com.baccarin.universidade.vo.AlunoVO;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	@Query(" select new com.baccarin.universidade.vo.AlunoVO(aluno.id, aluno.pessoa.nome) from Aluno a ")
	List<AlunoVO> buscaListaAlunoVO();

	@Query("select new com.baccarin.universidade.vo.AlunoVO(aluno.id, aluno.pessoa.nome) from Aluno a where a.id = :id")
	AlunoVO buscaAlunoVOById(@Param("id") Long id);

}
