package com.afigueroa.cajaregistradora2.igu;

import Utilidades.AlertaRecarga;
import com.afigueroa.cajaregistradora2.logica.Usuario;

public class ControladoraGui {

    private javax.swing.JFrame ventanaActual;

    public void iniciar() {
        Login ventana = new Login(this);
        mostrarVentana(ventana);
    }

    public void mostrarVenta() {
        Compra ventana = new Compra(this);
        mostrarVentana(ventana);
    }

    public void mostrarProductos() {

        VerProductos ventana = new VerProductos(this);
        mostrarVentana(ventana);
    }

    public void mostrarCargarProducto() {
        CargarProducto ventana = new CargarProducto(this);
        mostrarVentana(ventana);
    }

    public void mostrarAdmin() {
        PAdmin ventana = new PAdmin(this);
        mostrarVentana(ventana);
    }

    void mostrarCrearUsuario() {
        CrearUsuario ventana = new CrearUsuario(this);
        mostrarVentana(ventana);
    }

    void mostrarEditarUsr(long idUsuario, AlertaRecarga accion) {
        EditarUsuario ventana = new EditarUsuario(this, idUsuario, accion);
        mostrarVentana(ventana);
    }

    private void mostrarVentana(javax.swing.JFrame nuevaVentana) {
        // Cerrar ventana actual si existe
        if (ventanaActual != null) {
            ventanaActual.dispose();
        }

        // Mostrar nueva ventana
        nuevaVentana.setVisible(true);
        nuevaVentana.setLocationRelativeTo(null);

        // Actualizar referencia
        ventanaActual = nuevaVentana;
    }

    public void mostrarPrincipal() {
        Principal ventana = new Principal(this);
        mostrarVentana(ventana);
    }

    void mostrarModificarDatos(String codigoproducto) {
        Modificardatos ventana = new Modificardatos(this, codigoproducto);
        mostrarVentana(ventana);
    }

}
