package com.afigueroa.cajaregistradora2.igu;

import Utilidades.FuncionesGui;
import com.afigueroa.cajaregistradora2.logica.ControLogica;
import com.afigueroa.cajaregistradora2.logica.Producto;
import com.afigueroa.cajaregistradora2.logica.Sesion;
import com.afigueroa.cajaregistradora2.logica.Usuario;
import java.util.List;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class VerProductos extends javax.swing.JFrame {

    private final ControladoraGui control;
    ControLogica controladoraLogica = new ControLogica();
    Usuario usuarioActual = Sesion.getUsuarioLogueado();

    public VerProductos(ControladoraGui control) {
        initComponents();
        this.control = control;
        esterelizarBotones();
        configurarListenerTabla(); // Llama al método para configurar el comportamiento de la tabla
        aplicarRestriccionesRol(usuarioActual);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlGeneral = new javax.swing.JPanel();
        pnlCuerpo = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnNuevoProducto = new javax.swing.JButton();
        chkMostrarInactivos = new javax.swing.JCheckBox();
        btnEditar = new javax.swing.JButton();
        btnActivarDesactivar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProducto = new javax.swing.JTable();
        lblProductos = new javax.swing.JLabel();
        pnlAtras = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlGeneral.setBackground(new java.awt.Color(242, 245, 249));
        pnlGeneral.setLayout(new java.awt.BorderLayout());

        pnlCuerpo.setLayout(new java.awt.BorderLayout());

        pnlBotones.setLayout(new java.awt.GridBagLayout());

        btnNuevoProducto.setFont(new java.awt.Font("Poppins Medium", 2, 14)); // NOI18N
        btnNuevoProducto.setText("Nuevo");
        btnNuevoProducto.setIconTextGap(6);
        btnNuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 71;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        pnlBotones.add(btnNuevoProducto, gridBagConstraints);

        chkMostrarInactivos.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        chkMostrarInactivos.setForeground(new java.awt.Color(0, 15, 42));
        chkMostrarInactivos.setText("Mostrar Inactivos");
        chkMostrarInactivos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chkMostrarInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMostrarInactivosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 21;
        gridBagConstraints.ipady = 27;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        pnlBotones.add(chkMostrarInactivos, gridBagConstraints);

        btnEditar.setFont(new java.awt.Font("Poppins Medium", 2, 14)); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setIconTextGap(6);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        pnlBotones.add(btnEditar, gridBagConstraints);

        btnActivarDesactivar.setText("Activar/Desactivar");
        btnActivarDesactivar.setEnabled(false);
        btnActivarDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarDesactivarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        pnlBotones.add(btnActivarDesactivar, gridBagConstraints);

        pnlCuerpo.add(pnlBotones, java.awt.BorderLayout.EAST);

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new java.awt.BorderLayout());

        jScrollPane3.setPreferredSize(new java.awt.Dimension(600, 400));

        tablaProducto.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
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

        jPanel4.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        lblProductos.setFont(new java.awt.Font("Poppins Medium", 2, 24)); // NOI18N
        lblProductos.setText("Productos");
        jPanel4.add(lblProductos, java.awt.BorderLayout.PAGE_START);

        pnlCuerpo.add(jPanel4, java.awt.BorderLayout.CENTER);

        pnlGeneral.add(pnlCuerpo, java.awt.BorderLayout.CENTER);

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/afigueroa/cajaregistradora2/igu/Icons/flecha-hacia-atras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAtrasLayout = new javax.swing.GroupLayout(pnlAtras);
        pnlAtras.setLayout(pnlAtrasLayout);
        pnlAtrasLayout.setHorizontalGroup(
            pnlAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlAtrasLayout.setVerticalGroup(
            pnlAtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAtrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlGeneral.add(pnlAtras, java.awt.BorderLayout.PAGE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            Producto productoSeleccionado = controladoraLogica.traerProducto(codigoProducto);
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
        if (usuarioActual.getRol().getNombreRol().equalsIgnoreCase("admin")) {
            System.out.println("ENtro");
            control.mostrarAdmin();
        }else{
            control.mostrarPrincipal();
        }

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

    private void aplicarRestriccionesRol(Usuario usuario) {

        if (usuario != null && usuario.getRol().getNombreRol().equalsIgnoreCase("cajero")) {

            // Ocultamos los botones de gestión
            pnlBotones.setVisible(false);
        }
    }

    private void esterelizarBotones() {
        FuncionesGui.estilizarBoton(btnEditar, "edit.svg");
        FuncionesGui.estilizarBoton(btnNuevoProducto, "add.svg");
        FuncionesGui.estilizarBotonAtras(btnAtras);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivarDesactivar;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNuevoProducto;
    private javax.swing.JCheckBox chkMostrarInactivos;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblProductos;
    private javax.swing.JPanel pnlAtras;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCuerpo;
    private javax.swing.JPanel pnlGeneral;
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
                FuncionesGui.mostrarMensaje("No hay productos inactivos para mostrar.", "Info", "Información");
                chkMostrarInactivos.setSelected(false);
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
