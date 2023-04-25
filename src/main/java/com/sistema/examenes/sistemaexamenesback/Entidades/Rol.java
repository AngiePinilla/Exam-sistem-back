package com.sistema.examenes.sistemaexamenesback.Entidades;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Rol {
    
    @Id
    private Long rolId;
    private String name; 

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "rol")
    private Set<UsuarioRol> usuarioRoles = new HashSet<>();


    public Rol() {
    }

    public Rol(Long rolId, String name, Set<UsuarioRol> usuarioRoles) {
        this.rolId = rolId;
        this.name = name;
        this.usuarioRoles = usuarioRoles;
    }

    public Long getRolId() {
        return rolId;
    }

    public void setRolId(Long rolId) {
        this.rolId = rolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<UsuarioRol> getUsuarioRoles() {
        return usuarioRoles;
    }

    public void setUsuarioRoles(Set<UsuarioRol> usuarioRoles) {
        this.usuarioRoles = usuarioRoles;
    }

    

}
