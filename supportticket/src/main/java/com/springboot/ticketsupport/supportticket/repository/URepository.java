package com.springboot.ticketsupport.supportticket.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.ticketsupport.supportticket.models.Usuario;

@Repository
public interface URepository  extends JpaRepository<Usuario, Long>{
    
    Optional<Usuario> findByNombre(String nombre_usuario);
}
