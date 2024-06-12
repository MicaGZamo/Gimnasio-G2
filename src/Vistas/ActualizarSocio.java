
package Vistas;

import AccesoData.SocioData;
import Entidades.Socio;
import javax.swing.JOptionPane;



public class ActualizarSocio extends javax.swing.JInternalFrame {

    private SocioData socioData;
    private Socio socioActual;
     
   
    
    public ActualizarSocio(int id) {
        initComponents();
        socioData = new SocioData();
        cargarDatos(id);
    }

        
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtDni = new javax.swing.JTextField();
        jtNombre = new javax.swing.JTextField();
        jtApellido = new javax.swing.JTextField();
        jbSalir = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jtEdad = new javax.swing.JTextField();
        jtCorreo = new javax.swing.JTextField();
        jtTelefono = new javax.swing.JTextField();

        setFocusable(false);

        jDesktopPane1.setBackground(new java.awt.Color(75, 102, 113));
        jDesktopPane1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jSeparator1.setBackground(new java.awt.Color(204, 204, 204));
        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Ebrima", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Actualizar Datos del Socio");

        jLabel2.setBackground(new java.awt.Color(153, 153, 153));
        jLabel2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("DNI");

        jLabel3.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Nombre");

        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 204, 204));
        jLabel4.setText("Apellido");

        jLabel5.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Edad");

        jLabel6.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Correo");

        jLabel7.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("Telefono");

        jtDni.setBackground(new java.awt.Color(204, 204, 204));
        jtDni.setForeground(new java.awt.Color(0, 0, 0));
        jtDni.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtDniMousePressed(evt);
            }
        });

        jtNombre.setBackground(new java.awt.Color(204, 204, 204));
        jtNombre.setForeground(new java.awt.Color(0, 0, 0));

        jtApellido.setBackground(new java.awt.Color(204, 204, 204));
        jtApellido.setForeground(new java.awt.Color(0, 0, 0));

        jbSalir.setBackground(new java.awt.Color(51, 51, 51));
        jbSalir.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbSalir.setForeground(new java.awt.Color(204, 204, 204));
        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jbActualizar.setBackground(new java.awt.Color(51, 51, 51));
        jbActualizar.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        jbActualizar.setForeground(new java.awt.Color(204, 204, 204));
        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jtEdad.setBackground(new java.awt.Color(204, 204, 204));
        jtEdad.setForeground(new java.awt.Color(0, 0, 0));

        jtCorreo.setBackground(new java.awt.Color(204, 204, 204));
        jtCorreo.setForeground(new java.awt.Color(0, 0, 0));
        jtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCorreoActionPerformed(evt);
            }
        });

        jtTelefono.setBackground(new java.awt.Color(204, 204, 204));
        jtTelefono.setForeground(new java.awt.Color(0, 0, 0));
        jtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtTelefonoMousePressed(evt);
            }
        });

        jDesktopPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtDni, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jbActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtEdad, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtCorreo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jtTelefono, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(129, 129, 129))))
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jLabel7))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addGap(7, 7, 7)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(12, 12, 12)))))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtNombre)
                        .addComponent(jtTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                        .addComponent(jtDni)
                        .addComponent(jtApellido)
                        .addComponent(jtCorreo)
                        .addComponent(jtEdad)))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 25, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(27, 27, 27)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
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

        setBounds(35, 0, 530, 480);
    }// </editor-fold>//GEN-END:initComponents

    private void jtDniMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtDniMousePressed
        
    }//GEN-LAST:event_jtDniMousePressed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
        Menu menuPrincipal = new Menu();
        gestionSocio gs = new gestionSocio();
        menuPrincipal.getJdpEscritorio().add(gs);
        gs.setVisible(true);
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed

        try {

            String dni = jtDni.getText();
            String nombre = jtNombre.getText();
            String apellido = jtApellido.getText();
            Integer edad = Integer.valueOf(jtEdad.getText());
            String correo = jtCorreo.getText();
            String telefono = jtTelefono.getText();

            if (dni.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || telefono.isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "No pueden haber campos vacios.");
                return;
            }
            // Validación de DNI con expresión regular
            String regularDni = "\\d+"; // "\\d:" Representa cualquier dígito numérico (0 al 9) y el "+" Indica que debe haber al menos un dígito, pero puede haber más.
            if (!dni.matches(regularDni)) {
                JOptionPane.showMessageDialog(this, "El DNI debe tener 8 dígitos numéricos.");
                return;
            }

            String regexNombreApellido = "[a-zA-Z\\s]+";
            if (!nombre.matches(regexNombreApellido) || !apellido.matches(regexNombreApellido)) {
                JOptionPane.showMessageDialog(this, "El nombre y apellido solo deben contener letras.");
                return;
            }
            if (edad < 0) {
                JOptionPane.showMessageDialog(this, "Ingrese una edad válida.");
                return;
            }

            String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
            if (!correo.matches(emailRegex)) {
                JOptionPane.showMessageDialog(this, "El correo electrónico no es válido.");
                return;
            }
            String telefonoRegex = "\\d{8,10}";
            if (!telefono.matches(telefonoRegex)) {
                JOptionPane.showMessageDialog(this, "El teléfono debe contener entre 8 y 10 dígitos.");
                return;
            }
            socioActual.setDniSocio(dni);
            socioActual.setNombre(nombre);
            socioActual.setApellido(apellido);
            socioActual.setEdad(edad);
            socioActual.setCorreo(correo);
            socioActual.setTelefono(telefono);
            
            
            socioData.modificarSocio(socioActual);
            socioActual = new Socio (dni, nombre, apellido, edad, correo, telefono, true);
            socioData.modificarSocio(socioActual);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(rootPane,"Ingrese una edad válida.");
        }
    }//GEN-LAST:event_jbActualizarActionPerformed

    private void jtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCorreoActionPerformed
 private void cargarDatos(int id) {
      socioActual = socioData.buscarSocioId(id); 
        
        jtNombre.setText(socioActual.getNombre());
        jtApellido.setText(socioActual.getApellido());
        jtDni.setText(socioActual.getDniSocio());
        jtEdad.setText(String.valueOf(socioActual.getEdad()));
        jtCorreo.setText(socioActual.getCorreo());
        jtTelefono.setText(socioActual.getTelefono());
       
    }
    private void jtTelefonoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTelefonoMousePressed
      
    }//GEN-LAST:event_jtTelefonoMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbSalir;
    private javax.swing.JTextField jtApellido;
    private javax.swing.JTextField jtCorreo;
    private javax.swing.JTextField jtDni;
    private javax.swing.JTextField jtEdad;
    private javax.swing.JTextField jtNombre;
    private javax.swing.JTextField jtTelefono;
    // End of variables declaration//GEN-END:variables
}
