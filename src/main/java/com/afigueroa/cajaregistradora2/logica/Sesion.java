
package com.afigueroa.cajaregistradora2.logica;

public class Sesion {
    private static Usuario usuarioLogueado;
    
    private Sesion() {
    }

    public static Usuario getUsuarioLogueado() {
        return usuarioLogueado;
    }

    public static void setUsuarioLogueado(Usuario usuarioLogueado) {
        Sesion.usuarioLogueado = usuarioLogueado;
    }
    
    // Limpiar al cerrar sesión
    public static void cerrarSesion() {
        usuarioLogueado = null;
    }
}
