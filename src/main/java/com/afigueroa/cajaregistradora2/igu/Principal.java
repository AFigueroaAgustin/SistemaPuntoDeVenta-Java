package com.afigueroa.cajaregistradora2.igu;

import Utilidades.FuncionesGui;
import com.afigueroa.cajaregistradora2.logica.Sesion;
import com.afigueroa.cajaregistradora2.logica.Usuario;

public class Principal extends javax.swing.JFrame {

    private ControladoraGui control;

    public Principal(ControladoraGui control) {
        initComponents();
        estilizarBotones();
        this.control = control;
        Usuario usuarioActual = Sesion.getUsuarioLogueado();
        if (usuarioActual != null) {
            LabelNombreUsr.setText(usuarioActual.getNombreUsuario().toUpperCase());
        }
        iniciarFecha();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pnlGeneral = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnVenta = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        pnlExtras = new javax.swing.JPanel();
        lblTiempo = new javax.swing.JLabel();
        pnlTextos = new javax.swing.JPanel();
        lblHola = new javax.swing.JLabel();
        LabelNombreUsr = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlGeneral.setBackground(new java.awt.Color(255, 255, 255));
        pnlGeneral.setLayout(new java.awt.BorderLayout());

        pnlBotones.setBackground(new java.awt.Color(255, 255, 255));
        pnlBotones.setLayout(new java.awt.GridBagLayout());

        btnVenta.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnVenta.setText("Venta");
        btnVenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVenta.setPreferredSize(new java.awt.Dimension(300, 200));
        btnVenta.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        pnlBotones.add(btnVenta, new java.awt.GridBagConstraints());

        btnCatalogo.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnCatalogo.setText("Catalogo/Productos");
        btnCatalogo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCatalogo.setPreferredSize(new java.awt.Dimension(300, 200));
        btnCatalogo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCatalogoActionPerformed(evt);
            }
        });
        pnlBotones.add(btnCatalogo, new java.awt.GridBagConstraints());

        btnCerrar.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        btnCerrar.setText("Cerrar  ");
        btnCerrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCerrar.setPreferredSize(new java.awt.Dimension(300, 200));
        btnCerrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        pnlBotones.add(btnCerrar, gridBagConstraints);

        pnlGeneral.add(pnlBotones, java.awt.BorderLayout.CENTER);

        pnlExtras.setBackground(new java.awt.Color(220, 220, 220));
        pnlExtras.setPreferredSize(new java.awt.Dimension(1036, 35));
        pnlExtras.setLayout(new java.awt.BorderLayout(5, 0));

        lblTiempo.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        lblTiempo.setForeground(new java.awt.Color(0, 0, 0));
        lblTiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTiempo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblTiempo.setPreferredSize(new java.awt.Dimension(120, 16));
        pnlExtras.add(lblTiempo, java.awt.BorderLayout.WEST);

        pnlGeneral.add(pnlExtras, java.awt.BorderLayout.SOUTH);

        pnlTextos.setBackground(new java.awt.Color(30, 60, 90));
        pnlTextos.setPreferredSize(new java.awt.Dimension(720, 80));
        pnlTextos.setLayout(new java.awt.GridBagLayout());

        lblHola.setFont(new java.awt.Font("Roboto Black", 2, 44)); // NOI18N
        lblHola.setForeground(new java.awt.Color(255, 255, 255));
        lblHola.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHola.setText("HOLA");
        lblHola.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblHola.setPreferredSize(new java.awt.Dimension(111, 55));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 120, 0, 0);
        pnlTextos.add(lblHola, gridBagConstraints);

        LabelNombreUsr.setFont(new java.awt.Font("Roboto Black", 2, 44)); // NOI18N
        LabelNombreUsr.setForeground(new java.awt.Color(255, 255, 255));
        LabelNombreUsr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LabelNombreUsr.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        LabelNombreUsr.setPreferredSize(new java.awt.Dimension(300, 55));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        pnlTextos.add(LabelNombreUsr, gridBagConstraints);

        pnlGeneral.add(pnlTextos, java.awt.BorderLayout.NORTH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 1088, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed
        control.mostrarVenta();
    }//GEN-LAST:event_btnVentaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Sesion.cerrarSesion();
        control.iniciar();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCatalogoActionPerformed
        control.mostrarProductos();
    }//GEN-LAST:event_btnCatalogoActionPerformed

    private void estilizarBotones() {
        FuncionesGui.estilizarBoton(btnCerrar, "log-out.svg");
        FuncionesGui.estilizarBoton(btnCatalogo, "search.svg");
        FuncionesGui.estilizarBoton(btnVenta, "shopping-cart.svg");
    }

    private void iniciarFecha() {
        // Formato solo fecha
        java.time.format.DateTimeFormatter formato = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy");

        //  Obtener fecha y ponerla en el label
        java.awt.event.ActionListener actualizador = new java.awt.event.ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                // Usamos LocalDate en vez de LocalDateTime porque no nos importa la hora
                String fechaActual = java.time.LocalDate.now().format(formato);
                lblTiempo.setText("Fecha: " + fechaActual);
            }
        };

        // Ejecutar inmediatamente (para que no tarde en aparecer al abrir)
        actualizador.actionPerformed(null);

        // Timer cada 60,000 ms (1 minuto) para capturar el cambio de medianoche
        new javax.swing.Timer(60000, actualizador).start();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNombreUsr;
    private javax.swing.JButton btnCatalogo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnVenta;
    private javax.swing.JLabel lblHola;
    private javax.swing.JLabel lblTiempo;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlExtras;
    private javax.swing.JPanel pnlGeneral;
    private javax.swing.JPanel pnlTextos;
    // End of variables declaration//GEN-END:variables
}
