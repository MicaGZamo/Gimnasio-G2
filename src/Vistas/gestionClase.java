/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

import AccesoData.ClaseData;
import AccesoData.EntrenadorData;
import Entidades.Clase;
import Entidades.Entrenador;
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
public class gestionClase extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo;
    private ClaseData cD = new ClaseData();
    private Clase clase = new Clase();
    private EntrenadorData eD = new EntrenadorData();
    private ArrayList<Clase> clasesLista;
    private ArrayList<LocalTime> listaHorario;

    public gestionClase() {
        initComponents();
        clasesLista = (ArrayList<Clase>) cD.listarTodasClases();
        modelo = new DefaultTableModel();

        armarCabeceraTabla();
       
        clasesPorNombre();
        horariosDisponibles();
         cargarClases();
    }

    private void borrarFilaTabla() {
        int indice = modelo.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }

    private void armarCabeceraTabla() {

        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("Nombre");
        filaCabecera.add("Entrenador");
        filaCabecera.add("Horario");
        filaCabecera.add("Capasidad");
        filaCabecera.add("Estado");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtClases.setModel(modelo);
    }

    private void cargarClases() {

        for (Clase c : clasesLista) {
            modelo.addRow(new Object[]{c.getIdClase(), c.getNombre(), c.getEntrenador().getNombreE(), c.getHorario(), c.getCapacidad(), c.isEstado()});
        }

    }

    private void cargarClasesActivas() {
        List<Clase> listaActivas = cD.listarClasesActivas();
        for (Clase c : listaActivas) {
            modelo.addRow(new Object[]{c.getIdClase(), c.getNombre(), c.getEntrenador().getNombreE(), c.getHorario(), c.getCapacidad(), c.isEstado()});

        }
    }

    private void cargarClasesInactivas() {
        List<Clase> listaActivas = cD.listarClasesInactivas();
        for (Clase c : listaActivas) {
            modelo.addRow(new Object[]{c.getIdClase(), c.getNombre(), c.getEntrenador().getNombreE(), c.getHorario(), c.getCapacidad(), c.isEstado()});

        }
    }

    private void cargarClasesPorEntrenador() {
        String selec = jtBuscarDni.getText();
        String regularDni = "\\d+";
        if (!selec.matches(regularDni)) {
            JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos numéricos.");
            return;
        }

        Entrenador ent = eD.buscarPorDni(selec);
        List<Clase> lista = cD.buscarClasePorEntrenador(ent.getNombreE(), ent.getApellidoE());
        for (Clase c : lista) {
            modelo.addRow(new Object[]{c.getIdClase(), c.getNombre(), c.getEntrenador().getNombreE(), c.getHorario(), c.getCapacidad(), c.isEstado()});
        }
    }

    private void clasesPorNombre() {
        Set<String> nombresDeClases = new HashSet<>();
        List<Clase> clases = cD.listarTodasClases();

        for (Clase clase : clases) {
            nombresDeClases.add(clase.getNombre());
        }

        for (String nombre : nombresDeClases) {
            jcbClases.addItem(nombre);
        }
    }

    private void cargarClaseNombre() {
        String claseN = (String) jcbClases.getSelectedItem();
        List<Clase> lista = cD.buscarClase(claseN);
        for (Clase c : lista) {
            modelo.addRow(new Object[]{c.getIdClase(), c.getNombre(), c.getEntrenador().getNombreE(), c.getHorario(), c.getCapacidad(), c.isEstado()});

        }
    }

    public void cargarClaseHorario() {
        Object selectedItem = jcbHorario.getSelectedItem();
        LocalTime horario = (LocalTime) selectedItem;
        clase = cD.buscarClasePorHorario(horario);

        modelo.addRow(new Object[]{clase.getIdClase(), clase.getNombre(), clase.getEntrenador().getNombreE(), clase.getHorario(), clase.getCapacidad(), clase.isEstado()});

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtBuscarDni = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jrbActivas = new javax.swing.JRadioButton();
        jrbInactivas = new javax.swing.JRadioButton();
        jrbTodas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClases = new javax.swing.JTable();
        jbActualizar = new javax.swing.JButton();
        jbBaja = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jcbClases = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jcbHorario = new javax.swing.JComboBox<>();

        jLabel1.setText("Gestion Clases");

        jLabel2.setText("Busqueda por entrenador");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jrbActivas.setText("Activas");
        jrbActivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivasActionPerformed(evt);
            }
        });

        jrbInactivas.setText("Inactivas");
        jrbInactivas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivasActionPerformed(evt);
            }
        });

        jrbTodas.setText("Todas");
        jrbTodas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTodasActionPerformed(evt);
            }
        });

        jtClases.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtClases);

        jbActualizar.setText("Modificar Datos");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbBaja.setText("Dar baja");
        jbBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBajaActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jcbClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClasesActionPerformed(evt);
            }
        });

        jLabel3.setText("Busqueda por Clase");

        jButton1.setText("Dar alta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Buscar por horario");

        jcbHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHorarioActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtBuscarDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jrbActivas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jrbInactivas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jrbTodas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBaja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbClases, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbHorario, javax.swing.JLayeredPane.DEFAULT_LAYER);

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
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBaja)
                        .addGap(81, 81, 81)
                        .addComponent(jbActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir)))
                .addContainerGap())
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(79, 79, 79)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jcbClases, 0, 118, Short.MAX_VALUE)
                            .addComponent(jtBuscarDni))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jbBuscar))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jrbActivas))
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jrbInactivas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jrbTodas)
                                .addGap(29, 29, 29))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jcbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(29, 29, 29))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscar)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jtBuscarDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jcbClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jcbHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbActivas)
                    .addComponent(jrbInactivas)
                    .addComponent(jrbTodas))
                .addGap(9, 9, 9)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar)
                    .addComponent(jbBaja)
                    .addComponent(jbSalir)
                    .addComponent(jButton1))
                .addGap(22, 22, 22))
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

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        clase = new Clase();
        int selecId = (int) jtClases.getValueAt(jtClases.getSelectedRow(), 0);
        System.out.println(selecId);
        Clase clase = cD.buscarClaseId(selecId);
        System.out.println(clase);
        jDesktopPane1.removeAll();
        ActualizarClase actualizarC = new ActualizarClase(clase);
        actualizarC.setVisible(true);

        jDesktopPane1.add(actualizarC);
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jrbActivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivasActionPerformed
        borrarFilaTabla();
        cargarClasesActivas();
    }//GEN-LAST:event_jrbActivasActionPerformed

    private void jrbInactivasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivasActionPerformed
        borrarFilaTabla();
        cargarClasesInactivas();

    }//GEN-LAST:event_jrbInactivasActionPerformed

    private void jrbTodasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTodasActionPerformed
        borrarFilaTabla();
        cargarClases();
    }//GEN-LAST:event_jrbTodasActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        borrarFilaTabla();
        cargarClasesPorEntrenador();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClasesActionPerformed
        borrarFilaTabla();
        cargarClaseNombre();
    }//GEN-LAST:event_jcbClasesActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBajaActionPerformed
        clase = new Clase();
        int selecId = (int) jtClases.getValueAt(jtClases.getSelectedRow(), 0);
        System.out.println(selecId);
        Clase clase = cD.buscarClaseId(selecId);
        clase.setEstado(false);
        cD.modificarClase(clase);
    }//GEN-LAST:event_jbBajaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        clase = new Clase();
        int selecId = (int) jtClases.getValueAt(jtClases.getSelectedRow(), 0);
        System.out.println(selecId);
        Clase clase = cD.buscarClaseId(selecId);
        clase.setEstado(false);
        cD.modificarClase(clase);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jcbHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHorarioActionPerformed
        borrarFilaTabla();
        cargarClaseHorario();
    }//GEN-LAST:event_jcbHorarioActionPerformed

    private void horariosDisponibles() {
        listaHorario = (ArrayList<LocalTime>) cD.listarHorariosClasesActivas();
        for (LocalTime item : listaHorario) {
            jcbHorario.addItem(item);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBaja;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbClases;
    private javax.swing.JComboBox<LocalTime> jcbHorario;
    private javax.swing.JRadioButton jrbActivas;
    private javax.swing.JRadioButton jrbInactivas;
    private javax.swing.JRadioButton jrbTodas;
    private javax.swing.JTextField jtBuscarDni;
    private javax.swing.JTable jtClases;
    // End of variables declaration//GEN-END:variables
}
