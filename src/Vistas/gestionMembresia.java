package Vistas;

import AccesoData.MembresiaData;
import AccesoData.SocioData;
import Entidades.Membresia;
import Entidades.Socio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class gestionMembresia extends javax.swing.JInternalFrame {

    private MembresiaData membresiaData;
    private Socio socioN;
    private SocioData socioData;
    private DefaultTableModel modelo;

    public gestionMembresia() {
        initComponents();
        this.membresiaData = new MembresiaData();
        this.socioData = new SocioData();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        cargarMembresias();

        jrbTodas.setSelected(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jEscritorio = new javax.swing.JDesktopPane();
        jLabel4 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jrbInactivas = new javax.swing.JRadioButton();
        jrbTodas = new javax.swing.JRadioButton();
        jrbActivas = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtablaMem = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbRenovar = new javax.swing.JButton();
        jbDarbaja = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        eliminar = new javax.swing.JButton();

        jEscritorio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("DNI Socio");

        jtDni.setBackground(new java.awt.Color(204, 204, 204));
        jtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jbBuscar.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbBuscar.setForeground(new java.awt.Color(204, 204, 204));
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jrbInactivas.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jrbInactivas.setForeground(new java.awt.Color(204, 204, 204));
        jrbInactivas.setText("Inactivas");
        jrbInactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivasActionPerformed(evt);
            }
        });

        jrbTodas.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jrbTodas.setForeground(new java.awt.Color(204, 204, 204));
        jrbTodas.setText("Todas");
        jrbTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTodasActionPerformed(evt);
            }
        });

        jrbActivas.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jrbActivas.setForeground(new java.awt.Color(204, 204, 204));
        jrbActivas.setText("Activas");
        jrbActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivasActionPerformed(evt);
            }
        });

        jtablaMem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtablaMem);

        jbSalir.setBackground(new java.awt.Color(51, 51, 51));
        jbSalir.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(204, 204, 204));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbRenovar.setBackground(new java.awt.Color(51, 51, 51));
        jbRenovar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbRenovar.setForeground(new java.awt.Color(204, 204, 204));
        jbRenovar.setText("Renovar");
        jbRenovar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRenovarActionPerformed(evt);
            }
        });

        jbDarbaja.setBackground(new java.awt.Color(51, 51, 51));
        jbDarbaja.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbDarbaja.setForeground(new java.awt.Color(204, 204, 204));
        jbDarbaja.setText("Dar Baja");
        jbDarbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarbajaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Gestión Membresias");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        eliminar.setBackground(new java.awt.Color(227, 31, 31));
        eliminar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        eliminar.setForeground(new java.awt.Color(255, 255, 255));
        eliminar.setText("Eliminar");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        jEscritorio.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jtDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jrbInactivas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jrbTodas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jrbActivas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jbRenovar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jbDarbaja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jEscritorio.setLayer(eliminar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jEscritorioLayout = new javax.swing.GroupLayout(jEscritorio);
        jEscritorio.setLayout(jEscritorioLayout);
        jEscritorioLayout.setHorizontalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jbDarbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addComponent(jbRenovar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addComponent(jLabel3))
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addComponent(jrbActivas)
                        .addGap(77, 77, 77)
                        .addComponent(jrbTodas)
                        .addGap(62, 62, 62)
                        .addComponent(jrbInactivas))
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(50, 50, 50)
                        .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(125, 125, 125))
        );
        jEscritorioLayout.setVerticalGroup(
            jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jEscritorioLayout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jEscritorioLayout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbRenovar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbDarbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jEscritorioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jbBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jEscritorioLayout.createSequentialGroup()
                                .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(4, 4, 4)))
                        .addGap(18, 18, 18)
                        .addGroup(jEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jrbInactivas)
                            .addComponent(jrbTodas)
                            .addComponent(jrbActivas))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jEscritorio))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jEscritorio)
        );

        setBounds(120, 0, 733, 530);
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed

        try {
            String dni = jtDni.getText();

            if (!dni.matches("\\d+")) {
                throw new NumberFormatException("El DNI debe contener solo números.");
            }

            Socio socioEncontrado = socioData.buscarSocioDni(dni);

            if (socioEncontrado != null) {

                List<Membresia> listaM = membresiaData.buscarPorSocio(socioEncontrado);

                if (!listaM.isEmpty()) {

                    modelo.setRowCount(0);

                    for (Membresia membresia : listaM) {
                        modelo.addRow(new Object[]{
                            membresia.getIdMembresia(),
                            socioEncontrado.getDniSocio(),
                            socioEncontrado.getNombre(),
                            socioEncontrado.getApellido(),
                            membresia.getCantPases(),
                            membresia.getPrecioMembresia(),
                            membresia.getFechaInicio(),
                            membresia.getFechaFin(),
                            membresia.isEstado() ? "Activo" : "Inactivo"
                        });
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "El socio no tiene membresías.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "No se encontró ningún socio con el DNI proporcionado.");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido para el DNI.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al buscar el socio: " + e.getMessage());
        }
        limpiarRButton();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jrbTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTodasActionPerformed

        borrarFilaTabla();
        cargarMembresias();
        jrbInactivas.setSelected(false);
        jrbActivas.setSelected(false);
        limpiarCampos();


    }//GEN-LAST:event_jrbTodasActionPerformed

    private void jrbActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivasActionPerformed
        borrarFilaTabla();
        cargarMembresiasActivas();
        jrbInactivas.setSelected(false);
        jrbTodas.setSelected(false);
        limpiarCampos();

    }//GEN-LAST:event_jrbActivasActionPerformed

    private void jrbInactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivasActionPerformed
        borrarFilaTabla();
        cargarMembresiasInactivas();
        jrbActivas.setSelected(false);
        jrbTodas.setSelected(false);
        limpiarCampos();

    }//GEN-LAST:event_jrbInactivasActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbDarbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarbajaActionPerformed

        try {
            int idMem = (int) jtablaMem.getValueAt(jtablaMem.getSelectedRow(), 0);
            if (idMem == -1) {
                JOptionPane.showMessageDialog(rootPane, "Seleccione una membresía de la tabla.");
                return;
            }

            Membresia membresia = membresiaData.buscarMembresiaPorId(idMem);
            if (membresia == null) {
                JOptionPane.showMessageDialog(rootPane, "No se encontró la membresía seleccionada en la base de datos.");
                return;
            }

            if (!membresia.isEstado()) {
                JOptionPane.showMessageDialog(rootPane, "La membresía seleccionada ya está inactiva.");
                return;
            }

            membresiaData.darBajaMembresia(idMem);

            // Dar de baja al socio asociado si existe
            if (membresia.getSocio() != null && membresia.getSocio().isEstado()) {
                socioData.darDeBajaSocio(membresia.getSocio().getIdSocio());
            }

            // Actualizar la tabla y limpiar campos
            borrarFilaTabla();
            cargarMembresias();
            limpiarCampos();

        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(this, "Seleccione una línea válida en la tabla.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al dar de baja la membresía: " + e.getMessage());
            e.printStackTrace();
        }
        limpiarCampos();
    }//GEN-LAST:event_jbDarbajaActionPerformed

    private void jbRenovarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRenovarActionPerformed
        int memSelec = jtablaMem.getSelectedRow();
        if (memSelec == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila.");
            return;
        }
        int idM = (int) jtablaMem.getValueAt(jtablaMem.getSelectedRow(), 0);
        jEscritorio.removeAll();
        ActualizarMembresia actSocio = new ActualizarMembresia(idM);
        actSocio.setVisible(true);
        jEscritorio.add(actSocio);

    }//GEN-LAST:event_jbRenovarActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed

        int filaSeleccionada = jtablaMem.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila.");
            return;
        }

        int idMembresia = (int) jtablaMem.getValueAt(filaSeleccionada, 0);
        String[] opciones = {"Aceptar", "Cancelar"};

        int opcion = JOptionPane.showOptionDialog(
                this,
                "¿Está seguro de eliminar la membresía seleccionada?",
                "Confirmar eliminación",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones, //ponemos las etiquetas
                opciones[0] 
        );

        if (opcion == JOptionPane.OK_OPTION) {

            membresiaData.eliminarMembresiaPorId(idMembresia);

            cargarMembresias();
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Nombre");
        filaCabecera.add("Apellido");
        filaCabecera.add("Pases");
        filaCabecera.add("Costo");
        filaCabecera.add("Inscripción");
        filaCabecera.add("Vence");
        filaCabecera.add("Estado");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtablaMem.setModel(modelo);
    }

    private void limpiarCampos() {
        jtDni.setText("");

    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void limpiarRButton() {
        jrbTodas.setSelected(false);
        jrbActivas.setSelected(false);
        jrbInactivas.setSelected(false);
    }

    private void cargarMembresias() {

        List<Membresia> listaM = membresiaData.listarTodasMembresias();
        modelo.setRowCount(0);

        for (Membresia membresia : listaM) {
            Socio socio = membresia.getSocio();

            modelo.addRow(new Object[]{
                membresia.getIdMembresia(),
                socio.getDniSocio(),
                socio.getNombre(),
                socio.getApellido(),
                membresia.getCantPases(),
                membresia.getPrecioMembresia(),
                membresia.getFechaInicio(),
                membresia.getFechaFin(),
                membresia.isEstado() ? "Activo" : "Inactivo"
            });
        }

    }

    private void cargarMembresiasActivas() {

        List<Membresia> listaM = membresiaData.listarMembresiasActivas();
        modelo.setRowCount(0);

        for (Membresia membresia : listaM) {
            Socio socio = membresia.getSocio();

            modelo.addRow(new Object[]{
                membresia.getIdMembresia(),
                socio.getDniSocio(),
                socio.getNombre(),
                socio.getApellido(),
                membresia.getCantPases(),
                membresia.getPrecioMembresia(),
                membresia.getFechaInicio(),
                membresia.getFechaFin(),
                membresia.isEstado() ? "Activo" : "Inactivo"
            });
        }
    }

    private void cargarMembresiasInactivas() {

        List<Membresia> listaM = membresiaData.listarMembresiasInactivas();
        modelo.setRowCount(0);

        for (Membresia membresia : listaM) {
            Socio socio = membresia.getSocio();

            modelo.addRow(new Object[]{
                membresia.getIdMembresia(),
                socio.getDniSocio(),
                socio.getNombre(),
                socio.getApellido(),
                membresia.getCantPases(),
                membresia.getPrecioMembresia(),
                membresia.getFechaInicio(),
                membresia.getFechaFin(),
                membresia.isEstado() ? "Activo" : "Inactivo"
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eliminar;
    private javax.swing.JDesktopPane jEscritorio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbDarbaja;
    private javax.swing.JButton jbRenovar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbActivas;
    private javax.swing.JRadioButton jrbInactivas;
    private javax.swing.JRadioButton jrbTodas;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTable jtablaMem;
    // End of variables declaration//GEN-END:variables

}
