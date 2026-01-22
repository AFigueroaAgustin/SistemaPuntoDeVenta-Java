package com.afigueroa.cajaregistradora2.igu;

import Utilidades.AlertaRecarga;
import Utilidades.FuncionesGui;
import com.afigueroa.cajaregistradora2.logica.ControLogica;
import com.afigueroa.cajaregistradora2.logica.Usuario;
import java.util.List;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

public class PAdmin extends javax.swing.JFrame {

    private ControladoraGui controlV;
    private ControLogica controladoraLogica = new ControLogica();

    public PAdmin(ControladoraGui controlV) {
        initComponents();
        estilizarBotones();
        this.controlV = controlV;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlGeneral = new javax.swing.JPanel();
        pnlCuerpo = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnCrearUsuario = new javax.swing.JButton();
        btnEliminarUsu = new javax.swing.JButton();
        btnEditarUsu = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnVerProductos = new javax.swing.JButton();
        pnlTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaUsuarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlCuerpo.setLayout(new java.awt.BorderLayout());

        pnlBotones.setLayout(new java.awt.GridBagLayout());

        btnCrearUsuario.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnCrearUsuario.setText("Crear Usuario");
        btnCrearUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        pnlBotones.add(btnCrearUsuario, gridBagConstraints);

        btnEliminarUsu.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnEliminarUsu.setText("Eliminar Usuario");
        btnEliminarUsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEliminarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarUsuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        pnlBotones.add(btnEliminarUsu, gridBagConstraints);

        btnEditarUsu.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnEditarUsu.setText("Editar Usuario");
        btnEditarUsu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEditarUsu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarUsuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 20;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        pnlBotones.add(btnEditarUsu, gridBagConstraints);

        btnSalir.setBackground(new java.awt.Color(254, 242, 242));
        btnSalir.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 0, 0));
        btnSalir.setText("Salir");
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 74;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        pnlBotones.add(btnSalir, gridBagConstraints);

        btnReportes.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnReportes.setText("Crear Reporte");
        btnReportes.setToolTipText("Crear Reporte");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 17;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        pnlBotones.add(btnReportes, gridBagConstraints);

        btnVerProductos.setFont(new java.awt.Font("Poppins Medium", 0, 14)); // NOI18N
        btnVerProductos.setText("Ver Productos");
        btnVerProductos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVerProductos.setPreferredSize(new java.awt.Dimension(150, 50));
        btnVerProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerProductosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(10, 6, 10, 6);
        pnlBotones.add(btnVerProductos, gridBagConstraints);

        pnlCuerpo.add(pnlBotones, java.awt.BorderLayout.EAST);

        pnlTitulo.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Roboto Black", 2, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cajeros");
        pnlTitulo.add(jLabel1);

        pnlCuerpo.add(pnlTitulo, java.awt.BorderLayout.NORTH);

        pnlTabla.setFont(new java.awt.Font("Poppins Medium", 2, 12)); // NOI18N
        pnlTabla.setLayout(new java.awt.BorderLayout());

        TablaUsuarios.setFont(new java.awt.Font("Poppins Medium", 2, 14)); // NOI18N
        TablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaUsuarios);

        pnlTabla.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pnlCuerpo.add(pnlTabla, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout pnlGeneralLayout = new javax.swing.GroupLayout(pnlGeneral);
        pnlGeneral.setLayout(pnlGeneralLayout);
        pnlGeneralLayout.setHorizontalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 1237, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlGeneralLayout.setVerticalGroup(
            pnlGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, 778, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        cargarTablaUsu();
    }//GEN-LAST:event_formWindowOpened

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        controlV.mostrarCrearUsuario();
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void btnEliminarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarUsuActionPerformed
        if (TablaUsuarios.getRowCount() > 0) {
            int filaSeleccionada = TablaUsuarios.getSelectedRow();
            if (filaSeleccionada != -1) {
                long idUsuario = (long) TablaUsuarios.getValueAt(filaSeleccionada, 0);
                controladoraLogica.borrarUsuario(idUsuario);
                FuncionesGui.mostrarMensaje("Se borro Correctamente", "info", "Accion Exitosa");
                cargarTablaUsu();
            } else {
                FuncionesGui.mostrarMensaje("No selecciono ningun producto", "Error", "Error");
            }
        } else {
            FuncionesGui.mostrarMensaje("La tabla no tiene usuario para eliminar", "info", "La tabla esta vacia");
        }
    }//GEN-LAST:event_btnEliminarUsuActionPerformed

    private void btnEditarUsuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarUsuActionPerformed
        if (TablaUsuarios.getRowCount() > 0) {
            int filaSeleccionada = TablaUsuarios.getSelectedRow();
            if (filaSeleccionada != -1) {
                long idUsuario = (long) TablaUsuarios.getValueAt(filaSeleccionada, 0);
                AlertaRecarga accion = () -> {
                    this.cargarTablaUsu();
                };
                controlV.mostrarEditarUsr(idUsuario,accion);
            } else {
                FuncionesGui.mostrarMensaje("No selecciono ningun producto", "Error", "Error");
            }
        } else {
            FuncionesGui.mostrarMensaje("La tabla no tiene usuario para eliminar", "info", "La tabla esta vacia");
        }

    }//GEN-LAST:event_btnEditarUsuActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // PEDIR EL REPORTE A LA LÓGICA
        JasperPrint reporte = controladoraLogica.generarReporteVentas();

        if (reporte != null) {
            JasperViewer visor = new JasperViewer(reporte, false); // "false" No cerrar la app al salir
            visor.setTitle("Reporte General de Ventas");
            visor.setVisible(true);
        } else {
            Utilidades.FuncionesGui.mostrarMensaje("No se pudo generar el reporte. Revise la conexión o el archivo.", "Error", "Error al Generar");
        }
    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnVerProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerProductosActionPerformed
       controlV.mostrarProductos();
    }//GEN-LAST:event_btnVerProductosActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cargarTablaUsu() {
        List<Usuario> listaUsuarios = controladoraLogica.traerUsuarios();
        FuncionesGui.cargarTablaUsuario(TablaUsuarios, listaUsuarios);
    }

    private void estilizarBotones(){
        FuncionesGui.estilizarBoton(btnReportes,"ReporteVenta.svg");
        FuncionesGui.estilizarBoton(btnVerProductos);
        FuncionesGui.estilizarBoton(btnEliminarUsu);
        FuncionesGui.estilizarBoton(btnEditarUsu);
        FuncionesGui.estilizarBoton(btnCrearUsuario);
        FuncionesGui.estilizarBoton(btnSalir);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaUsuarios;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnEditarUsu;
    private javax.swing.JButton btnEliminarUsu;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVerProductos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCuerpo;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JPanel pnlTitulo;
    // End of variables declaration//GEN-END:variables
}
