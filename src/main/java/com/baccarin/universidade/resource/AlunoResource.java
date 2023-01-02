package com.baccarin.universidade.resource;

import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baccarin.universidade.service.AlunoService;
import com.baccarin.universidade.vo.AlunoVO;
import com.baccarin.universidade.vo.AlunoCompletoVO;

import lombok.RequiredArgsConstructor;

@RestController("universidade/aluno")
@RequiredArgsConstructor
public class AlunoResource {

	private final AlunoService service;

	@GetMapping(path = "buscaLista")
	public ResponseEntity<List<AlunoVO>> buscaLista() {
		List<AlunoVO> alunos = service.buscaListaAlunoVO();
		if (alunos.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<AlunoVO>>(alunos, HttpStatus.OK);
	}

	@PostMapping(path = "buscaLista/byId")
	public ResponseEntity<AlunoVO> buscaListaById(@RequestBody AlunoVO vo) {
		AlunoVO aluno = service.buscaListaAlunoVOById(vo);
		if (Objects.isNull(aluno)) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<AlunoVO>(aluno, HttpStatus.OK);
	}

	@PostMapping(path = "inserir")
	public ResponseEntity<String> salvarNovoAluno(@RequestBody AlunoCompletoVO vo) {
		try {
			service.salvarAluno(vo);
			return new ResponseEntity<String>("Registro salvo com sucesso.", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao salvar registro.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PostMapping("editar")
	public ResponseEntity<String> editarAluno(@RequestBody AlunoCompletoVO vo) {
		try {
			service.editarAluno(vo);
			return new ResponseEntity<String>("Registro salvo com sucesso.", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Erro ao salvar registro.", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
