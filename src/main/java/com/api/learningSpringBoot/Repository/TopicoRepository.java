package com.api.learningSpringBoot.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.learningSpringBoot.model.Topico;


public interface TopicoRepository extends JpaRepository<Topico, Long> {

	List<Topico> findByCursoNome(String nomeCurso);

}
