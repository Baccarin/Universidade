package com.baccarin.universidade.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baccarin.universidade.domain.Aluno;
import com.baccarin.universidade.domain.Autenticacao;
import com.baccarin.universidade.domain.Sexo;
import com.baccarin.universidade.exceptions.RegistroIncompletoException;
import com.baccarin.universidade.exceptions.RegistroNaoEncontradoException;
import com.baccarin.universidade.repository.api.AlunoRepository;
import com.baccarin.universidade.repository.api.SexoRepository;
import com.baccarin.universidade.service.AlunoService;
import com.baccarin.universidade.vo.AlunoVO;
import com.baccarin.universidade.vo.AlunoCompletoVO;

import lombok.RequiredArgsConstructor;
import lombok.val;

@Service
@Transactional
@RequiredArgsConstructor
public class AlunoServiceImpl implements AlunoService {

	private final AlunoRepository repository;
	private final SexoRepository sexoRepository;

	@Override
	public List<AlunoVO> buscaListaAlunoVO() {
		return repository.buscaListaAlunoVO();
	}

	@Override
	public AlunoVO buscaListaAlunoVOById(AlunoVO vo) {
		return repository.buscaAlunoVOById(vo.getId());
	}

	@Override
	public void salvarAluno(AlunoCompletoVO vo) throws Exception {
		validaSalvarNovoAluno(vo);
		Aluno aluno = new Aluno();
		if (Objects.nonNull(vo.getId())) {
			aluno.setId(vo.getId());
		}
		if (Objects.nonNull(vo.getNome()) && !vo.getNome().isBlank()) {
			aluno.setNome(vo.getNome());
		}

		if (Objects.nonNull(vo.getDataNascimento())) {
			aluno.setDataNascimento(vo.getDataNascimento());
		}

		if (Objects.nonNull(vo.getIdSexo()) && vo.getIdSexo() != 0) {
			Sexo sexo = sexoRepository.findById(vo.getIdSexo())
					.orElseThrow((() -> new RegistroNaoEncontradoException(Sexo.class, vo.getIdSexo())));
			aluno.setSexo(sexo);
		}
		if (Objects.nonNull(vo.getLogin()) && Objects.nonNull(vo.getSenha())) {
			Autenticacao aut = new Autenticacao();
			aut.setLogin(vo.getLogin());
			aut.setSenha(vo.getSenha());
			aluno.setAutenticacao(aut);
		}
		repository.save(aluno);
	}

	private void validaSalvarNovoAluno(AlunoCompletoVO vo) throws RegistroIncompletoException {
		if (Objects.nonNull(vo.getLogin()) && !vo.getLogin().isBlank()) {
			if (Objects.nonNull(vo.getSenha()) && !vo.getSenha().isBlank()) {
				return;
			}
		}
		throw new RegistroIncompletoException("Necessário informar login/senha ao cadastrar um novo aluno.");
	}

	@Override
	public void editarAluno(AlunoCompletoVO vo) throws Exception {
		salvarAluno(vo);		
	}

}
