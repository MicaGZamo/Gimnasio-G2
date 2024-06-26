package Vistas;

import AccesoData.MembresiaData;
import AccesoData.SocioData;
import Entidades.Membresia;
import Entidades.Socio;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ActualizarMembresia extends javax.swing.JInternalFrame {

    private MembresiaData membresiaData;
    private SocioData socioData;
    private Socio socio;
    private List<Integer> pases;
    private List<Double> precios;
    private List<String> membresias;
    private int id;

    public ActualizarMembresia(int id) {
        initComponents();
        this.id = id;
        this.membresiaData = new MembresiaData();
        this.socioData = new SocioData();
        this.pases = new ArrayList<>();
        this.precios = new ArrayList<>();
        cargarPases();
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
        jLabel4 = new javax.swing.JLabel();
        jtFechaVencimientoAnt = new javax.swing.JTextField();
        jlTipo = new javax.swing.JLabel();

        setFocusable(false);

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
        jLabel5.setText("Nueva Inscripción");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Nuevo Vencimiento");

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

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Vencimiento");

        jtFechaVencimientoAnt.setEditable(false);
        jtFechaVencimientoAnt.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jtFechaVencimientoAnt.setForeground(new java.awt.Color(178, 17, 17));
        jtFechaVencimientoAnt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtFechaVencimientoAnt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jtFechaVencimientoAnt.setEnabled(false);
        jtFechaVencimientoAnt.setFocusable(false);
        jtFechaVencimientoAnt.setOpaque(false);

        jlTipo.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jlTipo.setForeground(new java.awt.Color(51, 51, 51));
        jlTipo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jlTipo.setEnabled(false);

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
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtFechaVencimientoAnt, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(44, 44, 44)
                                        .addComponent(jtDNISocio, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                                                .addComponent(jcPases, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(10, 10, 10))
                                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addComponent(jLabel4)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jtFechaVencimientoAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                                        .addComponent(jLabel7)
                                                        .addGap(75, 75, 75)
                                                        .addComponent(jlCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))))))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jDate, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE)
                                    .addComponent(jDateVencimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel1)))
                .addContainerGap(47, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jlNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
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
                .addGap(18, 24, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcPases, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtFechaVencimientoAnt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel6)
                        .addGap(34, 34, 34))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jDateVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
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

    private void cargarDatosMembresia(int id) {
        Membresia membresia = membresiaData.buscarMembresiaPorId(id);
        if (membresia != null) {
            String fechaFinStr = membresia.getFechaFin().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            jtFechaVencimientoAnt.setText(fechaFinStr);
            jlCosto.setText(String.valueOf(membresia.getPrecioMembresia()));
            jDate.setDate(java.util.Date.from(membresia.getFechaInicio().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            jDateVencimiento.setDate(java.util.Date.from(membresia.getFechaFin().atStartOfDay(ZoneId.systemDefault()).toInstant()));
            jtDNISocio.setText(membresia.getSocio().getDniSocio());
            jlNombreApellido.setText(membresia.getSocio().getNombre() + " " + membresia.getSocio().getApellido());
        }
    }
    private void jtDNISocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDNISocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDNISocioActionPerformed
    private void cargarPases() {
        pases = new ArrayList<>();
        pases.add(4);
        pases.add(12);
        pases.add(20);
        pases.add(28);

        precios = new ArrayList<>();
        precios.add(3500.0);
        precios.add(6800.0);
        precios.add(9000.0);
        precios.add(11400.0);

        membresias = new ArrayList<>();
        membresias.add("[1 vez por semana]");
        membresias.add("[3 veces por semana]");
        membresias.add("[5 veces por semana]");
        membresias.add("[7 veces por semana]");

        jcPases.removeAllItems();
        for (Integer pase : pases) {
            jcPases.addItem(pase);
        }
    }
    private void jcPasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPasesActionPerformed

        int paseSeleccionado = jcPases.getSelectedIndex();
        if (paseSeleccionado != -1) {
            double precio = precios.get(paseSeleccionado);
            jlCosto.setText(String.valueOf(precio));

            String mem = membresias.get(paseSeleccionado);
            jlTipo.setText(mem);
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
        try {
            int indicePase = jcPases.getSelectedIndex();
            java.util.Date fechaInicio = jDate.getDate();
            java.util.Date fechaFin = jDateVencimiento.getDate();

            if (indicePase == -1 || fechaInicio == null || fechaFin == null) {
                JOptionPane.showMessageDialog(this, "Debe completar todos los campos.");
                return;
            }

            int cantidadPases = (int) jcPases.getSelectedItem();
            Membresia membresia = membresiaData.buscarMembresiaPorId(id);

            membresia.setCantPases(cantidadPases);

            LocalDate fechaInicioLocalDate = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFinLocalDate = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            membresia.setFechaInicio(fechaInicioLocalDate);
            membresia.setFechaFin(fechaFinLocalDate);
            membresia.setPrecioMembresia(precios.get(indicePase));
            membresia.setEstado(true);

            membresiaData.guardarMembresia(membresia);

            JOptionPane.showMessageDialog(this, "Membresía actualizada correctamente.");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al actualizar la membresía: " + ex.getMessage());
            ex.printStackTrace();
        }
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox jcPases;
    private javax.swing.JLabel jlCosto;
    private javax.swing.JLabel jlNombreApellido;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JTextField jtDNISocio;
    private javax.swing.JTextField jtFechaVencimientoAnt;
    // End of variables declaration//GEN-END:variables
}
