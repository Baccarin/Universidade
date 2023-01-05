package com.baccarin.universidade.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "funcionario", schema = "universidade", uniqueConstraints = {})
public class Funcionario extends Pessoa {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@OneToOne
	@JoinColumn(name = "tipo_funcionario_id")
	private TipoFuncionario tipo;

	@Column(name = "ativo", nullable = false, updatable = true)
	private boolean ativo = true;

}
