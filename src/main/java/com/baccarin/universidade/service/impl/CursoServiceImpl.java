package com.baccarin.universidade.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.baccarin.universidade.domain.Curso;
import com.baccarin.universidade.exceptions.RegistroIncompletoException;
import com.baccarin.universidade.repository.api.CursoRepository;
import com.baccarin.universidade.service.CursoService;
import com.baccarin.universidade.vo.CursoVO;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class CursoServiceImpl implements CursoService {

	private final CursoRepository repository;

	@Override
	public List<CursoVO> buscaListaCursoVO() {
		return repository.buscaListaGeralCursoVO();
	}

	@Override
	public CursoVO buscaListaCursoVOById(CursoVO vo) {
		return repository.buscaListaGeralCursoVOById(vo.getId());
	}

	@Override
	public List<CursoVO> buscaListaGeralCursoVOByFiltro(CursoVO vo) {
		return repository.buscaListaGeralCursoVOByFiltro(vo.getId(), vo.getNome());

	}

	@Override
	public void salvarCurso(CursoVO vo) throws Exception {
		validarSalvarCurso(vo);
		repository.save(new Curso(vo));
	}

	@Override
	public void editarCurso(CursoVO vo) throws Exception {
		validarSalvarCurso(vo);
		repository.save(new Curso(vo));
	}

	private void validarSalvarCurso(CursoVO vo) throws RegistroIncompletoException {
		if (Objects.nonNull(vo.getNome())) {
			if (Objects.nonNull(vo.getDuracao()) && vo.getDuracao() > 0) {
				return;
			}
		}
		throw new RegistroIncompletoException("Necessário informar nome/duração para salvar um novo curso.");

	}

}
