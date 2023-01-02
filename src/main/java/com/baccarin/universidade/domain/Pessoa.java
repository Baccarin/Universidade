package com.baccarin.universidade.domain;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "pessoa", schema = "universidade", uniqueConstraints = {})
public class Pessoa {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "nome", nullable = false, updatable = true)
	private String nome;

	@Column(name = "data_nascimento", nullable = true, updatable = false)
	private LocalDate dataNascimento;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_sexo", nullable = false, updatable = true)
	private Sexo sexo;
	
	@OneToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "autenticacao_id", nullable = false, updatable = true)
	private Autenticacao autenticacao;
}
