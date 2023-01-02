package com.baccarin.universidade.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "disciplina", schema = "universidade", uniqueConstraints = {})
public class Disciplina {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;
	
	@Column(name = "nome", nullable = false, updatable = true)
	private String nome;
	
	@Column(name = "duracao", nullable = false, updatable = true)
	private Integer duracao;
}
