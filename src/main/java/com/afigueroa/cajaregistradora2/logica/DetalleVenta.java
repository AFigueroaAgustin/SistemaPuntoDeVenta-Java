package com.afigueroa.cajaregistradora2.logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class DetalleVenta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idDetalleVenta;
    private int cant; // cantidad por comprar
    private float precioUnitarioVenta; // precio de esa venta

    @ManyToOne
    @JoinColumn(name = "idVenta")
    private Venta venta;
    @ManyToOne
    @JoinColumn(name="idProducto")
    private Producto producto;
    
    public DetalleVenta() {
    }

    public DetalleVenta(int idDetalleVenta, int cant, float precioUnitarioVenta, Venta venta, Producto producto) {
        this.idDetalleVenta = idDetalleVenta;
        this.cant = cant;
        this.precioUnitarioVenta = precioUnitarioVenta;
        this.venta = venta;
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    

   

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }


    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public float getPrecioUnitarioVenta() {
        return precioUnitarioVenta;
    }

    public void setPrecioUnitarioVenta(float precioUnitarioVenta) {
        this.precioUnitarioVenta = precioUnitarioVenta;
    }
    
    
    
    
    
}
