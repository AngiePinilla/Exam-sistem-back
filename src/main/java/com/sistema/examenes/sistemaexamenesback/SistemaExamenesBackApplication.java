package com.sistema.examenes.sistemaexamenesback;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sistema.examenes.sistemaexamenesback.Entidades.Rol;
import com.sistema.examenes.sistemaexamenesback.Entidades.Usuario;
import com.sistema.examenes.sistemaexamenesback.Entidades.UsuarioRol;
import com.sistema.examenes.sistemaexamenesback.Servicios.UsuarioService;

@SpringBootApplication
public class SistemaExamenesBackApplication implements CommandLineRunner {

	@Autowired
	private UsuarioService usuarioService; 

	public static void main(String[] args) {
		SpringApplication.run(SistemaExamenesBackApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/* Usuario usuario = new Usuario();

		usuario.setName("Anhy");
		usuario.setLastname("pini");
		usuario.setUsername("Anhyyy");
		usuario.setPassword("123");
		usuario.setEmail("Anhy@gmail.co");
		usuario.setPhone("123456");
		usuario.setProfile("Anhy.png");

		Rol rol = new Rol();
		rol.setRolId(1L);
		rol.setName("ADMIN");

		Set<UsuarioRol> usuarioRoles = new HashSet<>();
		UsuarioRol usuarioRol = new UsuarioRol();
		usuarioRol.setRol(rol);
		usuarioRol.setUsuario(usuario);
		usuarioRoles.add(usuarioRol);

		Usuario usuarioGuardado = usuarioService.guardarUsuario(usuario, usuarioRoles);
		System.out.println(usuarioGuardado.getUsername());*/
	}

}
