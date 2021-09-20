package com.br.js.JovensSaradosApi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.js.JovensSaradosApi.model.Evento;

@Repository
public interface JpaEvento extends JpaRepository<Evento,Integer>{

}
