package Vistas;

import AccesoData.AsistenciaData;
import AccesoData.ClaseData;
import AccesoData.MembresiaData;
import AccesoData.SocioData;
import Entidades.Asistencia;
import Entidades.Clase;
import Entidades.Membresia;
import Entidades.Socio;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

public class nuevaAsistencia extends javax.swing.JInternalFrame {

    /**
     * Creates new form Asistencia
     */
    private AsistenciaData AData;
    private SocioData SData;
    private ClaseData CData;
    private MembresiaData MData;
    private DefaultTableModel modeloMembresia;
    private DefaultTableModel modeloClase;
    private Socio s = null;
    private Clase c = null;
    private Membresia m = null;
    private ArrayList<LocalTime> listaHorario;

    public nuevaAsistencia() {
        initComponents();
        fechahoy();
        modeloMembresia = new DefaultTableModel();
        modeloClase = new DefaultTableModel();
        s = new Socio();
        c = new Clase();
        m = new Membresia();
        SData = new SocioData();
        CData = new ClaseData();
        MData = new MembresiaData();
        AData = new AsistenciaData();
        armarCabeceraTablaMembresia();
        armarCabeceraTablaClase();
        horariosDisponibles();
        clasesPorNombre();
    }

    private void armarCabeceraTablaMembresia() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Pases");
        filaCabecera.add("Inicio");
        filaCabecera.add("Finaliza");
        filaCabecera.add("Membresia");

