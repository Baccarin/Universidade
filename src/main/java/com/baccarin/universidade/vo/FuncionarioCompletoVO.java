package com.baccarin.universidade.vo;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioCompletoVO extends FuncionarioVO {

	private LocalDate dataNascimento;
	private Long idSexo;
	private String login;
	private String senha;
	
}
