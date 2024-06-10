package Vistas;

import AccesoData.SocioData;
import Entidades.Socio;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class gestionSocio extends javax.swing.JInternalFrame {

    SocioData socioData = new SocioData();
    Socio socioActual = null;
    private DefaultTableModel modelo;
    List<Socio> listaSocios = new ArrayList<>();

    public gestionSocio() {
        initComponents();
        modelo = new DefaultTableModel(); // Inicializar el modelo de la tabla
        armarCabeceraTabla(); // Agregar las columnas al modelo de la tabla
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
        jButton1 = new javax.swing.JButton();
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

        jbModificar.setBackground(new java.awt.Color(51, 51, 51));
        jbModificar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbModificar.setForeground(new java.awt.Color(204, 204, 204));
        jbModificar.setText("Modificar Datos");

        jbDarbaja.setBackground(new java.awt.Color(51, 51, 51));
        jbDarbaja.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbDarbaja.setForeground(new java.awt.Color(204, 204, 204));
        jbDarbaja.setText("Dar Baja");

        jrbActivos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jrbActivos.setForeground(new java.awt.Color(204, 204, 204));
        jrbActivos.setText("Activos");
        jrbActivos.setToolTipText("");

        jrbInactivos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jrbInactivos.setForeground(new java.awt.Color(204, 204, 204));
        jrbInactivos.setText("Inactivos");

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Buscar Socio");

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(204, 204, 204));
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jrbTodos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jrbTodos.setForeground(new java.awt.Color(204, 204, 204));
        jrbTodos.setText("Todos");

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
        jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jrbTodos, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(27, 27, 27)))
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtBuscarDNI)
                    .addComponent(jtBuscarID)
                    .addComponent(jtBuscarNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42)
                        .addComponent(jbDarbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jrbActivos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jrbTodos)
                        .addGap(50, 50, 50)
                        .addComponent(jrbInactivos)
                        .addGap(109, 109, 109))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 506, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                .addGap(224, 224, 224)
                                .addComponent(jLabel1)))
                        .addGap(0, 30, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtBuscarDNI)
                    .addComponent(jbBuscarDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrbActivos)
                    .addComponent(jrbInactivos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbTodos))
                .addGap(6, 6, 6)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbSalir)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbDarbaja, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
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
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        setBounds(40, 10, 586, 499);
    }// </editor-fold>//GEN-END:initComponents

    private void jtBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBuscarDNIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBuscarDNIActionPerformed

    private void jbBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarNombreActionPerformed
        // TODO add your handling code here:
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

    }//GEN-LAST:event_jbBuscarIDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        limpiarCampos();
    }//GEN-LAST:event_jButton1ActionPerformed

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
        jrbActivos.setSelected(false);
        jrbInactivos.setSelected(false);
        DefaultTableModel modeloTabla = (DefaultTableModel) jtTablaSocio.getModel();
        modeloTabla.setRowCount(0); // Limpiar la tabla
    }
     private void borrarFilaTabla(){
        int indice = modelo.getRowCount()-1;
        for (int i = indice; i >= 0; i--) {
            modelo.removeRow(i);
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbBuscarDNI;
    private javax.swing.JButton jbBuscarID;
    private javax.swing.JButton jbBuscarNombre;
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
