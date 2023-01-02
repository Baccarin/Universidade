package com.baccarin.universidade.service;

import java.util.List;

import com.baccarin.universidade.vo.DisciplinaVO;

public interface DisciplinaService {

	void salvarDisciplina(DisciplinaVO vo) throws Exception;
	
	void editarDisciplina(DisciplinaVO vo) throws Exception;
		
	void mudarTurnoDisciplina(DisciplinaVO vo) throws Exception;
	
	void removerDisciplina(DisciplinaVO vo) throws Exception;
	
	List<DisciplinaVO> buscarListaDisciplinasVO();
	
	List<DisciplinaVO> buscarListaDisciplinasVOByFiltro(DisciplinaVO vo);

}
