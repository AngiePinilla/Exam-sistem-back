package com.sistema.examenes.sistemaexamenesback.Controladores;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sistema.examenes.sistemaexamenesback.Entidades.Rol;
import com.sistema.examenes.sistemaexamenesback.Entidades.Usuario;
import com.sistema.examenes.sistemaexamenesback.Entidades.UsuarioRol;
import com.sistema.examenes.sistemaexamenesback.Servicios.UsuarioService;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/")
    public Usuario guardUsuario(@RequestBody Usuario usuario) throws Exception {
        usuario.setProfile("default.png");
        Set<UsuarioRol> usuarioRoles = new HashSet<>();
        Rol rol = new Rol();
        rol.setRolId(2L);
        rol.setName("NORMAL");

        UsuarioRol usuarioRol = new UsuarioRol();
        usuarioRol.setUsuario(usuario);
        usuarioRol.setRol(rol);
        usuarioRoles.add(usuarioRol);

        return usuarioService.guardarUsuario(usuario, usuarioRoles);
    }

    @GetMapping("/{username}")
    public Usuario obteUsuario(@PathVariable("username") String username) {
        return usuarioService.obtenerUsuario(username);
    }

    @DeleteMapping("/{usuarioId}")
    public void eliminarUsuario(@PathVariable("usuarioId") Long usuarioId) {
        usuarioService.eliminarUsuario(usuarioId);
    }

}
