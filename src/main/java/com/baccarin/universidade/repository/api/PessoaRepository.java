package com.baccarin.universidade.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;

import com.baccarin.universidade.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
