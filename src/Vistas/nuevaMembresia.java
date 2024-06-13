package Vistas;

import AccesoData.MembresiaData;
import AccesoData.SocioData;
import Entidades.Membresia;
import Entidades.Socio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class nuevaMembresia extends javax.swing.JInternalFrame {

    private MembresiaData membresiaData;
    private Membresia membresiaActual;
    private Socio socioN;
    private SocioData socioData;
    private List<Integer> pases;
    private List<Double> precios;
    private List <String> membresias;

    public nuevaMembresia() {
        initComponents();
        this.membresiaData = new MembresiaData();
        this.socioData = new SocioData();
        cargarPases();
        
        jcPases.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jcPasesActionPerformed(evt);
            }
        });
        
        jDate.addPropertyChangeListener(new PropertyChangeListener() {
            public void propertyChange(PropertyChangeEvent evt) {
                jDatePropertyChange(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
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
        jbLimpiar = new javax.swing.JButton();
        jbBuscarSocio = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jlNombreApellido = new javax.swing.JLabel();
        jDate = new com.toedter.calendar.JDateChooser();
        jlCosto = new javax.swing.JLabel();
        jDateVencimiento = new com.toedter.calendar.JDateChooser();
        jlTipo = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setFocusable(false);

        jDesktopPane1.setBackground(new java.awt.Color(75, 102, 113));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Crear Nueva Membresia");

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
        jtDNISocio.setSelectedTextColor(new java.awt.Color(51, 51, 51));
        jtDNISocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDNISocioActionPerformed(evt);
            }
        });

        jcPases.setBackground(new java.awt.Color(204, 204, 204));
        jcPases.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jcPases.setForeground(new java.awt.Color(0, 0, 0));
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

        jbLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        jbLimpiar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(204, 204, 204));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbBuscarSocio.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscarSocio.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbBuscarSocio.setForeground(new java.awt.Color(204, 204, 204));
        jbBuscarSocio.setText("Buscar");
        jbBuscarSocio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarSocioActionPerformed(evt);
            }
        });

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

        jlTipo.setFont(new java.awt.Font("Ebrima", 1, 12)); // NOI18N
        jlTipo.setForeground(new java.awt.Color(255, 255, 255));
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
        jDesktopPane1.setLayer(jbLimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscarSocio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlNombreApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDate, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlCosto, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jDateVencimiento, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jlTipo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDateVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jcPases, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(63, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtDNISocio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(95, 95, 95)
                        .addComponent(jlCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(184, 184, 184)))
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jlNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(188, 188, 188))))
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
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarSocio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcPases, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(49, 49, 49)
                        .addComponent(jLabel6))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jDateVencimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
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

        setBounds(125, 0, 590, 517);
    }// </editor-fold>//GEN-END:initComponents

    private void jtDNISocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDNISocioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDNISocioActionPerformed

    private void jbBuscarSocioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarSocioActionPerformed

        try {
            String dni = jtDNISocio.getText();

            if (!dni.matches("\\d+")) {
                throw new NumberFormatException("El DNI debe contener solo números.");
            }

            jlNombreApellido.setText("");

            Socio socioEncontrado = socioData.buscarSocioDni(dni);

            if (socioEncontrado != null) {
                jlNombreApellido.setText(socioEncontrado.getNombre() + " " + socioEncontrado.getApellido());
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún socio con el DNI proporcionado.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido para el DNI.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el socio: " + e.getMessage());
        }

    }//GEN-LAST:event_jbBuscarSocioActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        limpiarCampos();

    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jcPasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPasesActionPerformed

        int paseSeleccionado = jcPases.getSelectedIndex();
        if (paseSeleccionado != -1) {
            double precio = precios.get(paseSeleccionado);
            jlCosto.setText(String.valueOf(precio));
            
            String mem = membresias.get(paseSeleccionado);
            jlTipo.setText(mem);
        }


    }//GEN-LAST:event_jcPasesActionPerformed

    private void jDatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDatePropertyChange
        if ("date".equals(evt.getPropertyName())) {
            // Obtener la fecha seleccionada en el JDateChooser
            java.util.Date selectedDate = jDate.getDate();

            // Calcular la fecha de vencimiento sumando 4 semanas a la fecha seleccionada
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.setTime(selectedDate);
            calendar.add(java.util.Calendar.WEEK_OF_YEAR, 4);

            // Establecer la fecha de vencimiento en el JLabel jlVencimiento
            jDateVencimiento.setDate(calendar.getTime());

        }

    }//GEN-LAST:event_jDatePropertyChange

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // validar todos los campos

        try {
            String dniSocio = jtDNISocio.getText();
            int indicePase = jcPases.getSelectedIndex();
            java.util.Date fechaInicio = jDate.getDate();
            java.util.Date fechaFin = jDateVencimiento.getDate();

            // Validar que se hayan ingresado todos los campos
            if (dniSocio.isEmpty() || indicePase == -1 || fechaInicio == null || fechaFin == null) {
                JOptionPane.showMessageDialog(this, "Debe completar todos los campos.");
                return;
            }

            // Obtener el socio asociado al DNI
            Socio socio = socioData.buscarSocioDni(dniSocio);
            if (socio == null) {
                JOptionPane.showMessageDialog(this, "No se encontró ningún socio con el DNI proporcionado.");
                return;
            }

            // Crear un objeto Membresia con los valores proporcionados
            Membresia nuevaMembresia = new Membresia();
            nuevaMembresia.setSocio(socio);
            
             int cantidadPases = (int) jcPases.getSelectedItem();
            nuevaMembresia.setCantPases(cantidadPases);

            // Convertir las fechas a LocalDate
            LocalDate fechaInicioLocalDate = fechaInicio.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaFinLocalDate = fechaFin.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

            nuevaMembresia.setFechaInicio(fechaInicioLocalDate);
            nuevaMembresia.setFechaFin(fechaFinLocalDate);

            
            nuevaMembresia.setPrecioMembresia(precios.get(indicePase));
            nuevaMembresia.setEstado(true);// dejamos activa la membresia.
            
            //activamos el socio 
            socio.setEstado(true);

            // Guardar la membresía en la base de datos
            membresiaData.guardarMembresia(nuevaMembresia);

            // Limpiar los campos después de guardar la membresía
            limpiarCampos();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al guardar la membresía: " + ex.getMessage());
            ex.printStackTrace();
        }

 
    }//GEN-LAST:event_jbGuardarActionPerformed
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

    private void limpiarCampos() {
        jlNombreApellido.setText("");
        jtDNISocio.setText("");
        jlCosto.setText("");
        // Reiniciar el JComboBox
        jcPases.setSelectedIndex(-1);
    }


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
    private javax.swing.JButton jbBuscarSocio;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox jcPases;
    private javax.swing.JLabel jlCosto;
    private javax.swing.JLabel jlNombreApellido;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JTextField jtDNISocio;
    // End of variables declaration//GEN-END:variables
}
