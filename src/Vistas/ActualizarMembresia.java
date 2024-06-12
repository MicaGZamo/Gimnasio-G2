package Vistas;

import AccesoData.MembresiaData;
import AccesoData.SocioData;
import Entidades.Membresia;
import Entidades.Socio;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ActualizarMembresia extends javax.swing.JInternalFrame {

    private MembresiaData membresiaData;
    private SocioData socioData;
    private Socio socio;
    private List<String> pases;
    private List<Double> precios;

    public ActualizarMembresia(int id) {
        initComponents();
        this.membresiaData = new MembresiaData();
        this.socioData = new SocioData();
        this.pases = new ArrayList<>();
        this.precios = new ArrayList<>();
        cargarPases();
        cargarDatosSocio();
        cargarDatosMembresia(id);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtDNISocio = new javax.swing.JTextField();
        jcPases = new javax.swing.JComboBox();
        jbSalir = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jlNombreApellido = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jlCosto = new javax.swing.JLabel();
        jDateVencimiento = new com.toedter.calendar.JDateChooser();

        jDesktopPane1.setBackground(new java.awt.Color(75, 102, 113));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Renovar Membresia del Socio");

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("DNI Socio");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Cantidad Pases");

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Fecha Inscripción");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Fecha Vencimiento");

        jtDNISocio.setBackground(new java.awt.Color(204, 204, 204));
        jtDNISocio.setForeground(new java.awt.Color(51, 51, 51));
        jtDNISocio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDNISocio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jtDNISocio.setEnabled(false);
        jtDNISocio.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jtDNISocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDNISocioActionPerformed(evt);
            }
        });

        jcPases.setBackground(new java.awt.Color(204, 204, 204));
        jcPases.setForeground(new java.awt.Color(0, 0, 0));
        jcPases.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jcPases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPasesActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(51, 51, 51));
        jbSalir.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(204, 204, 204));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbGuardar.setBackground(new java.awt.Color(51, 51, 51));
        jbGuardar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbGuardar.setForeground(new java.awt.Color(204, 204, 204));
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Costo");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jlNombreApellido.setBackground(new java.awt.Color(204, 204, 204));
        jlNombreApellido.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jlNombreApellido.setForeground(new java.awt.Color(255, 255, 255));
        jlNombreApellido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlNombreApellido.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jlNombreApellido.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jDate.setBackground(new java.awt.Color(15, 126, 15));
        jDate.setForeground(new java.awt.Color(0, 153, 51));
        jDate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDatePropertyChange(evt);
            }
        });

        jlCosto.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jlCosto.setForeground(new java.awt.Color(204, 204, 204));
        jlCosto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlCosto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jDateVencimiento.setBackground(new java.awt.Color(145, 19, 19));

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtDNISocio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcPases, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlNombreApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlCosto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDateVencimiento, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jtDNISocio, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcPases, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel7)
                        .addGap(120, 120, 120)
                        .addComponent(jlCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDateVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDNISocio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcPases, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel5)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void cargarDatosSocio() {
        jtDNISocio.setText(socio.getDniSocio());
        jlNombreApellido.setText(socio.getNombre() + " " + socio.getApellido());
    }

    private void cargarDatosMembresia(int id) {
        Membresia membresia = membresiaData.buscarMembresiaPorId(id);
        if (membresia != null) {
            jcPases.setSelectedIndex(membresia.getCantPases() - 1);
            jlCosto.setText(String.valueOf(membresia.getPrecioMembresia()));
            jDate.setDate(java.util.Date.from(membresia.getFechaInicio().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            jDateVencimiento.setDate(java.util.Date.from(membresia.getFechaFin().atStartOfDay(ZoneId.systemDefault()).toInstant()));
        }
    }
    private void jtDNISocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDNISocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDNISocioActionPerformed
    private void cargarPases() {
        pases.add("4 pases [1 por semana]");
        precios.add(3500.0);

        pases.add("12 pases [3 por semana]");
        precios.add(6000.0);

        pases.add("20 pases [5 por semana]");
        precios.add(8500.0);

        pases.add("28 pases [7 veces por semana]");
        precios.add(11300.0);

        jcPases.removeAllItems();
        for (String pase : pases) {
            jcPases.addItem(pase);
        }
    }
    private void jcPasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPasesActionPerformed

        int paseSeleccionado = jcPases.getSelectedIndex();
        if (paseSeleccionado != -1) {
            double precio = precios.get(paseSeleccionado);
            jlCosto.setText(String.valueOf(precio));
        }

    }//GEN-LAST:event_jcPasesActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
        Menu menuPrincipal = new Menu();
        gestionMembresia gm = new gestionMembresia();
        menuPrincipal.getJdpEscritorio().add(gm);
        gm.setVisible(true);
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
////        try {
//            int indicePase = jcPases.getSelectedIndex();
//            java.util.Date fechaInicio = jDate.getDate();
//            java.util.Date fechaFin = jDateVencimiento.getDate();
//
        //    if (indicePase == -1 || fechaInicio == null || fechaFin == null) {
          //      JOptionPane.showMessageDialog(this, "Debe completar todos los campos.");
            //    return;
            //}

           // Membresia membresia = membresiaData.buscarMembresiaPorId(id);
           
//            membresia.setCantPases(indicePase + 1);
//
//            LocalDate fechaInicioLocalDate = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//            LocalDate fechaFinLocalDate = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
//
//            membresia.setFechaInicio(fechaInicioLocalDate);
//            membresia.setFechaFin(fechaFinLocalDate);
//            membresia.setPrecioMembresia(precios.get(indicePase));
//            membresia.setEstado(true);
//
//            membresiaData.guardarMembresia(membresia);
//
//            JOptionPane.showMessageDialog(this, "Membresía actualizada correctamente.");
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar la membresía: " + ex.getMessage());
//            ex.printStackTrace();
//        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDatePropertyChange
        if ("date".equals(evt.getPropertyName())) {

            java.util.Date selectedDate = jDate.getDate();

            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(selectedDate);
            calendar.add(java.util.Calendar.WEEK_OF_YEAR, 4);

            jDateVencimiento.setDate(calendar.getTime());

        }
    }//GEN-LAST:event_jDatePropertyChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser jDate;
    private com.toedter.calendar.JDateChooser jDateVencimiento;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox jcPases;
    private javax.swing.JLabel jlCosto;
    private javax.swing.JLabel jlNombreApellido;
    private javax.swing.JTextField jtDNISocio;
    // End of variables declaration//GEN-END:variables
}
