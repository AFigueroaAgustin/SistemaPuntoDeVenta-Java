
package com.afigueroa.cajaregistradora2.persistencia;

import com.afigueroa.cajaregistradora2.logica.Producto;
import com.afigueroa.cajaregistradora2.logica.Venta;
import com.afigueroa.cajaregistradora2.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersis {
    
    ProductoJpaController productoJpa=new ProductoJpaController();
    VentaJpaController ventaJpa=new VentaJpaController();
    DetalleVentaJpaController detalleVentaJpa=new DetalleVentaJpaController();

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
    
}
