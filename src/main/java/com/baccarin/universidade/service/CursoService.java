package com.baccarin.universidade.service;

import java.util.List;

import com.baccarin.universidade.vo.CursoVO;

public interface CursoService {

	List<CursoVO> buscaListaCursoVO();

	CursoVO buscaListaCursoVOById(CursoVO vo);

	List<CursoVO> buscaListaGeralCursoVOByFiltro(CursoVO vo);

	void salvarCurso(CursoVO vo) throws Exception;

	void editarCurso(CursoVO vo) throws Exception;
}
