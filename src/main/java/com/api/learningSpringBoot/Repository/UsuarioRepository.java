package com.api.learningSpringBoot.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.learningSpringBoot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	Optional<Usuario> findByEmail(String email);
	
}
