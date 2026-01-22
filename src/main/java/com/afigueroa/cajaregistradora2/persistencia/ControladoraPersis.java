package com.afigueroa.cajaregistradora2.persistencia;

import com.afigueroa.cajaregistradora2.logica.Producto;
import com.afigueroa.cajaregistradora2.logica.Rol;
import com.afigueroa.cajaregistradora2.logica.Usuario;
import com.afigueroa.cajaregistradora2.logica.Venta;
import com.afigueroa.cajaregistradora2.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersis {

    ProductoJpaController productoJpa = new ProductoJpaController();
    VentaJpaController ventaJpa = new VentaJpaController();
    DetalleVentaJpaController detalleVentaJpa = new DetalleVentaJpaController();
    UsuarioJpaController usuarioJpa = new UsuarioJpaController();
    RolJpaController rolJpa = new RolJpaController();

    public Producto traerProducto(int id) {
        return productoJpa.findProducto(id);
    }

    public void borrarProducto(int id) {
        try {
            productoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Producto> traerProductos() {
        return productoJpa.findProductoEntities();
    }

    public void cargarProducto(Producto produc) {
        productoJpa.create(produc);
    }

    public Producto traerProductoPorCodigo(String codigoProducto) {
        return productoJpa.findProductoByCodigo(codigoProducto);

    }

    public void modificarProducto(Producto producto) {
        try {
            productoJpa.edit(producto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void guardarVenta(Venta nuevaVenta) {
        ventaJpa.create(nuevaVenta);
    }

    public java.sql.Connection obtenerConexion() {
        return PersistenceManager.getConnection();
    }

    public Usuario buscarUsuario(String nombreUsuario) {
        return usuarioJpa.findUsuarioPorNombre(nombreUsuario);
    }

    public List<Usuario> traerUsuarios() {
        return usuarioJpa.findUsuarioEntities();
    }

    public List<Rol> traerRoles() {
        return rolJpa.findRolEntities();
    }

    public void crearUsuario(Usuario usuario) {
        usuarioJpa.create(usuario);
    }

    public void borrarUsuario(long idUsuario) {
        try {
            usuarioJpa.destroy(idUsuario);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(long idUsuario) {
       return usuarioJpa.findUsuario(idUsuario);
    }

    public void guardarDatosUsr(Usuario usr) {
        try {
            usuarioJpa.edit(usr);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersis.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
}
