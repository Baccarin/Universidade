package com.baccarin.universidade.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baccarin.universidade.service.AutenticacaoService;
import com.baccarin.universidade.vo.AutenticacaoVO;

import lombok.RequiredArgsConstructor;

@Transactional
@RestController("universidade")
@RequiredArgsConstructor
public class AutenticacaoResource {

	private final AutenticacaoService service;

	@GetMapping("/login")
	public ResponseEntity<AutenticacaoVO> logar(@RequestBody AutenticacaoVO vo) {
		String token;

		return null;
	}

}
