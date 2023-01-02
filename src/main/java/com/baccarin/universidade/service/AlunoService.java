package com.baccarin.universidade.service;

import java.util.List;

import com.baccarin.universidade.domain.Aluno;
import com.baccarin.universidade.vo.AlunoVO;
import com.baccarin.universidade.vo.AlunoCompletoVO;

public interface AlunoService {

	List<AlunoVO> buscaListaAlunoVO();

	AlunoVO buscaListaAlunoVOById(AlunoVO vo);

	void salvarAluno(AlunoCompletoVO vo) throws Exception;

	void editarAluno(AlunoCompletoVO vo) throws Exception;
}
