package com.sistema.examenes.sistemaexamenesback.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistema.examenes.sistemaexamenesback.Entidades.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long>{

    public Usuario findByUsername(String username);
    
    
    
}