        for (Object it : filaCabecera) {
            modeloMembresia.addColumn(it);
        }
        jtTablaMembresiaSocio.setModel(modeloMembresia);
    }

    private void armarCabeceraTablaClase() {
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("Clase");
        filaCabecera.add("Entrenador");
        filaCabecera.add("Horario");
        filaCabecera.add("Capacidad");

        for (Object it : filaCabecera) {
            modeloClase.addColumn(it);
        }
        jtTablaClase.setModel(modeloClase);
    }

    private void borrarFilaTablaMembresia() {
        int indice = modeloMembresia.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modeloMembresia.removeRow(i);
        }
    }

    private void borrarFilaTablaClase() {
        int indice = modeloClase.getRowCount() - 1;
        for (int i = indice; i >= 0; i--) {
            modeloClase.removeRow(i);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtfDni = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtfNombreApellido = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfFechaHoy = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaClase = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jbLimpiar = new javax.swing.JButton();
        jbRegistrar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtTablaMembresiaSocio = new javax.swing.JTable();
        jcbHorario1 = new javax.swing.JComboBox<>();
        jcbClases = new javax.swing.JComboBox<>();

        jLabel1.setText("Control asistencia");

        jLabel2.setText("DNI Socio");

        jLabel3.setText("Clase");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jtfNombreApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreApellidoActionPerformed(evt);
            }
        });

        jLabel5.setText("Horario");

        jtfFechaHoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfFechaHoyActionPerformed(evt);
            }
        });

        jtTablaClase.setModel(new javax.swing.table.DefaultTableModel(
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
        jtTablaClase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaClaseMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtTablaClase);

        jLabel4.setText("Fecha:");

        jbLimpiar.setText("Limpiar");
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jtTablaMembresiaSocio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTablaMembresiaSocio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaMembresiaSocioMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jtTablaMembresiaSocio);

        jcbHorario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHorario1ActionPerformed(evt);
            }
        });

        jcbClases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbClasesActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfNombreApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtfFechaHoy, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbLimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbRegistrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbHorario1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jcbClases, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfFechaHoy, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addComponent(jbLimpiar)
                                    .addGap(108, 108, 108)
                                    .addComponent(jbRegistrar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbSalir))))))
                .addGap(23, 23, 23))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbClases, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jbBuscar))
                            .addComponent(jtfNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfFechaHoy, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jtfNombreApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addGap(34, 34, 34)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jcbHorario1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbClases, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbRegistrar)
                    .addComponent(jbSalir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        borrarFilaTablaClase();
        borrarFilaTablaMembresia();
        jtfDni.setText("");
        jtfNombreApellido.setText("");
        //entrenadorActual=null;
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jtfFechaHoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfFechaHoyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfFechaHoyActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        borrarFilaTablaMembresia();
        LocalDate hoy = LocalDate.now();
        String dniSocio = jtfDni.getText();
        Socio s = SData.buscarSocioDni(dniSocio);
        jtfNombreApellido.setText(s.getNombre() + " " + s.getApellido());
        List<Membresia> lista = MData.buscarPorSocio(s);

        for (Membresia m : lista) {
            System.out.println("fecha fin " + m.getFechaFin());
            System.out.println("Fecha hoy " + hoy);
            System.out.println((m.getFechaFin().isBefore(hoy)));
            
            if (m.getFechaFin().isBefore(hoy)) {
                System.out.println((m.getFechaFin().isBefore(hoy)));
                m.setEstado(false);
                MData.darBajaMembresia(m.getIdMembresia());
                
            }
            modeloMembresia.addRow(new Object[]{
                m.getCantPases(),
                m.getFechaInicio(),
                m.getFechaFin(),
                //m.isEstado()
                m.isEstado() ? "Activo" : "Inactivo"
            });
        }


    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jcbClasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbClasesActionPerformed
        borrarFilaTablaClase();
        cargarClaseNombre();


    }//GEN-LAST:event_jcbClasesActionPerformed

    private void jcbHorario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHorario1ActionPerformed
        // TODO add your handling code here:
        borrarFilaTablaClase();
        cargarClaseHorario();
    }//GEN-LAST:event_jcbHorario1ActionPerformed

    private void jtTablaMembresiaSocioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaMembresiaSocioMouseClicked
        // TODO add your handling code here:
        String estadoM = (String) jtTablaMembresiaSocio.getValueAt(jtTablaMembresiaSocio.getSelectedRow(), 3); // captura estado
        System.out.println("estadoM: " + estadoM);

        if (estadoM == "Activo") {
            jbRegistrar.setEnabled(true); // activa boton registrar
        } else {
            JOptionPane.showMessageDialog(null, "Membresia vencida");
            jbRegistrar.setEnabled(false);// Desactiva boton registrar
        }

    }//GEN-LAST:event_jtTablaMembresiaSocioMouseClicked

    private void jtTablaClaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaClaseMouseClicked
        // Verificacion de asistencia

        int capacidadTotal = (Integer) jtTablaClase.getValueAt(jtTablaClase.getSelectedRow(), 3); // captura capacidad
        int asistencias = 0;
        int capacidadCuenta;
        LocalDate hoy = LocalDate.now();

        List<Asistencia> lista = AData.ListarPorFecha(hoy);

        for (Asistencia a : lista) {
            //cuenta asistencias por clase seleccionada
            if (a.getClase().getNombre().equals((String) jtTablaClase.getValueAt(jtTablaClase.getSelectedRow(), 0))) {
                asistencias++;
            }
        }
        //System.out.println("Asistencia: "+asistencias);
        capacidadCuenta = capacidadTotal - asistencias;

        if (capacidadCuenta > 0) { //verifica si hay cupo disponible para esa clase
            //System.out.println("capacidad mayor a cero");
            jbRegistrar.setEnabled(true); // activa boton registrar
        } else {
            JOptionPane.showMessageDialog(null, "Clase sin capacidad");
            jbRegistrar.setEnabled(false);// Desactiva boton registrar
        }
    }//GEN-LAST:event_jtTablaClaseMouseClicked

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        // TODO add your handling code here:-----------------------------------------------------------
        LocalDate hoy = LocalDate.now();

        String dniSocio = jtfDni.getText();
        Socio s = SData.buscarSocioDni(dniSocio);

        //Lo mejor seria buscar por id
        Object selectedItem = jtTablaClase.getValueAt(jtTablaClase.getSelectedRow(), 2);
        LocalTime horario = (LocalTime) selectedItem;
        Clase c = CData.buscarClasePorHorario(horario);

        Asistencia as = new Asistencia(s, c, hoy);

        AData.guardarAsistencia(as);


    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jtfNombreApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreApellidoActionPerformed

    private void fechahoy() {
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String FechaFormateada = hoy.format(formato);
        jtfFechaHoy.setColumns(10);
        jtfFechaHoy.setText(FechaFormateada);
    }

    private void horariosDisponibles() {
        listaHorario = (ArrayList<LocalTime>) CData.listarHorariosClasesActivas();
        for (LocalTime item : listaHorario) {
            jcbHorario1.addItem(item);
        }
    }

    private void clasesPorNombre() {
        Set<String> nombresDeClases = new HashSet<>();
        List<Clase> clases = CData.listarTodasClases();

        for (Clase clase : clases) {
            nombresDeClases.add(clase.getNombre());
        }

        for (String nombre : nombresDeClases) {
            jcbClases.addItem(nombre);
        }
    }

    private void cargarClaseNombre() {
        String claseN = (String) jcbClases.getSelectedItem();
        List<Clase> lista = CData.buscarClase(claseN);
        for (Clase c : lista) {
            if (c.isEstado()) {
                modeloClase.addRow(new Object[]{c.getNombre(), c.getEntrenador().getNombreE(), c.getHorario(), c.getCapacidad()});
            }
        }
    }

    public void cargarClaseHorario() {
        Object selectedItem = jcbHorario1.getSelectedItem();
        LocalTime horario = (LocalTime) selectedItem;
        Clase c = CData.buscarClasePorHorario(horario);

        modeloClase.addRow(new Object[]{c.getNombre(), c.getEntrenador().getNombreE(), c.getHorario(), c.getCapacidad()});

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<String> jcbClases;
    private javax.swing.JComboBox<LocalTime> jcbHorario1;
    private javax.swing.JTable jtTablaClase;
    private javax.swing.JTable jtTablaMembresiaSocio;
    private javax.swing.JTextField jtfDni;
    private javax.swing.JTextField jtfFechaHoy;
    private javax.swing.JTextField jtfNombreApellido;
    // End of variables declaration//GEN-END:variables
}
