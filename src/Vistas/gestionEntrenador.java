
package Vistas;

import AccesoData.EntrenadorData;
import Entidades.Entrenador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class gestionEntrenador extends javax.swing.JInternalFrame {

    /**
     * Creates new form buscarYlistarEntrenador
     */
    private ArrayList<Entrenador> listaE;
    private EntrenadorData entrenadorData;
    private Entrenador entrenadorActual=null;
    private DefaultTableModel modelo;
    
    public gestionEntrenador() {
        initComponents();
        entrenadorData= new EntrenadorData();
        listaE = (ArrayList<Entrenador>) entrenadorData.listarEntrenadores();
        modelo=new DefaultTableModel();
        
        armarCabeceraTabla();
        cargarTodosEntrenadores();
        
    }
    
    private void armarCabeceraTabla(){
        ArrayList<Object> filaCabecera = new ArrayList<>();
        filaCabecera.add("ID");
        filaCabecera.add("DNI");
        filaCabecera.add("NOMBRE");
        filaCabecera.add("APELLIDO");
        filaCabecera.add("ESPECIALIDAD");
        filaCabecera.add("ESTADO");
        for (Object it : filaCabecera) {
            modelo.addColumn(it);
        }
        jtTablaEntrenadores.setModel(modelo);
    }
    
    private void borrarFilaTabla(){
        int indice = modelo.getRowCount()-1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void guardarEntrenador(){ //veeeer
        for (Entrenador item : listaE) {
            
            
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
        jLabel4 = new javax.swing.JLabel();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jtEspecialidad = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jrbActivos = new javax.swing.JRadioButton();
        jrbInactivos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTablaEntrenadores = new javax.swing.JTable();
        jbDarBaja = new javax.swing.JButton();
        jbModificar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jrbTodos = new javax.swing.JRadioButton();
        jbDarAlta = new javax.swing.JButton();

        jLabel1.setText("BUSCAR ENTRENADOR");

        jLabel2.setText("Por nombre");

        jLabel3.setText("Por apellido");

        jLabel4.setText("Por especialidad");

        jtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreActionPerformed(evt);
            }
        });

        jtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jrbActivos.setText("Activos");
        jrbActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbActivosActionPerformed(evt);
            }
        });

        jrbInactivos.setText("Inactivos");
        jrbInactivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbInactivosActionPerformed(evt);
            }
        });

        jtTablaEntrenadores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtTablaEntrenadores);

        jbDarBaja.setText("Dar Baja");
        jbDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarBajaActionPerformed(evt);
            }
        });

        jbModificar.setText("Modificar Datos");
        jbModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbModificarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jrbTodos.setText("Todos");
        jrbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbTodosActionPerformed(evt);
            }
        });

        jbDarAlta.setText("Dar Alta");
        jbDarAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDarAltaActionPerformed(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtEspecialidad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbBuscar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jrbActivos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jrbInactivos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbDarBaja, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbModificar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jrbTodos, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbDarAlta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(51, 51, 51)
                                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtNombre)
                                    .addComponent(jtApellido)
                                    .addComponent(jtEspecialidad, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))
                                .addGap(67, 67, 67)
                                .addComponent(jbBuscar))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(213, 213, 213)
                                .addComponent(jLabel1))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jrbActivos)
                                .addGap(52, 52, 52)
                                .addComponent(jrbInactivos)
                                .addGap(43, 43, 43)
                                .addComponent(jrbTodos)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbDarBaja)
                        .addGap(36, 36, 36)
                        .addComponent(jbDarAlta)
                        .addGap(81, 81, 81)
                        .addComponent(jbModificar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalir)
                        .addGap(28, 28, 28))))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jtEspecialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbActivos)
                    .addComponent(jrbInactivos)
                    .addComponent(jrbTodos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbDarBaja)
                    .addComponent(jbModificar)
                    .addComponent(jbSalir)
                    .addComponent(jbDarAlta))
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jrbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbTodosActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        cargarTodosEntrenadores();
        jrbActivos.setSelected(false);
        jrbInactivos.setSelected(false);
        jrbTodos.setSelected(true);
    }//GEN-LAST:event_jrbTodosActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        // TODO add your handling code here:
        //clase = new Clase();
       int idEntrenador=(int) jtTablaEntrenadores.getValueAt(jtTablaEntrenadores.getSelectedRow(),0);
       jDesktopPane1.removeAll();
       ActualizarEntrenador actualizarE = new ActualizarEntrenador(idEntrenador);
       actualizarE.setVisible(true);
       jDesktopPane1.add(actualizarE);
                                        
                
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jbDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarBajaActionPerformed
        // TODO add your handling code here: dar de baja a un entrenador
        int idEntrenador=(int) jtTablaEntrenadores.getValueAt(jtTablaEntrenadores.getSelectedRow(),0);
        entrenadorData.darBaja(idEntrenador);
        borrarFilaTabla();
        cargarEntrenadoresInactivos();
        
    }//GEN-LAST:event_jbDarBajaActionPerformed

    private void jrbInactivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbInactivosActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        cargarEntrenadoresInactivos();
        jrbActivos.setSelected(false);
        jrbInactivos.setSelected(true);
        jrbTodos.setSelected(false);
    }//GEN-LAST:event_jrbInactivosActionPerformed

    private void jtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoActionPerformed

    private void jtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here: buscar por nombre
        borrarFilaTabla();
        String nombre =jtNombre.getText();
        String apellido =jtApellido.getText();
        String especialidad=jtEspecialidad.getText();
