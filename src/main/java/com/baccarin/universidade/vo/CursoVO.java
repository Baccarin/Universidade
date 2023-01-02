package com.baccarin.universidade.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CursoVO {

	private Long id;
	private String nome;
	private Integer duracao;
}
