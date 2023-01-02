package com.baccarin.universidade.domain;

import java.time.LocalDate;

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
@Table(name = "autenticacao", schema = "universidade", uniqueConstraints = {})
public class Autenticacao {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "login", nullable = false, updatable = false)
	private String login;
	
	@Column(name = "senha", nullable = false, updatable = false)
	private String senha;
	
	@Column(name = "data_cadastro", nullable = false, updatable = false)
	private LocalDate dataCadastro = LocalDate.now();
	
	@Column(name = "ativo", nullable = false, updatable = true, columnDefinition = "true")
	private boolean ativo;
}
