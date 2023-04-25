package com.sistema.examenes.sistemaexamenesback.Servicios.Impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistema.examenes.sistemaexamenesback.Entidades.Usuario;
import com.sistema.examenes.sistemaexamenesback.Entidades.UsuarioRol;
import com.sistema.examenes.sistemaexamenesback.Repositorios.RolRepository;
import com.sistema.examenes.sistemaexamenesback.Repositorios.UsuarioRepository;
import com.sistema.examenes.sistemaexamenesback.Servicios.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Usuario guardarUsuario(Usuario usuario, Set<UsuarioRol> usuarioRoles) throws Exception {

        Usuario usuarioLocal = usuarioRepository.findByUsername(usuario.getUsername());
        if (usuarioLocal != null) {
            System.out.println("Ya existe");
            throw new Exception("Ya esta el usuario", null);
        } else {
            for (UsuarioRol usuarioRol : usuarioRoles) {
                rolRepository.save(usuarioRol.getRol());
            }

            usuario.getUsuarioRoles().addAll(usuarioRoles);
            usuarioLocal = usuarioRepository.save(usuario);
        }

        return usuarioLocal;
    }

    @Override
    public Usuario obtenerUsuario(String username) {

        return usuarioRepository.findByUsername(username);
    }

    @Override
    public void eliminarUsuario(Long usuarioId) {
        usuarioRepository.deleteById(usuarioId);
    }

}
