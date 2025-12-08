package com.afigueroa.cajaregistradora2.igu;

import Utilidades.FuncionesGui;
import com.afigueroa.cajaregistradora2.logica.ControLogica;
import com.afigueroa.cajaregistradora2.logica.DetalleVenta;
import com.afigueroa.cajaregistradora2.logica.Producto;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Compra extends javax.swing.JFrame {

    private ControladoraGui control;

    ControLogica controladoraLogica = new ControLogica();

    public Compra(ControladoraGui control) {
        initComponents();
        FuncionesGui.estilizarBotonAtras(btnAtras);
        FuncionesGui.estilizarBoton(btnCancelarCompra);
        FuncionesGui.estilizarBoton(btnAgregarProducto);
        FuncionesGui.estilizarBoton(bntFinalizarCompra);
        FuncionesGui.estilizarBoton(bntEliminarProducto);
        FuncionesGui.estilizarBoton(btnCambiarCantidad);

        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaProducto2 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaProductoSelec = new javax.swing.JTable();
        btnAgregarProducto = new javax.swing.JButton();
        txtEscaner = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnCancelarCompra = new javax.swing.JButton();
        bntEliminarProducto = new javax.swing.JButton();
        bntFinalizarCompra = new javax.swing.JButton();
        btnCambiarCantidad = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        tablaProducto2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablaProducto2);

        tablaProductoSelec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaProductoSelec);

        btnAgregarProducto.setBackground(new java.awt.Color(229, 231, 235));
        btnAgregarProducto.setFont(new java.awt.Font("Poppins Medium", 1, 12)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(30, 41, 59));
        btnAgregarProducto.setText("Agregar");
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        txtEscaner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEscanerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtEscaner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(239, 239, 239)
                        .addComponent(btnAgregarProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEscaner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnCancelarCompra.setBackground(new java.awt.Color(254, 242, 242));
        btnCancelarCompra.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        btnCancelarCompra.setForeground(new java.awt.Color(255, 0, 0));
        btnCancelarCompra.setText("Cancelar Compra");
        btnCancelarCompra.setPreferredSize(new java.awt.Dimension(165, 33));
        btnCancelarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarCompraActionPerformed(evt);
            }
        });

        bntEliminarProducto.setBackground(new java.awt.Color(254, 242, 242));
        bntEliminarProducto.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        bntEliminarProducto.setForeground(new java.awt.Color(255, 0, 0));
        bntEliminarProducto.setText("Eliminar Producto");
        bntEliminarProducto.setPreferredSize(new java.awt.Dimension(165, 33));
        bntEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntEliminarProductoActionPerformed(evt);
            }
        });

        bntFinalizarCompra.setBackground(new java.awt.Color(37, 99, 235));
        bntFinalizarCompra.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        bntFinalizarCompra.setText("Finalizar Compra");
        bntFinalizarCompra.setPreferredSize(new java.awt.Dimension(165, 33));
        bntFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntFinalizarCompraActionPerformed(evt);
            }
        });

        btnCambiarCantidad.setBackground(new java.awt.Color(254, 242, 242));
        btnCambiarCantidad.setFont(new java.awt.Font("Poppins Medium", 1, 14)); // NOI18N
        btnCambiarCantidad.setForeground(new java.awt.Color(0, 0, 0));
        btnCambiarCantidad.setText("Cambiar Cantidad");
        btnCambiarCantidad.setMaximumSize(new java.awt.Dimension(165, 33));
        btnCambiarCantidad.setMinimumSize(new java.awt.Dimension(165, 33));
        btnCambiarCantidad.setPreferredSize(new java.awt.Dimension(165, 33));
        btnCambiarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarCantidadActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnCancelarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(bntEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCambiarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(bntFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCambiarCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/afigueroa/cajaregistradora2/igu/Icons/flecha-hacia-atras.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        control.mostrarPrincipal();
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCancelarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarCompraActionPerformed
        controladoraLogica.vaciarCarrito();
        cargarTablaCarrito(); // Actualizar la tabla vacía
        FuncionesGui.mostrarMensaje("Compra Cancelada. El carrito se ha vaciado.", "Info", "Cancelación");
    }//GEN-LAST:event_btnCancelarCompraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargartablaProducto();
        cargarTablaCarrito();
        txtEscaner.requestFocus(); // Se enfoca el cursor en el espacio donde va el codigo
    }//GEN-LAST:event_formWindowOpened

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed

        //OBTENER el Codigo del producto seleccionado
        Integer filaSeleccionada = tablaProducto2.getSelectedRow();

        if (filaSeleccionada != -1) {

            String codigoProducto = String.valueOf(tablaProducto2.getValueAt(filaSeleccionada, 0));

            // Pido la Cantidad
            String sCantidad = FuncionesGui.mostrarMensajeInput("Ingrese la cantidad a agregar: ", "Cantidad");
            try {
                int cantidad = Integer.parseInt(sCantidad);
                boolean agregadoExitoso = controladoraLogica.agregarProductoAcarrito(codigoProducto, cantidad);

                if (agregadoExitoso) {
                    cargarTablaCarrito(); // Solo actualiza si fue exitoso
                    FuncionesGui.mostrarMensaje("Producto agregado al carrito.", "Éxito", "Información");
                } else {
                    // Aquí el método falló por: producto no encontrado, stock insuficiente, o cantidad <= 0
                    FuncionesGui.mostrarMensaje("No se pudo cambiar: Stock insuficiente o cantidad inválida.", "Advertencia", "Error");
                }
            } catch (NumberFormatException e) {
                FuncionesGui.mostrarMensaje("Ingrese una cantidad válida.(Solo nuemeros)", "Error", "Error de entrada");
            }
        } else {
            FuncionesGui.mostrarMensaje("Seleccione un producto para agregar.", "Advertencia", "Error");
        }
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    private void bntFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntFinalizarCompraActionPerformed
        float total = controladoraLogica.calcularTotalVenta();

        if (total > 0) {
            // Pide el método de pago
            String metodoPago = FuncionesGui.mostrarMensajeInput("Total a pagar: $" + total + "\nIngrese Método de Pago:", "Finalizar Venta");

            if (metodoPago != null && !metodoPago.trim().isEmpty()) {
                controladoraLogica.finalizarVenta(metodoPago, total);

                FuncionesGui.mostrarMensaje("Venta finalizada con éxito. Total: $" + total + " (" + metodoPago + ")", "Éxito", "Información");
                cargarTablaCarrito(); // Refresca la tabla del carrito 
                cargartablaProducto(); //ver el stock actualizado
            } else {
                FuncionesGui.mostrarMensaje("Operación de venta cancelada.", "Advertencia", "Alerta");
            }
        } else {
            FuncionesGui.mostrarMensaje("El carrito está vacío. Agregue productos para finalizar la venta.", "Advertencia", "Alerta");
        }
    }//GEN-LAST:event_bntFinalizarCompraActionPerformed

    private void bntEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntEliminarProductoActionPerformed
        String codigoProducto = FuncionesGui.getCodigoFilaSelecionada(tablaProductoSelec);
        if (codigoProducto == null) {
            FuncionesGui.mostrarMensaje("Debe Seleccionar un Producto", "Error", "Error");
        } else {

            // Llamo al metodo
            controladoraLogica.borrarProductoDelCarrito(codigoProducto);
            // Aviso al usuario
            FuncionesGui.mostrarMensaje("Producto Eliminado Correctamente", "Info", "Eliminado Exitosamente");
            cargarTablaCarrito();
        }
    }//GEN-LAST:event_bntEliminarProductoActionPerformed

    private void txtEscanerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEscanerActionPerformed
        String codigoBarras = txtEscaner.getText();
        //String sCantidad = FuncionesGui.mostrarMensajeInput("Ingrese la cantidad a agregar", "Nueva Compra");
        try {
            //int cantidad = Integer.parseInt(sCantidad);
            boolean agregadoExitoso = controladoraLogica.agregarProductoAcarrito(codigoBarras, 1);

            if (agregadoExitoso) {
                cargarTablaCarrito(); // Solo actualiza si fue exitoso
                txtEscaner.setText("");
                txtEscaner.requestFocus();
                FuncionesGui.mostrarMensaje("Producto agregado al carrito.", "Éxito", "Información");
            } else {
                // Aquí el método falló por: producto no encontrado, stock insuficiente, o cantidad <= 0
                FuncionesGui.mostrarMensaje("Error al agregar. Verifique el stock o el código del producto.", "Advertencia", "Error");
            }
        } catch (NumberFormatException e) {
            FuncionesGui.mostrarMensaje("Ingrese una cantidad válida.", "Error", "Error de entrada");
        }

    }//GEN-LAST:event_txtEscanerActionPerformed

    private void btnCambiarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarCantidadActionPerformed
        String codigoProducto = FuncionesGui.getCodigoFilaSelecionada(tablaProductoSelec);
        if (codigoProducto != null) {
            try {
                String sCantidad = FuncionesGui.mostrarMensajeInput("Ingrese la cantidad exacta", "Cambio de Cantidad");
                int cantidad = Integer.parseInt(sCantidad);
                boolean cambioExitoso=controladoraLogica.cambiarCantidadProducto(codigoProducto, cantidad);
                if (!cambioExitoso) {
                     FuncionesGui.mostrarMensaje("Error al agregar. Verifique el stock o el código del producto.", "Advertencia", "Error");
                }
                cargarTablaCarrito();
            } catch (NumberFormatException e) {
                FuncionesGui.mostrarMensaje("Ingrese una cantidad válida.", "Error", "Error de entrada");
            }
        } else {
            FuncionesGui.mostrarMensaje("Debe Seleccionar un Producto", "Error", "Error");
        }
    }//GEN-LAST:event_btnCambiarCantidadActionPerformed

    private void cargartablaProducto() {
        List<Producto> inventario = controladoraLogica.traerProductos();
        FuncionesGui.cargarTablaProductos(tablaProducto2, inventario);
    }

    private void cargarTablaCarrito() {
        List<DetalleVenta> carrito = controladoraLogica.obtenerCarrito();
        FuncionesGui.cargarTablaCarrito(tablaProductoSelec, carrito);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntEliminarProducto;
    private javax.swing.JButton bntFinalizarCompra;
    private javax.swing.JButton btnAgregarProducto;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCambiarCantidad;
    private javax.swing.JButton btnCancelarCompra;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaProducto2;
    private javax.swing.JTable tablaProductoSelec;
    private javax.swing.JTextField txtEscaner;
    // End of variables declaration//GEN-END:variables

}
