package com.baccarin.universidade.resource;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.baccarin.universidade.service.DisciplinaService;

import lombok.AllArgsConstructor;

@Transactional
@RestController
@RequestMapping("universidade/disciplina")
@AllArgsConstructor
class DisciplinaResource {

	private final DisciplinaService service;

}
