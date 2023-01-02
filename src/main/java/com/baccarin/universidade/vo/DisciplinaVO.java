package com.baccarin.universidade.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DisciplinaVO {

	private Long id;
	private String nome;
	private Long idTurno;
	private Integer duracao;
}