//        System.out.println("nombre: "+nombre);
//        System.out.println("apellido: "+apellido);
//        System.out.println("Especialidad: "+especialidad);
        
        if(apellido.isEmpty() && especialidad.isEmpty()){ //busca por nombre cuando los campos apellido y especialidad estan vacios
            System.out.println("busqueda solo nombre");
            List<Entrenador> lista = entrenadorData.listarPorNombre(nombre);
            for (Entrenador e : lista) {
                modelo.addRow(new Object[] {e.getIdEntrenador(), e.getDniE(),e.getNombreE(),e.getApellidoE(),e.getEspecialidad(),e.isEstado()?"Activo" : "Inactivo"} );  
            }
        }
        
        if(nombre.isEmpty() && especialidad.isEmpty()){ // busca por apellido cuando los campos nombre y especialidad estan vacios
            List<Entrenador> lista = entrenadorData.listarPorApellido(apellido);
            for (Entrenador e : lista) {
                modelo.addRow(new Object[] {e.getIdEntrenador(), e.getDniE(),e.getNombreE(),e.getApellidoE(),e.getEspecialidad(),e.isEstado()?"Activo" : "Inactivo"} );  
            }
        }
        
        if(nombre.isEmpty() && apellido.isEmpty()){ // busca por especialidada cuando los campos nombre y pellido estan vacios
            List<Entrenador> lista = entrenadorData.listarPorEspecialidad(especialidad);
            for (Entrenador e : lista) {
                modelo.addRow(new Object[] {e.getIdEntrenador(), e.getDniE(),e.getNombreE(),e.getApellidoE(),e.getEspecialidad(),e.isEstado()?"Activo" : "Inactivo"} );  
            }
        }
        
        if(!nombre.isEmpty() && !apellido.isEmpty() && especialidad.isEmpty()){
            System.out.println("busqueda por nombre y apellido, sin especialidad");
            Entrenador e= entrenadorData.buscarPorNombreYApellido(nombre, apellido);
            modelo.addRow(new Object[] {e.getIdEntrenador(), e.getDniE(),e.getNombreE(),e.getApellidoE(),e.getEspecialidad(),e.isEstado()?"Activo" : "Inactivo"} );
        }
        
        if(!nombre.isEmpty() && !apellido.isEmpty() && !especialidad.isEmpty()){
            System.out.println("busqueda por nombre, apellido y especialidad");
            List<Entrenador> lista = entrenadorData.listarPorNombreApellidoEspecialidad(nombre, apellido, especialidad);
            for (Entrenador e : lista) {
                modelo.addRow(new Object[] {e.getIdEntrenador(), e.getDniE(),e.getNombreE(),e.getApellidoE(),e.getEspecialidad(),e.isEstado()?"Activo" : "Inactivo"} );  
            }
        }
        
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jrbActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbActivosActionPerformed
        // TODO add your handling code here:
        borrarFilaTabla();
        cargarEntrenadoresActivos();
        jrbActivos.setSelected(true);
        jrbInactivos.setSelected(false);
        jrbTodos.setSelected(false);
        
        
    }//GEN-LAST:event_jrbActivosActionPerformed

    private void jbDarAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDarAltaActionPerformed
        // TODO add your handling code here:-------------------------------------------------------
        int idEntrenador=(int) jtTablaEntrenadores.getValueAt(jtTablaEntrenadores.getSelectedRow(),0);
        entrenadorData.darAlta(idEntrenador);
        borrarFilaTabla();
        cargarEntrenadoresActivos(); 
    }//GEN-LAST:event_jbDarAltaActionPerformed
    
    private void cargarTodosEntrenadores(){
        List<Entrenador> lista = entrenadorData.listarTodosEntrenadores();
            for (Entrenador e : lista) {
                modelo.addRow(new Object[] {e.getIdEntrenador(), e.getDniE(),e.getNombreE(),e.getApellidoE(),e.getEspecialidad(),e.isEstado()?"Activo" : "Inactivo"} );  
            }
    }
    
    private void cargarEntrenadoresActivos(){
        List<Entrenador> lista = entrenadorData.listarEntrenadores();
            for (Entrenador e : lista) {
                modelo.addRow(new Object[] {e.getIdEntrenador(), e.getDniE(),e.getNombreE(),e.getApellidoE(),e.getEspecialidad(),e.isEstado()?"Activo" : "Inactivo"} );  
            }
    }
    
    private void cargarEntrenadoresInactivos(){
        List<Entrenador> lista = entrenadorData.listarEntrenadoresInactivos();
            for (Entrenador e : lista) {
                modelo.addRow(new Object[] {e.getIdEntrenador(), e.getDniE(),e.getNombreE(),e.getApellidoE(),e.getEspecialidad(),e.isEstado()?"Activo" : "Inactivo"} );  
            }
    }
    
    public void cargarEntrenadoresPorNombre(){
        String nombre = jtNombre.getSelectedText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbDarAlta;
    private javax.swing.JButton jbDarBaja;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JRadioButton jrbActivos;
    private javax.swing.JRadioButton jrbInactivos;
    private javax.swing.JRadioButton jrbTodos;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtEspecialidad;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTable jtTablaEntrenadores;
    // End of variables declaration//GEN-END:variables
}
