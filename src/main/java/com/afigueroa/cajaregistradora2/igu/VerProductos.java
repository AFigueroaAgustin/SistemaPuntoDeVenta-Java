package com.afigueroa.cajaregistradora2.igu;

import Utilidades.FuncionesGui;
import com.afigueroa.cajaregistradora2.logica.ControLogica;
import com.afigueroa.cajaregistradora2.logica.Producto;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class VerProductos extends javax.swing.JFrame {

    private ControladoraGui control;

    ControLogica controladoraLogica = new ControLogica();

    public VerProductos(ControladoraGui control) {
        initComponents();
        FuncionesGui.estilizarBoton(btnEditar,"edit.svg");
        FuncionesGui.estilizarBoton(btnNuevoProducto,"add.svg");
        FuncionesGui.estilizarBotonAtras(btnAtras);
        FuncionesGui.estilizarBoton(btnReporteVenta,"ReporteVenta.svg");
        this.control = control;
        configurarListenerTabla(); // Llama al método para configurar el comportamiento de la tabla
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEditar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnNuevoProducto = new javax.swing.JButton();
        chkMostrarInactivos = new javax.swing.JCheckBox();
        btnActivarDesactivar = new javax.swing.JButton();
        btnReporteVenta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(242, 245, 249));

        btnEditar.setFont(new java.awt.Font("Poppins Medium", 2, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setIconTextGap(6);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tablaProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaProducto);

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 2, 14)); // NOI18N
        jLabel4.setText("Productos");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 688, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 557, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/afigueroa/cajaregistradora2/igu/Icons/flecha-hacia-atras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnNuevoProducto.setFont(new java.awt.Font("Poppins Medium", 2, 14)); // NOI18N
        btnNuevoProducto.setText("Nuevo");
        btnNuevoProducto.setIconTextGap(6);
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });

        chkMostrarInactivos.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        chkMostrarInactivos.setForeground(new java.awt.Color(0, 15, 42));
        chkMostrarInactivos.setText("Mostrar Inactivos");
        chkMostrarInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarInactivosActionPerformed(evt);
            }
        });

        btnActivarDesactivar.setText("Activar/Desactivar");
        btnActivarDesactivar.setEnabled(false);
        btnActivarDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarDesactivarActionPerformed(evt);
            }
        });

        btnReporteVenta.setFont(new java.awt.Font("Poppins Medium", 2, 14)); // NOI18N
        btnReporteVenta.setText("Reporte Ventas");
        btnReporteVenta.setIconTextGap(6);
        btnReporteVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteVentaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(btnNuevoProducto, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(chkMostrarInactivos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnActivarDesactivar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReporteVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(404, 404, 404)
                        .addComponent(jLabel1)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(313, 313, 313)
                .addComponent(chkMostrarInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnNuevoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnActivarDesactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReporteVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void configurarListenerTabla() {
        // Establece el modo de selección a una sola fila
        tablaProducto.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //

        // Agrega un listener que se activa cuando cambia la fila seleccionada
        tablaProducto.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent event) {
                // getValueIsAdjusting es true mientras el usuario está interactuando (ej. arrastrando)
                // Solo actuamos cuando la selección se ha completado y hay una fila válida seleccionada
                if (!event.getValueIsAdjusting() && tablaProducto.getSelectedRow() != -1) { //
                    // Llama al método para actualizar el botón según el producto seleccionado
                    actualizarEstadoBotonActivarDesactivar();
                } else if (tablaProducto.getSelectedRow() == -1) { //
                    // Si no hay ninguna fila seleccionada, deshabilita el botón y pone texto genérico
                    btnActivarDesactivar.setEnabled(false); //
                    btnActivarDesactivar.setText("Activar/Desactivar"); //
                }
            }

        });

        // Deshabilita el botón al inicio hasta que se seleccione una fila
        btnActivarDesactivar.setEnabled(false); //
        btnActivarDesactivar.setText("Activar/Desactivar"); //
    }

    private void actualizarEstadoBotonActivarDesactivar() {
        // Obtiene el índice de la fila seleccionada
        int filaSeleccionada = tablaProducto.getSelectedRow(); //
        // Verifica si hay una fila válida seleccionada
        if (filaSeleccionada != -1) {
            // Obtiene el código del producto de la primera columna (columna 0)
            String codigoProducto = String.valueOf(tablaProducto.getValueAt(filaSeleccionada, 0)); //

            // Determina qué lista de productos usar (completa o solo activos)
            // basándose en si el checkbox "Mostrar Inactivos" está marcado
          Producto productoSeleccionado= controladoraLogica.traerProducto(codigoProducto);
            // Busca el objeto Producto completo en la lista correspondiente al código
            // Si se encontró el producto
            if (productoSeleccionado != null) {
                btnActivarDesactivar.setEnabled(true); // Habilita el botón
                // Cambia el texto del botón según el estado del producto
                if (productoSeleccionado.isActivo()) { //
                    btnActivarDesactivar.setText("Desactivar"); //
                } else {
                    btnActivarDesactivar.setText("Activar"); //
                }
            } else {
                // Si por alguna razón no se encontró el producto, deshabilita el botón
                btnActivarDesactivar.setEnabled(false); //
                btnActivarDesactivar.setText("Activar/Desactivar"); //
            }
        } else {
            // Si no hay fila seleccionada, deshabilita el botón
            btnActivarDesactivar.setEnabled(false); //
            btnActivarDesactivar.setText("Activar/Desactivar"); //
        }
    }

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (tablaProducto.getRowCount() > 0) {
            int filaSeleccionada = tablaProducto.getSelectedRow();
            if (filaSeleccionada != -1) {
                String codigoproducto = FuncionesGui.getCodigoFilaSelecionada(tablaProducto);

                control.mostrarModificarDatos(codigoproducto);

            } else {
                FuncionesGui.mostrarMensaje("No selecciono ningun producto", "Error", "Error");
            }
        } else {
            FuncionesGui.mostrarMensaje("La tabla está vacía, no hay productos para editar", "Error", "Error");
        }

    }//GEN-LAST:event_btnEditarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTabla();
    }//GEN-LAST:event_formWindowOpened

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        control.mostrarPrincipal();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnNuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoProductoActionPerformed
        control.mostrarCargarProducto();
    }//GEN-LAST:event_btnNuevoProductoActionPerformed

    private void btnActivarDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarDesactivarActionPerformed
        // Obtiene el índice de la fila seleccionada en la tabla
        int filaSeleccionada = tablaProducto.getSelectedRow();
        // Verifica si realmente se seleccionó una fila (-1 significa ninguna selección)
        if (filaSeleccionada == -1) {
            // Muestra un mensaje de error si no hay selección
            FuncionesGui.mostrarMensaje("Debe Seleccionar un Producto", "Error", "Error");
            // Sale del método porque no hay nada que hacer
            return;
        }

        // Obtiene el código del producto de la columna 0 de la fila seleccionada
        String codigoProducto = FuncionesGui.getCodigoFilaSelecionada(tablaProducto);
        // Comprueba el texto actual del botón para decidir qué acción tomar
        if (btnActivarDesactivar.getText().equals("Desactivar")) {
            // Llama a la lógica para desactivar el producto
            controladoraLogica.desactivarProducto(codigoProducto);
            FuncionesGui.mostrarMensaje("Producto Desactivado Correctamente", "Info", "Desactivación Exitosa");
        } else if (btnActivarDesactivar.getText().equals("Activar")) {
            // Llama a la lógica para activar el producto
            controladoraLogica.activarProducto(codigoProducto);
            FuncionesGui.mostrarMensaje("Producto Activado Correctamente", "Info", "Activación Exitosa");
        }

        // Recarga la tabla para que se actualice la vista
        cargarTabla();
        // Resetea el botón a su estado inicial (deshabilitado, texto genérico)
        btnActivarDesactivar.setEnabled(false);
        btnActivarDesactivar.setText("Activar/Desactivar");

    }//GEN-LAST:event_btnActivarDesactivarActionPerformed

    private void chkMostrarInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMostrarInactivosActionPerformed
        cargarTabla(); // Recarga la tabla con el filtro correspondiente
    }//GEN-LAST:event_chkMostrarInactivosActionPerformed

    private void btnReporteVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteVentaActionPerformed
        // PEDIR EL REPORTE A LA LÓGICA
        JasperPrint reporte = controladoraLogica.generarReporteVentas();

        if (reporte != null) {
            JasperViewer visor = new JasperViewer(reporte, false); // "false" No cerrar la app al salir
            visor.setTitle("Reporte General de Ventas");
            visor.setVisible(true);
        } else {
            Utilidades.FuncionesGui.mostrarMensaje("No se pudo generar el reporte. Revise la conexión o el archivo.", "Error", "Error al Generar");
        }
    }//GEN-LAST:event_btnReporteVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivarDesactivar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JButton btnReporteVenta;
    private javax.swing.JCheckBox chkMostrarInactivos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tablaProducto;
    // End of variables declaration//GEN-END:variables

    private void cargarTabla() {
        List<Producto> lista;
        boolean mostrarInactivos = chkMostrarInactivos.isSelected(); // Guarda el estado del checkbox
        if (mostrarInactivos) {
            // Si el checkbox está marcado, trae TODOS los productos
            lista = controladoraLogica.traerTodosLosProductos(); //
            // Cuenta cuántos productos inactivos hay en la lista completa
            long cantidadInactivos = lista.stream()
                    .filter(p -> !p.isActivo()) // Filtra los que NO están activos
                    .count(); // Cuenta cuántos son

            if (cantidadInactivos == 0) {
                FuncionesGui.mostrarMensaje("No hay productos inactivos para mostrar.", "Info", "Información"); //
            }
        } else {
            // Si no está marcado, trae solo los ACTIVOS 
            lista = controladoraLogica.traerProductos();
        }

        // Llama a la utilidad para poblar la JTable con la lista obtenida
        FuncionesGui.cargarTablaProductos(tablaProducto, lista);
        // Despues de recargar, resetea el estado del botón Activar/Desactivar
        btnActivarDesactivar.setEnabled(false);
        btnActivarDesactivar.setText("Activar/Desactivar");
    }

}
