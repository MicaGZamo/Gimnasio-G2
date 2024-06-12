/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoData.AsistenciaData;
import AccesoData.ClaseData;
import AccesoData.SocioData;
import Entidades.Asistencia;
import Entidades.Clase;
import Entidades.Socio;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author gomez
 */
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

        jLabel1.setText("Socio");

        jtDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDniActionPerformed(evt);
            }
        });

        jbBuscarPorDni.setText("Buscar");
        jbBuscarPorDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarPorDniActionPerformed(evt);
            }
        });

        jLabel2.setText("Clase");

        jcbClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClaseActionPerformed(evt);
            }
        });

        jLabel3.setText("Horario");

        jcbHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHorarioActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3))))
                        .addGap(98, 98, 98)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtDni)
                                    .addComponent(jcbClase, 0, 186, Short.MAX_VALUE)
                                    .addComponent(jcbHorario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(114, 114, 114)
                                .addComponent(jbBuscarPorDni)))
                        .addGap(0, 191, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarPorDni))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcbClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jdcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalir)
                    .addComponent(jbLimpiar))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jtDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDniActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        borrarFilaTabla();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBuscarPorDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarPorDniActionPerformed
        borrarFilaTabla();
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
        }
    }//GEN-LAST:event_jbBuscarPorDniActionPerformed

    private void jcbHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHorarioActionPerformed
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
        String claseN = (String) jcbClase.getSelectedItem();
       List<Clase>  clase = cD.buscarClase(claseN);
         for (Clase c : clase) {
        List<Asistencia> lista = aD.buscarPorClase(c);

        for (Asistencia a : lista) {
            modelo.addRow(new Object[]{a.getIdAsistencia(), a.getSocio().getApellido(), a.getClase().getNombre(), a.getFechaAsistencia(), a.getClase().getHorario()});
        }
         }
    }

    public void cargarAsistenciaHorario() {
        Object selectedItem = jcbHorario.getSelectedItem();
        LocalTime horario = (LocalTime) selectedItem;
        clase = cD.buscarClasePorHorario(horario);
        System.out.println(clase);
        List<Asistencia> lista = aD.buscarPorClase(clase);
        for (Asistencia a : lista) {
            modelo.addRow(new Object[]{a.getIdAsistencia(), a.getSocio().getApellido(), a.getClase().getNombre(), a.getFechaAsistencia(), a.getClase().getHorario()});
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscarPorDni;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbClase;
    private javax.swing.JComboBox<LocalTime> jcbHorario;
    private com.toedter.calendar.JDateChooser jdcFecha;
    private javax.swing.JTable jtAsistencia;
    private javax.swing.JTextField jtDni;
    // End of variables declaration//GEN-END:variables
}
