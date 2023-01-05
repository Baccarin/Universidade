package com.baccarin.universidade.resource;

import java.util.List;

import com.baccarin.universidade.vo.FuncionarioCompletoVO;
import com.baccarin.universidade.vo.FuncionarioVO;

public interface FuncionarioService {

	void salvarFuncionario(FuncionarioCompletoVO vo) throws Exception;
	
	void editarFuncionario(FuncionarioCompletoVO vo) throws Exception;
	
	void demitirFuncionario(FuncionarioVO vo) throws Exception;
	
	List<FuncionarioVO> buscaListaFuncionariosVO();

}
