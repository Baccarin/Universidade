package com.baccarin.universidade.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoVO {

	private Long id;
	private String nome;
	
	public AlunoVO(Long id) {
		this.id = id;
	}

}
