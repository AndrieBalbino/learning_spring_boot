package com.api.learningSpringBoot.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.learningSpringBoot.model.Curso;


public interface CursoRepository extends JpaRepository<Curso, Long> {

	Curso findByNome(String nome);

}
