package com.baccarin.universidade.repository.api;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.baccarin.universidade.domain.Funcionario;
import com.baccarin.universidade.vo.FuncionarioVO;

@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario, Long>{

	@Query(" select new com.baccarin.universidade.vo.FuncionarioVO(f.id, f.tipo, tf.descricao. , f.nome) from Funcionario f inner join f.tipoFuncionario tf ")
	List<FuncionarioVO> buscaListaFuncionariosVO();
	
	@Query(" select new com.baccarin.universidade.vo.FuncionarioVO(f.id, f.tipo, tf.descricao. , f.nome) from Funcionario f inner join f.tipoFuncionario tf where f.id=:id")
	FuncionarioVO buscaFuncionarioVOById(@Param("id") Long id);
	
}
