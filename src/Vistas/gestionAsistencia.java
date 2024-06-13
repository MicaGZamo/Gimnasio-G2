
package Vistas;

import AccesoData.AsistenciaData;
import AccesoData.ClaseData;
import AccesoData.SocioData;
import Entidades.Asistencia;
import Entidades.Clase;
import Entidades.Socio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class gestionAsistencia extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ClaseData cD = new ClaseData();
    private Clase clase = new Clase();
    private Socio socio = new Socio();
    private SocioData sD = new SocioData();
    private AsistenciaData aD = new AsistenciaData();

    public gestionAsistencia() {
        initComponents();
        modelo = new DefaultTableModel();
        armarCabeceraTabla();
        clasesPorNombre();
        horariosClases();
        cargarTodas();

    }

    private void armarCabeceraTabla() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Socio");
        filaCabecera.add("Clase");
        filaCabecera.add("Fecha");
        filaCabecera.add("Horario");

        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtAsistencia.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAsistencia = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jbBuscarPorDni = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jcbClase = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jcbHorario = new javax.swing.JComboBox<>();
        jdcFecha = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jbBuscarfecha = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jtcantidadAsistencias = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jtAsistencia.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtAsistencia);

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("DNI Socio");

        jtDni.setBackground(new java.awt.Color(204, 204, 204));
        jtDni.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jtDni.setForeground(new java.awt.Color(51, 51, 51));
        jtDni.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });

        jbBuscarPorDni.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscarPorDni.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbBuscarPorDni.setForeground(new java.awt.Color(204, 204, 204));
        jbBuscarPorDni.setText("Buscar Socio");
        jbBuscarPorDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPorDniActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Clase");

        jcbClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClaseActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Horario");

        jcbHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jcbHorarioMouseClicked(evt);
            }
        });
        jcbHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHorarioActionPerformed(evt);
            }
        });

        jdcFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdcFechaMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Fecha");

        jbLimpiar.setBackground(new java.awt.Color(51, 51, 51));
        jbLimpiar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbLimpiar.setForeground(new java.awt.Color(204, 204, 204));
        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setBackground(new java.awt.Color(169, 50, 50));
        jbSalir.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(230, 218, 218));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbBuscarfecha.setBackground(new java.awt.Color(51, 51, 51));
        jbBuscarfecha.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbBuscarfecha.setForeground(new java.awt.Color(204, 204, 204));
        jbBuscarfecha.setText("Buscar por Fecha");
        jbBuscarfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarfechaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad de asistencias");

        jtcantidadAsistencias.setEditable(false);
        jtcantidadAsistencias.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jtcantidadAsistencias.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtcantidadAsistencias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Administrar Asistencias");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscarPorDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbClase, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbHorario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jdcFecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbLimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscarfecha, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtcantidadAsistencias, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127)
                .addComponent(jtcantidadAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(31, 31, 31)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtDni)
                                    .addComponent(jdcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)))
                            .addComponent(jcbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jbBuscarfecha))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbBuscarPorDni, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jcbClase, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6))))))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel5))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(jLabel6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbBuscarPorDni, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(9, 9, 9)))
                        .addGap(9, 9, 9))
                    .addComponent(jbBuscarfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jcbClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtcantidadAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setBounds(85, 0, 711, 484);
    }// </editor-fold>//GEN-END:initComponents


    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        borrarFilaTabla();
        jtDni.setText("");
        jtcantidadAsistencias.setText(" ");
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarPorDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPorDniActionPerformed
        borrarFilaTabla();
        jtcantidadAsistencias.setText(" ");
        int contador = 0;
        String dni = jtDni.getText();
        String regularDni = "\\d+";
        if (!dni.matches(regularDni)) {
            JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos numéricos.");
            return;
        }
        socio = sD.buscarSocioDni(dni);
        List<Asistencia> lista = aD.buscarPorSocio(socio);
        for (Asistencia a : lista) {
            modelo.addRow(new Object[]{a.getIdAsistencia(), a.getSocio().getApellido(), a.getClase().getNombre(), a.getFechaAsistencia(), a.getClase().getHorario()});
            contador++;
        }
        jtcantidadAsistencias.setText(String.valueOf(contador));
    }//GEN-LAST:event_jbBuscarPorDniActionPerformed

    private void jcbHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHorarioActionPerformed
        jtcantidadAsistencias.setText(" ");
        borrarFilaTabla();
        cargarAsistenciaHorario();

    }//GEN-LAST:event_jcbHorarioActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jcbClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClaseActionPerformed
        borrarFilaTabla();
        buscarPorClase();
    }//GEN-LAST:event_jcbClaseActionPerformed

    private void jcbHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jcbHorarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbHorarioMouseClicked

    private void jdcFechaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdcFechaMouseClicked
