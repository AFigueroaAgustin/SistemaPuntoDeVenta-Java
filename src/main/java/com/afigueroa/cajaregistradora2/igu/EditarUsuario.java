package com.afigueroa.cajaregistradora2.igu;

import Utilidades.AlertaRecarga;
import Utilidades.FuncionesGui;
import com.afigueroa.cajaregistradora2.logica.ControLogica;
import com.afigueroa.cajaregistradora2.logica.Rol;
import com.afigueroa.cajaregistradora2.logica.Usuario;
import java.util.List;

public class EditarUsuario extends javax.swing.JFrame {

    private AlertaRecarga listener;
    private ControladoraGui controlV;
    private long idUsuario;
    ControLogica controladoraLogica = new ControLogica();

    public EditarUsuario(ControladoraGui controlV, long idUsuario, AlertaRecarga listener) {
        initComponents();
        CargarRolesEditar();
        mostrarDatos(idUsuario);
        this.controlV = controlV;
        this.idUsuario = idUsuario;
        this.listener = listener;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreUsr = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        cboRol = new javax.swing.JComboBox<>();
        btnGuardarDatos = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Roboto Black", 2, 36)); // NOI18N
        jLabel1.setText("EDITAR DATOS");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(175, 175, 175))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setPreferredSize(new java.awt.Dimension(482, 448));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel2.setText("Nombre de Usuario:");

        jLabel3.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel3.setText("Contraseña:");

        jLabel4.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel4.setText("Rol:");

        btnGuardarDatos.setFont(new java.awt.Font("Poppins Medium", 2, 14)); // NOI18N
        btnGuardarDatos.setText("Guardar");
        btnGuardarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cboRol, javax.swing.GroupLayout.Alignment.LEADING, 0, 180, Short.MAX_VALUE)
                        .addComponent(txtContra, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtNombreUsr, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(btnGuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtNombreUsr)))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtContra)))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(cboRol))
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addComponent(btnGuardarDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(159, 159, 159))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 562, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarDatosActionPerformed
        String nombreAct = txtNombreUsr.getText().trim();
        String contraAct = txtContra.getText().trim();
        if (nombreAct.isEmpty() || contraAct.isEmpty()) {
            FuncionesGui.mostrarMensaje("No puede estar los campos vacios", "Error", "Campos Vacios");
            return;
        }
        try {
            Boolean esValido = controladoraLogica.verificarDatosUsr(idUsuario, nombreAct);
            if (esValido) {
                Rol idselec = (Rol) cboRol.getSelectedItem();
                controladoraLogica.guardarDatosUsr(idUsuario, nombreAct, contraAct, idselec);
                FuncionesGui.mostrarMensaje("Usuario modificado exitosamente", "Info", "Edición Exitosa");
                if (listener != null) {
                    controlV.mostrarAdmin();
                    listener.recargarDatos(); // Avisamos para recargar la tabla usuario
                }
                
            } else {
                FuncionesGui.mostrarMensaje("El nombre de usuario ya existe, elija otro.", "Advertencia", "Nombre duplicado");
            }
        } catch (Exception e) {
            FuncionesGui.mostrarMensaje("Error en el sistema. Intente nuevamente.", "Error", "Error");
            System.out.println("Error inesperado" + e.getMessage());
        }
    }//GEN-LAST:event_btnGuardarDatosActionPerformed

    private void mostrarDatos(long idUsuario) {
        Usuario usr = controladoraLogica.traerUsuario(idUsuario);
        txtNombreUsr.setText(usr.getNombreUsuario());
        txtContra.setText(usr.getContraseña());
        cboRol.setSelectedItem(usr.getRol());
    }

    private void CargarRolesEditar() {
        List<Rol> roles = controladoraLogica.traerRoles();
        FuncionesGui.cargarCombo(cboRol, roles);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardarDatos;
    private javax.swing.JComboBox<Rol> cboRol;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtNombreUsr;
    // End of variables declaration//GEN-END:variables
}
