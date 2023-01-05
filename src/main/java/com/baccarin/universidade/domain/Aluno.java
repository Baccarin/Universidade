package com.baccarin.universidade.domain;

import java.time.LocalDate;

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
@Table(name = "aluno", schema = "universidade", uniqueConstraints = {})
public class Aluno extends Pessoa {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "data_matricula", nullable = true, updatable = false)
	private LocalDate dataMatricula;

	@OneToOne
	@JoinColumn(name = "id_curso", nullable = false, unique = true)
	private Curso curso;
}