//        borrarFilaTabla();
//        jtcantidadAsistencias.setText(" ");
//        int contador=0;
//        Date fechaSeleccionada = jdcFecha.getDate();
//        LocalDate localDate = fechaSeleccionada.toInstant()
//                .atZone(ZoneId.systemDefault())
//                .toLocalDate();
//        List<Asistencia> lista = aD.ListarPorFecha(localDate);
//        for (Asistencia a : lista) {
//            modelo.addRow(new Object[]{a.getIdAsistencia(), a.getSocio().getApellido(), a.getClase().getNombre(), a.getFechaAsistencia(), a.getClase().getHorario()});
//        contador++;
//        }
//        jtcantidadAsistencias.setText(String.valueOf(contador));
    }//GEN-LAST:event_jdcFechaMouseClicked

    private void jbBuscarfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarfechaActionPerformed
        borrarFilaTabla();
        int contador = 0;
        Date fechaSeleccionada = jdcFecha.getDate();
        LocalDate localDate = fechaSeleccionada.toInstant()
                .atZone(ZoneId.systemDefault())
                .toLocalDate();
        List<Asistencia> lista = aD.ListarPorFecha(localDate);
        for (Asistencia a : lista) {
            modelo.addRow(new Object[]{a.getIdAsistencia(), a.getSocio().getApellido(), a.getClase().getNombre(), a.getFechaAsistencia(), a.getClase().getHorario()});
            contador++;
        }
        jtcantidadAsistencias.setText(String.valueOf(contador));
    }//GEN-LAST:event_jbBuscarfechaActionPerformed

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void clasesPorNombre() {
        Set<String> nombresDeClases = new HashSet<>();
        List<Clase> clases = cD.listarTodasClases();

        for (Clase clase : clases) {
            nombresDeClases.add(clase.getNombre());
        }

        for (String nombre : nombresDeClases) {
            jcbClase.addItem(nombre);
        }
    }

    private void horariosClases() {
        ArrayList<LocalTime> listaHorario = (ArrayList<LocalTime>) cD.listarHorariosClasesActivas();
        for (LocalTime item : listaHorario) {
            jcbHorario.addItem(item);

        }
    }

    public void buscarPorClase() {
        int contador = 0;
        String claseN = (String) jcbClase.getSelectedItem();
        List<Clase> clase = cD.buscarClase(claseN);
        for (Clase c : clase) {
            List<Asistencia> lista = aD.buscarPorClase(c);

            for (Asistencia a : lista) {
                modelo.addRow(new Object[]{a.getIdAsistencia(), a.getSocio().getApellido(), a.getClase().getNombre(), a.getFechaAsistencia(), a.getClase().getHorario()});
                contador++;
            }
            jtcantidadAsistencias.setText(String.valueOf(contador));
        }
    }

    public void cargarAsistenciaHorario() {
        int contador = 0;
        Object selectedItem = jcbHorario.getSelectedItem();
        LocalTime horario = (LocalTime) selectedItem;
        clase = cD.buscarClasePorHorario(horario);
        System.out.println(clase);
        List<Asistencia> lista = aD.buscarPorClase(clase);
        for (Asistencia a : lista) {
            modelo.addRow(new Object[]{a.getIdAsistencia(), a.getSocio().getApellido(), a.getClase().getNombre(), a.getFechaAsistencia(), a.getClase().getHorario()});
            contador++;
        }
        jtcantidadAsistencias.setText(String.valueOf(contador));

    }

    public void cargarTodas() {
        borrarFilaTabla();

        List<Asistencia> lista = aD.Listartodas();

        for (Asistencia a : lista) {

            modelo.addRow(new Object[]{
                a.getIdAsistencia(),
                a.getSocio().getApellido() + ", " + a.getSocio().getNombre(), // Apellido y nombre del socio
                a.getClase().getNombre(),
                a.getFechaAsistencia(),
                a.getClase().getHorario()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscarPorDni;
    private javax.swing.JButton jbBuscarfecha;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbClase;
    private javax.swing.JComboBox<LocalTime> jcbHorario;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTable jtAsistencia;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtcantidadAsistencias;
    // End of variables declaration//GEN-END:variables
}
