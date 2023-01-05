package com.baccarin.universidade.resource;

import java.util.List;
import java.util.Objects;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baccarin.universidade.service.CursoService;
import com.baccarin.universidade.vo.CursoVO;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Transactional
@RestController
@RequestMapping("universidade/curso")
@AllArgsConstructor
class CursoResource {

	private final CursoService service;

	@GetMapping(path = "buscaLista")
	public ResponseEntity<List<CursoVO>> buscaLista() {
		List<CursoVO> cursos = service.buscaListaCursoVO();
		if (cursos.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<CursoVO>>(cursos, HttpStatus.OK);
	}

	@PostMapping(path = "buscaLista/byId")
	public ResponseEntity<CursoVO> buscaListaById(@RequestBody CursoVO vo) {
		CursoVO curso = service.buscaListaCursoVOById(vo);
		if (Objects.isNull(curso)) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<CursoVO>(curso, HttpStatus.OK);
	}

	@PostMapping(path = "buscaLista/byFiltro")
	public ResponseEntity<List<CursoVO>> buscaListaByFiltro(@RequestBody CursoVO vo) {
		List<CursoVO> cursos = service.buscaListaGeralCursoVOByFiltro(vo);
		if (cursos.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<CursoVO>>(cursos, HttpStatus.OK);
	}

	@PostMapping(path = "inserir")
	public ResponseEntity<String> salvaNovoCurso(@RequestBody CursoVO vo) {
		try {
			service.salvarCurso(vo);
			return new ResponseEntity<String>("Registro salvo com sucesso.", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("editar")
	public ResponseEntity<String> editarAluno(@RequestBody CursoVO vo) {
		try {
			service.editarCurso(vo);
			return new ResponseEntity<String>("Registro salvo com sucesso.", HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
