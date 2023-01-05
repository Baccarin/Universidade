package com.baccarin.universidade.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.baccarin.universidade.domain.Disciplina;
import com.baccarin.universidade.domain.TurnoDisciplina;
import com.baccarin.universidade.exceptions.RegistroIncompletoException;
import com.baccarin.universidade.exceptions.RegistroNaoEncontradoException;
import com.baccarin.universidade.repository.api.DisciplinaRepository;
import com.baccarin.universidade.repository.api.TurnoDisciplinaRepository;
import com.baccarin.universidade.service.DisciplinaService;
import com.baccarin.universidade.vo.DisciplinaVO;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class DisciplinaServiceImpl implements DisciplinaService {

	private final TurnoDisciplinaRepository turnoRepository;
	private final DisciplinaRepository repository;

	@Override
	public void salvarDisciplina(DisciplinaVO vo) throws Exception {
		validarSalvarDisciplina(vo);
		repository.save(new Disciplina(vo));
	}

	@Override
	public void editarDisciplina(DisciplinaVO vo) throws Exception {
		validarSalvarDisciplina(vo);

	}

	@Override
	public void mudarTurnoDisciplina(DisciplinaVO vo) throws Exception {

	}

	@Override
	public void removerDisciplina(DisciplinaVO vo) throws Exception {

	}

	@Override
	public List<DisciplinaVO> buscarListaDisciplinasVO() {
		return null;
	}

	@Override
	public List<DisciplinaVO> buscarListaDisciplinasVOByFiltro(DisciplinaVO vo) {
		return null;
	}

	private void validarSalvarDisciplina(DisciplinaVO vo) throws Exception {
		if (Objects.nonNull(vo.getNome()) && !vo.getNome().isBlank()) {
			if (Objects.nonNull(vo.getIdTurno()) && vo.getIdTurno() > 0) {
				turnoRepository.findById(vo.getIdTurno()).orElseThrow(
						(() -> new RegistroNaoEncontradoException(TurnoDisciplina.class, vo.getIdTurno())));
				return;
			}
		}
		throw new RegistroIncompletoException("Necessário informar nome/turno para salvar o registro de disciplina.");
	}

}
