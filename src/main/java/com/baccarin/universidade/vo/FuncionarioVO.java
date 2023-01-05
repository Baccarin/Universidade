package com.baccarin.universidade.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FuncionarioVO {

	private Long idFuncionario;
	private Long idTipoFuncionario;
	private String descricaoTipoFuncionario;
	
	private String nome;

}
