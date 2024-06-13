package Vistas;

import AccesoData.SocioData;
import Entidades.Socio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class gestionSocio extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    SocioData socioData = new SocioData();
    Socio socioActual = null;
    Socio socio = null;

    List<Socio> listaSocios = new ArrayList<>();

    public gestionSocio() {
        initComponents();
        modelo = new DefaultTableModel(); 
        armarCabeceraTabla(); 
        cargarSocios();
        jrbTodos.setSelected(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jbBuscarID = new javax.swing.JButton();
        jtBuscarID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtBuscarDNI = new javax.swing.JTextField();
        jtBuscarNombre = new javax.swing.JTextField();
        jbBuscarDNI = new javax.swing.JButton();
        jbBuscarNombre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaSocio = new javax.swing.JTable();
        jbSalir = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbDarbaja = new javax.swing.JButton();
        jrbActivos = new javax.swing.JRadioButton();
        jrbInactivos = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jbDaralta = new javax.swing.JButton();
        jrbTodos = new javax.swing.JRadioButton();

        jDesktopPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jbBuscarID.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscarID.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbBuscarID.setForeground(new java.awt.Color(204, 204, 204));
        jbBuscarID.setText("Buscar");
        jbBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarIDActionPerformed(evt);
            }
        });

        jtBuscarID.setBackground(new java.awt.Color(204, 204, 204));
        jtBuscarID.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jtBuscarID.setForeground(new java.awt.Color(51, 51, 51));
        jtBuscarID.setSelectionColor(new java.awt.Color(204, 204, 204));
        jtBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarIDActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Por ID");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Por DNI");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Por Nombre");

        jtBuscarDNI.setBackground(new java.awt.Color(204, 204, 204));
        jtBuscarDNI.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jtBuscarDNI.setForeground(new java.awt.Color(51, 51, 51));
        jtBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBuscarDNIActionPerformed(evt);
            }
        });

        jtBuscarNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtBuscarNombre.setFont(new java.awt.Font("Ebrima", 0, 12)); // NOI18N
        jtBuscarNombre.setForeground(new java.awt.Color(51, 51, 51));

        jbBuscarDNI.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscarDNI.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbBuscarDNI.setForeground(new java.awt.Color(204, 204, 204));
        jbBuscarDNI.setText("Buscar");
        jbBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarDNIActionPerformed(evt);
            }
        });

        jbBuscarNombre.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscarNombre.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbBuscarNombre.setForeground(new java.awt.Color(204, 204, 204));
        jbBuscarNombre.setText("Buscar");
        jbBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarNombreActionPerformed(evt);
            }
        });

        jtTablaSocio.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaSocio);

        jbSalir.setBackground(new java.awt.Color(51, 51, 51));
        jbSalir.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(204, 204, 204));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbModificar.setBackground(new java.awt.Color(51, 51, 51));
        jbModificar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(204, 204, 204));
        jbModificar.setText("Modificar Datos");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbDarbaja.setBackground(new java.awt.Color(162, 17, 17));
        jbDarbaja.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbDarbaja.setForeground(new java.awt.Color(204, 204, 204));
        jbDarbaja.setText("Dar Baja");
        jbDarbaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarbajaActionPerformed(evt);
            }
        });

        jrbActivos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jrbActivos.setForeground(new java.awt.Color(204, 204, 204));
        jrbActivos.setText("Activos");
        jrbActivos.setToolTipText("");
        jrbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivosActionPerformed(evt);
            }
        });

        jrbInactivos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jrbInactivos.setForeground(new java.awt.Color(204, 204, 204));
        jrbInactivos.setText("Inactivos");
        jrbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivosActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Socio");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jbDaralta.setBackground(new java.awt.Color(21, 103, 21));
        jbDaralta.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbDaralta.setForeground(new java.awt.Color(204, 204, 204));
        jbDaralta.setText("Dar Alta");
        jbDaralta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDaraltaActionPerformed(evt);
            }
        });

        jrbTodos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jrbTodos.setForeground(new java.awt.Color(204, 204, 204));
        jrbTodos.setText("Todos");
        jrbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTodosActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jbBuscarID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtBuscarID, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtBuscarDNI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtBuscarNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscarDNI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscarNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbDarbaja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jrbActivos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jrbInactivos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbDaralta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jrbTodos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jbDarbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jbDaralta, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(568, 568, 568)
                        .addComponent(jbBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(322, 322, 322)
                        .addComponent(jrbTodos)
                        .addGap(79, 79, 79)
                        .addComponent(jrbInactivos))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(42, 42, 42))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jrbActivos)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jbBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 834, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(27, 27, 27)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jbBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbActivos)
                    .addComponent(jrbTodos)
                    .addComponent(jrbInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDaralta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbDarbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        setBounds(10, 0, 864, 518);
    }// </editor-fold>//GEN-END:initComponents

    private void jtBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBuscarDNIActionPerformed

    private void jbBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarNombreActionPerformed
        borrarFilaTabla();

        try {
            String nombre = jtBuscarNombre.getText();

            // Verifica que el nombre no incluya números ni símbolos, pero sí la Ñ y acentos
            if (!nombre.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+")) {
                throw new IllegalArgumentException("El nombre solo debe contener letras.");
            }

            List<Socio> sociosEncontrados = socioData.buscarSocioNombre(nombre);

            if (!sociosEncontrados.isEmpty()) {
                for (Socio socio : sociosEncontrados) {
                    modelo.addRow(new Object[]{
                        socio.getIdSocio(), socio.getDniSocio(),
                        socio.getNombre(), socio.getApellido(),
                        socio.getEdad(), socio.getCorreo(),
                        socio.getTelefono(), socio.isEstado() ? "Activo" : "Inactivo"
                    });
                }
            } else {
                JOptionPane.showMessageDialog(this, "Socio no encontrado.");
            }
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(this, "El nombre solo debe contener letras.");
        }

        limpiarCampos();
        limpiarRButton();
    }//GEN-LAST:event_jbBuscarNombreActionPerformed

    private void jbBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarIDActionPerformed

        // Borrar filas existentes en la tabla antes de realizar la búsqueda
        borrarFilaTabla();

        try {
            // Obtener el ID ingresado por el usuario
            Integer id = Integer.parseInt(jtBuscarID.getText());

            // Realizar la búsqueda del socio por ID
            Socio socioEncontrado = socioData.buscarSocioId(id);

            // Si se encontró un socio con el ID especificado, agregarlo a la tabla
            if (socioEncontrado != null) {
                modelo.addRow(new Object[]{
                    socioEncontrado.getIdSocio(), socioEncontrado.getDniSocio(),
                    socioEncontrado.getNombre(), socioEncontrado.getApellido(),
                    socioEncontrado.getEdad(), socioEncontrado.getCorreo(),
                    socioEncontrado.getTelefono(), socioEncontrado.isEstado() ? "Activo" : "Inactivo"
                });
            } else {
                JOptionPane.showMessageDialog(this, "Socio no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido para el ID.");
        }
        limpiarCampos();
        limpiarRButton();
    }//GEN-LAST:event_jbBuscarIDActionPerformed

    private void jbDaraltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDaraltaActionPerformed
    try {
        int idSocio = (int) jtTablaSocio.getValueAt(jtTablaSocio.getSelectedRow(), 0);
        if (idSocio == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un socio de la tabla.");
            return;
        }

        Socio socio = socioData.buscarSocioId(idSocio);

        if (socio != null) {
            if (!socio.isEstado()) {
                socio.setEstado(true);
                socioData.modificarSocio(socio);
                borrarFilaTabla();
                cargarSocios();
            } else {
                JOptionPane.showMessageDialog(this, "El socio ya está activo.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontró el socio con ID: " + idSocio);
        }
    } catch (ArrayIndexOutOfBoundsException e) {
        JOptionPane.showMessageDialog(this, "Seleccione una línea válida en la tabla.");
    }
    }//GEN-LAST:event_jbDaraltaActionPerformed

    private void jrbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTodosActionPerformed
        borrarFilaTabla();
        cargarSocios();
        jrbActivos.setSelected(false);
        jrbInactivos.setSelected(false);
        limpiarCampos();
    }//GEN-LAST:event_jrbTodosActionPerformed

    private void jrbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivosActionPerformed
        borrarFilaTabla();
        cargarSociosAct();
        jrbInactivos.setSelected(false);
        jrbTodos.setSelected(false);
        limpiarCampos();


    }//GEN-LAST:event_jrbActivosActionPerformed

    private void jrbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivosActionPerformed
        borrarFilaTabla();
        cargarSociosInact();
        jrbTodos.setSelected(false);
        jrbActivos.setSelected(false);
        limpiarCampos();
    }//GEN-LAST:event_jrbInactivosActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        int idSocio = (int) jtTablaSocio.getValueAt(jtTablaSocio.getSelectedRow(), 0);
        jDesktopPane1.removeAll();
        ActualizarSocio actSocio = new ActualizarSocio(idSocio);
        actSocio.setVisible(true);
        jDesktopPane1.add(actSocio);
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jtBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarIDActionPerformed


    }//GEN-LAST:event_jtBuscarIDActionPerformed

    private void jbBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarDNIActionPerformed
        borrarFilaTabla();

        try {

            String dni = jtBuscarDNI.getText();

            // verificamos que solo tenga numero el dni
            if (!dni.matches("\\d+")) {
                throw new NumberFormatException("El DNI debe contener solo números.");
            }

            Socio socioEncontrado = socioData.buscarSocioDni(dni);

            if (socioEncontrado != null) {
                modelo.addRow(new Object[]{
                    socioEncontrado.getIdSocio(), socioEncontrado.getDniSocio(),
                    socioEncontrado.getNombre(), socioEncontrado.getApellido(),
                    socioEncontrado.getEdad(), socioEncontrado.getCorreo(),
                    socioEncontrado.getTelefono(), socioEncontrado.isEstado() ? "Activo" : "Inactivo"
                });
            } else {
                JOptionPane.showMessageDialog(this, "Socio no encontrado.");
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un número válido para el DNI.");
        }
        limpiarCampos();
        limpiarRButton();
    }//GEN-LAST:event_jbBuscarDNIActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbDarbajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarbajaActionPerformed
       
        try {
        int idSocio = (int) jtTablaSocio.getValueAt(jtTablaSocio.getSelectedRow(), 0);
        if (idSocio == -1) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione un socio de la tabla.");
            return;
        }

        Socio socio = socioData.buscarSocioId(idSocio);

        if (socio != null) {
            if (socio.isEstado() == true) {
                socioData.darDeBajaSocio(idSocio);
                borrarFilaTabla();
                cargarSocios();
              
            } else {
                JOptionPane.showMessageDialog(rootPane, "El socio ya está inactivo.");
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se encontró el socio con ID: " + idSocio);
        }
        } catch (ArrayIndexOutOfBoundsException e) {
        JOptionPane.showMessageDialog(this, "Seleccione una línea válida en la tabla.");
    }
    }//GEN-LAST:event_jbDarbajaActionPerformed

    private void actualizarTabla(List<Socio> listaSocios1) {
        DefaultTableModel modelo = (DefaultTableModel) jtTablaSocio.getModel();
        modelo.setRowCount(0);

        for (Socio socio : listaSocios) {
            modelo.addRow(new Object[]{
                socio.getIdSocio(), socio.getDniSocio(), socio.getNombre(), socio.getApellido(),
                socio.getEdad(), socio.getCorreo(), socio.getTelefono(), socio.isEstado() ? "Activo" : "Inactivo"
            });
        }
    }

    private void armarCabeceraTabla() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("Nombre");
        filaCabecera.add("Apellido");
        filaCabecera.add("Edad");
        filaCabecera.add("Correo");
        filaCabecera.add("Telefono");
        filaCabecera.add("Estado");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtTablaSocio.setModel(modelo);
    }

    private void limpiarCampos() {
        jtBuscarID.setText("");
        jtBuscarDNI.setText("");
        jtBuscarNombre.setText("");
    }

    private void limpiarRButton() {
        jrbTodos.setSelected(false);
        jrbActivos.setSelected(false);
        jrbInactivos.setSelected(false);
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void cargarSocios() {

        List<Socio> listaSocios = socioData.listarTodosSocios();
        for (Socio socio : listaSocios) {
            modelo.addRow(new Object[]{
                socio.getIdSocio(), socio.getDniSocio(), socio.getNombre(), socio.getApellido(),
                socio.getEdad(), socio.getCorreo(), socio.getTelefono(), socio.isEstado() ? "Activo" : "Inactivo"
            });

        }

    }

    private void cargarSociosAct() {
        List<Socio> listaAct = socioData.listarSociosActivos();

        for (Socio socio : listaAct) {
            modelo.addRow(new Object[]{
                socio.getIdSocio(), socio.getDniSocio(), socio.getNombre(), socio.getApellido(),
                socio.getEdad(), socio.getCorreo(), socio.getTelefono(), socio.isEstado() ? "Activo" : "Inactivo"
            });

        }
    }

    private void cargarSociosInact() {
        List<Socio> listaInact = socioData.listarSociosInactivos();

        for (Socio socio : listaInact) {
            modelo.addRow(new Object[]{
                socio.getIdSocio(), socio.getDniSocio(), socio.getNombre(), socio.getApellido(),
                socio.getEdad(), socio.getCorreo(), socio.getTelefono(), socio.isEstado() ? "Activo" : "Inactivo"
            });
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscarDNI;
    private javax.swing.JButton jbBuscarID;
    private javax.swing.JButton jbBuscarNombre;
    private javax.swing.JButton jbDaralta;
    private javax.swing.JButton jbDarbaja;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbActivos;
    private javax.swing.JRadioButton jrbInactivos;
    private javax.swing.JRadioButton jrbTodos;
    private javax.swing.JTextField jtBuscarDNI;
    private javax.swing.JTextField jtBuscarID;
    private javax.swing.JTextField jtBuscarNombre;
    private javax.swing.JTable jtTablaSocio;
    // End of variables declaration//GEN-END:variables
}
