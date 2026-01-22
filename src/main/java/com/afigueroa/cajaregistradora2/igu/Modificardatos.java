package com.afigueroa.cajaregistradora2.igu;

import Utilidades.FuncionesGui;
import com.afigueroa.cajaregistradora2.logica.ControLogica;
import com.afigueroa.cajaregistradora2.logica.Producto;
import com.afigueroa.cajaregistradora2.logica.Usuario;


public class Modificardatos extends javax.swing.JFrame {

    private ControladoraGui controlVentana;
    private String codigoProducto;
    private Producto productoAModificar;

    private ControLogica controladoraLogica = new ControLogica();

    public Modificardatos(ControladoraGui controlVentana, String codigoProducto) {
        initComponents();
        FuncionesGui.estilizarBoton(btnGuardarProducto,"save.svg");
        FuncionesGui.estilizarBotonAtras(btnAtras);
        this.controlVentana = controlVentana;
        this.codigoProducto = codigoProducto;
        cargarDatosProducto();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnAtras = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        pnlFormulario = new javax.swing.JPanel();
        txtDescrip = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtPrecioVenta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioCosto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnGuardarProducto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1249, 790));

        jPanel1.setBackground(new java.awt.Color(242, 245, 249));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/afigueroa/cajaregistradora2/igu/Icons/flecha-hacia-atras.png"))); // NOI18N
        btnAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        jPanel2.add(btnAtras, java.awt.BorderLayout.WEST);

        jLabel7.setFont(new java.awt.Font("Poppins Black", 1, 36)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("MODIFICAR DATOS DEL  PRODUCTO");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel7, java.awt.BorderLayout.SOUTH);

        jPanel1.add(jPanel2, java.awt.BorderLayout.NORTH);

        pnlFormulario.setPreferredSize(new java.awt.Dimension(500, 359));

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel3.setText("Cantidad");

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel4.setText("Descripcion");

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel1.setText("Codigo");

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel2.setText("Nombre");

        jLabel5.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel5.setText("Precio Costo");

        jLabel6.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        jLabel6.setText("Precio Venta");

        btnGuardarProducto.setFont(new java.awt.Font("Poppins Medium", 2, 14)); // NOI18N
        btnGuardarProducto.setText("Guardar");
        btnGuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(125, 125, 125)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCodigo)
                            .addComponent(txtNombre)
                            .addComponent(txtCantidad)
                            .addComponent(txtDescrip)
                            .addComponent(txtPrecioCosto)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(546, 546, 546)
                        .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(388, Short.MAX_VALUE))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescrip, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPrecioVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addComponent(btnGuardarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(216, Short.MAX_VALUE))
        );

        jPanel1.add(pnlFormulario, java.awt.BorderLayout.CENTER);

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

    private void btnGuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarProductoActionPerformed
        String errorMensaje = controladoraLogica.validarDatos(
                txtCodigo.getText(),
                txtNombre.getText(),
                txtCantidad.getText(),
                txtDescrip.getText(),
                txtPrecioCosto.getText(),
                txtPrecioVenta.getText());

        if (errorMensaje != null) {
            FuncionesGui.mostrarMensaje(errorMensaje, "Error", "ERROR");
        } else {
            guardarCambios();
            controladoraLogica.ModificarProducto(productoAModificar);
            FuncionesGui.mostrarMensaje("Se Guardo Correctamente!", "info", "Guardado Exitoso");
            FuncionesGui.limpiarCampos(pnlFormulario);
            controlVentana.mostrarProductos();
        }
    }//GEN-LAST:event_btnGuardarProductoActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed

        if (controladoraLogica.hayCambiosSinGuardar(productoAModificar, codigoProducto)) {
            FuncionesGui.mostrarMensaje("Debe guardar antes de salir,", "Error", "Error");
        } else {
            controlVentana.mostrarProductos();
            this.dispose();
        }


    }//GEN-LAST:event_btnAtrasActionPerformed

// Se Muestran los datos del producto que quiere modificar
    private void cargarDatosProducto() {
        productoAModificar = controladoraLogica.traerProducto(codigoProducto);
        txtCodigo.setText(productoAModificar.getCodigo());
        txtNombre.setText(productoAModificar.getNombre());
        txtCantidad.setText(String.valueOf((productoAModificar.getStockActual())));
        txtDescrip.setText(productoAModificar.getDescripcion());
        txtPrecioCosto.setText(String.valueOf(productoAModificar.getPrecioCosto()));
        txtPrecioVenta.setText(String.valueOf(productoAModificar.getPrecioVenta()));
    }

    private void guardarCambios() {
        productoAModificar.setCodigo(txtCodigo.getText());
        productoAModificar.setNombre(txtNombre.getText());
        productoAModificar.setStockActual(Integer.parseInt(txtCantidad.getText()));
        productoAModificar.setDescripcion(txtDescrip.getText());
        productoAModificar.setPrecioCosto(Float.parseFloat(txtPrecioCosto.getText()));
        productoAModificar.setPrecioVenta(Float.parseFloat(txtPrecioVenta.getText()));

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardarProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescrip;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPrecioCosto;
    private javax.swing.JTextField txtPrecioVenta;
    // End of variables declaration//GEN-END:variables
}
