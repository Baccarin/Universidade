package com.baccarin.universidade.service.impl;

import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Service;

import com.baccarin.universidade.domain.Funcionario;
import com.baccarin.universidade.domain.Sexo;
import com.baccarin.universidade.domain.TipoFuncionario;
import com.baccarin.universidade.exceptions.RegistroNaoEncontradoException;
import com.baccarin.universidade.repository.api.FuncionarioRepository;
import com.baccarin.universidade.repository.api.SexoRepository;
import com.baccarin.universidade.repository.api.TipoFuncionarioRepository;
import com.baccarin.universidade.resource.FuncionarioService;
import com.baccarin.universidade.vo.FuncionarioCompletoVO;
import com.baccarin.universidade.vo.FuncionarioVO;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class FuncionarioServiceImpl implements FuncionarioService {

	private final FuncionarioRepository repository;
	private final TipoFuncionarioRepository tipoFuncRepository;
	private final SexoRepository sexoRepository;

	@Override
	public void salvarFuncionario(FuncionarioCompletoVO vo) throws Exception {
		Funcionario func = preencheInformcoesByVO(vo);
		repository.save(func);
	}

	@Override
	public void editarFuncionario(FuncionarioCompletoVO vo) throws Exception {
		Funcionario func = preencheInformcoesByVO(vo);
		repository.save(func);
	}

	private Funcionario preencheInformcoesByVO(FuncionarioCompletoVO vo) throws Exception {
		Funcionario func = repository.findById(vo.getIdFuncionario()).orElse(new Funcionario());
		if (Objects.nonNull(vo.getIdFuncionario()) && vo.getIdFuncionario() > 0) {
			func.setId(vo.getIdFuncionario());
		}

		if(Objects.nonNull(vo.getNome())) {
			func.setNome(vo.getNome());
		}

		if (Objects.nonNull(vo.getIdTipoFuncionario()) && vo.getIdTipoFuncionario() > 0) {
			TipoFuncionario tipo = tipoFuncRepository.findById(vo.getIdTipoFuncionario()).orElseThrow(
					(() -> new RegistroNaoEncontradoException(TipoFuncionario.class, vo.getIdTipoFuncionario())));
			func.setTipo(tipo);
		}

		if (Objects.nonNull(vo.getIdSexo())) {
			Sexo sexo = sexoRepository.findById(vo.getIdSexo())
					.orElseThrow((() -> new RegistroNaoEncontradoException(Sexo.class, vo.getIdSexo())));
			func.setSexo(sexo);
		}

		if (Objects.nonNull(vo.getLogin())) {
			func.getAutenticacao().setLogin(vo.getLogin());
		}

		if (Objects.nonNull(vo.getSenha())) {
			func.getAutenticacao().setSenha(vo.getSenha());
		}

		return func;
	}

	@Override
	public void demitirFuncionario(FuncionarioVO vo) throws Exception {
		Funcionario func = repository.findById(vo.getIdFuncionario())
				.orElseThrow((() -> new RegistroNaoEncontradoException(Funcionario.class, vo.getIdFuncionario())));
		func.setAtivo(false);
		repository.save(func);
	}

	@Override
	public List<FuncionarioVO> buscaListaFuncionariosVO() {
		return repository.buscaListaFuncionariosVO();
	}

}
