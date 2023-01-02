package com.baccarin.universidade.resource;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RestController;

import com.baccarin.universidade.service.DisciplinaService;

import lombok.RequiredArgsConstructor;

@Transactional
@RestController("universidade/disciplina")
@RequiredArgsConstructor
public class DisciplinaResource {

	private final DisciplinaService service;
	
	
}
