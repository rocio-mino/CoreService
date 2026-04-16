package com.CoreService.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.CoreService.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Long, Usuario>{

    Optional<Usuario> findByEmail(String email);
}
