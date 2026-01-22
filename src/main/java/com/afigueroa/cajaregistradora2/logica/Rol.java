
package com.afigueroa.cajaregistradora2.logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Rol implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombreRol;
    private String descripcion;
    @OneToMany(mappedBy = "rol")
    private List<Usuario> listaUsuarios;

    public Rol() {
    }

    public Rol(long id, String nombreRol, String descripcion, List<Usuario> listaUsuarios) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
        this.listaUsuarios = listaUsuarios;
    }
    // Constructor para listas o combobox
    public Rol(long id, String nombreRol, String descripcion) {
        this.id = id;
        this.nombreRol = nombreRol;
        this.descripcion = descripcion;
    }
    
    

    public List<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

   

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreRol() {
        return nombreRol;
    }

    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return id+" - "+nombreRol.toUpperCase();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (int) (this.id ^ (this.id >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Rol other = (Rol) obj;
        return this.id == other.id;
    }
    
    
    
}
