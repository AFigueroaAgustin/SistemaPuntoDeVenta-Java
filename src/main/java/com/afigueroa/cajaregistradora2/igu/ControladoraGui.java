package com.afigueroa.cajaregistradora2.igu;

import com.afigueroa.cajaregistradora2.logica.ControLogica;
import com.afigueroa.cajaregistradora2.logica.Producto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ControladoraGui {

    private javax.swing.JFrame ventanaActual;
    private ControLogica controladoraLogica=new ControLogica();
    
    private DefaultTableModel modeloProductos;

    public void iniciar() {
        Principal ventana = new Principal(this);
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
      
      public void mostrarCargarProducto(){
          CargarProducto ventana= new CargarProducto(this);
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

    void mostrarPrincipal() {
        iniciar();
    }

    void mostrarModificarDatos(String codigoproducto) {
        Modificardatos ventana=new Modificardatos(this,codigoproducto);
    }

        
    }
    
    
    


