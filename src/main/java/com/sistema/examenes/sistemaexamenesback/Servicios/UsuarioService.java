package com.sistema.examenes.sistemaexamenesback.Servicios;

import java.util.Set;

import com.sistema.examenes.sistemaexamenesback.Entidades.Usuario;
import com.sistema.examenes.sistemaexamenesback.Entidades.UsuarioRol;

public interface UsuarioService {
    
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception;

    public Usuario obtenerUsuario(String username);

    public void eliminarUsuario(Long usuarioId);

}
