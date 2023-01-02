package com.baccarin.universidade.domain;

import com.baccarin.universidade.vo.DisciplinaVO;

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
@Table(name = "disciplina", schema = "universidade")
public class Disciplina {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false, updatable = false)
	private Long id;

	@Column(name = "nome", nullable = false, updatable = true, unique = true)
	private String nome;

	@Column(name = "duracao", nullable = false, updatable = true)
	private Integer duracao;

	@OneToOne
	@JoinColumn(name = "id_turno", nullable = false, unique = true)
	private TurnoDisciplina turno;
	
	public Disciplina(DisciplinaVO vo) {
		this.id = vo.getId();
		this.nome = vo.getNome();
		this.duracao = vo.getDuracao();
		this.getTurno().setId(vo.getIdTurno());
	}
}
