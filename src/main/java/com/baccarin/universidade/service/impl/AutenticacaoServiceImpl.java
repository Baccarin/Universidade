package com.baccarin.universidade.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baccarin.universidade.repository.api.AlunoRepository;
import com.baccarin.universidade.repository.api.SexoRepository;
import com.baccarin.universidade.service.AutenticacaoService;
import com.baccarin.universidade.vo.AutenticacaoVO;

import lombok.AllArgsConstructor;

@Transactional
@Service
@AllArgsConstructor
public class AutenticacaoServiceImpl implements AutenticacaoService {

	@Override
	public String logarSistema(AutenticacaoVO vo) {
		// TODO Auto-generated method stub
		return null;
	}

}
