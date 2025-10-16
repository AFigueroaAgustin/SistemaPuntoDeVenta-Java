package com.afigueroa.cajaregistradora2.logica;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Venta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idVenta;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaVen;
    private float totalVenta;
    private String metodoPago;

    @OneToMany(mappedBy ="venta",cascade = CascadeType.ALL)
    List<DetalleVenta> detalles;
    
    public Venta() {
    }

    @PrePersist
    protected void onCreate(){
        this.fechaVen=new Date();
    }
    
    public Venta(int idVenta, Date fechaVen, float totalVenta, String metodoPago, List<DetalleVenta> detalles) {
        this.idVenta = idVenta;
        this.fechaVen = fechaVen;
        this.totalVenta = totalVenta;
        this.metodoPago = metodoPago;
        this.detalles = detalles;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int id) {
        this.idVenta = id;
    }

    public Date getFechaVen() {
        return fechaVen;
    }

    public void setFechaVen(Date fechaVen) {
        this.fechaVen = fechaVen;
    }

    public float getTotalVenta() {
        return totalVenta;
    }

    public void setTotalVenta(float totalVenta) {
        this.totalVenta = totalVenta;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    public List<DetalleVenta> getDetalles() {
        return detalles;
    }

    public void setDetalles(List<DetalleVenta> detalles) {
        this.detalles = detalles;
    }
    
    
}
