package com.baccarin.universidade.repository.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.baccarin.universidade.domain.Curso;
import com.baccarin.universidade.vo.CursoVO;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {

	@Query(" select com.baccarin.universidade.vo.CursoVO(c.id, c.nome) from Curso c ")
	List<CursoVO> buscaListaGeralCursoVO();

	@Query(" select com.baccarin.universidade.vo.CursoVO(c.id, c.nome) from Curso c where c.id =:id")
	CursoVO buscaListaGeralCursoVOById(@Param("id") Long id);

	@Query(" select com.baccarin.universidade.vo.CursoVO(c.id, c.nome) from Curso c where c.id =:id OR c.nome like :nome")
	List<CursoVO> buscaListaGeralCursoVOByFiltro(@Param("id") Long id, @Param("nome") String nome);

}
