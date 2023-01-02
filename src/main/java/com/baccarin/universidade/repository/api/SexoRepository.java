package com.baccarin.universidade.repository.api;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.baccarin.universidade.domain.Sexo;

@Repository
public interface SexoRepository extends JpaRepository<Sexo, Long>{

}
