package com.baccarin.universidade.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baccarin.universidade.vo.FuncionarioVO;

import lombok.AllArgsConstructor;

@Transactional
@RestController
@RequestMapping("universidade/funcionario")
@AllArgsConstructor
public class FuncionarioResource {

	private final FuncionarioService service;

	@GetMapping(path = "buscaLista")
	public ResponseEntity<List<FuncionarioVO>> buscaLista() {
		List<FuncionarioVO> funcs = service.buscaListaFuncionariosVO();
		if (funcs.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<FuncionarioVO>>(funcs, HttpStatus.OK);
	}
}
