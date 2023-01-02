package com.baccarin.universidade.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.baccarin.universidade.vo.AutenticacaoVO;

public interface AutenticacaoService {

	String logarSistema(AutenticacaoVO vo);
	
	
}
