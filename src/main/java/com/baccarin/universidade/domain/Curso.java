package com.baccarin.universidade.domain;

import java.util.ArrayList;
import java.util.List;

import com.baccarin.universidade.vo.CursoVO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "curso", schema = "universidade", uniqueConstraints = {})
public class Curso {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "nome", nullable = false, updatable = true)
	private String nome;

	@Column(name = "duracao", nullable = false, updatable = true)
	private Integer duracao;

	@ManyToMany
	@JoinTable(name = "curso_disciplina", joinColumns = { @JoinColumn(name = "curso_id") }, inverseJoinColumns = {
			@JoinColumn(name = "disciplina_id") })
	private List<Disciplina> disciplinas = new ArrayList<>();

	public Curso(CursoVO vo) {
		this.id = vo.getId();
		this.nome = vo.getNome();
		this.duracao = vo.getDuracao();
	}

}
