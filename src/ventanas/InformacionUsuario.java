/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;
import java.sql.*;
import clases.Conexion;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author DELL
 */
public class InformacionUsuario extends javax.swing.JFrame {
    
    String user = "", user_update = "";
    int ID;
    

    /**
     * Creates new form InformacionUsuario
     */
    public InformacionUsuario() {
        initComponents();
        user = Login.user;
        user_update = GestionarUsuarios.user_update;
        
        setSize(630, 450);
        setResizable(false);
        setTitle("informacion del usuario " + user_update + " - Sesion de " + user);
        setLocationRelativeTo(null);
        
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        
        ImageIcon wallpaper = new ImageIcon("src/imagenes/wallpaperPrincipal.jpg");
        Icon icono = new ImageIcon(wallpaper.getImage().getScaledInstance(jLabel_Wallpaper.getWidth(),
                jLabel_Wallpaper.getHeight(), Image.SCALE_DEFAULT));
                jLabel_Wallpaper.setIcon(icono);
        this.repaint();
                
        jLabel_titulo.setText("informacion del usuario " + user_update);
                
              
                
        try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                    "select * from usuarios where username = '" + user_update + "'");
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    ID = rs.getInt("id_usuario");
                    txt_nombre.setText(rs.getString("nombre_usuario"));
                    txt_mail.setText(rs.getString("email"));
                    txt_telefono.setText(rs.getString("telefono"));
                    txt_username.setText(rs.getString("username"));
                    txt_RegistradoPor.setText(rs.getString("registrado_por"));
                    
                    cmb_niveles.setSelectedItem(rs.getString("tipo_nivel"));
                    cmb_estatus.setSelectedItem(rs.getString("estatus"));
                }
                cn.close();
        }catch (SQLException e) {
                    System.err.println("Error en cargar usuario" + e);
                    JOptionPane.showMessageDialog(null, "ERROR CONTACTE AL ADMINISTRADOR");
                
                }
        
        setLocationRelativeTo(null);
        
    }
    
     @Override
    public Image getIconImage(){
    Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/icon.png"));
    return retValue;
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_titulo = new javax.swing.JLabel();
        jLabel_Nombre = new javax.swing.JLabel();
        jLabel_Nombre1 = new javax.swing.JLabel();
        jLabel_Nombre2 = new javax.swing.JLabel();
        jLabel_Nombre3 = new javax.swing.JLabel();
        jLabel_Nombre4 = new javax.swing.JLabel();
        jLabel_Nombre5 = new javax.swing.JLabel();
        jLabel_Nombre6 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_mail = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_username = new javax.swing.JTextField();
        txt_RegistradoPor = new javax.swing.JTextField();
        cmb_estatus = new javax.swing.JComboBox<>();
        cmb_niveles = new javax.swing.JComboBox<>();
        jButton_actualizar = new javax.swing.JButton();
        jButton_restaurarpassword = new javax.swing.JButton();
        jLabel_Wallpaper = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_titulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_titulo.setText("Informacion del Usuario");
        getContentPane().add(jLabel_titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 410, -1));

        jLabel_Nombre.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel_Nombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre.setText("Nombre:");
        getContentPane().add(jLabel_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jLabel_Nombre1.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel_Nombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre1.setText("E-mail");
        getContentPane().add(jLabel_Nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel_Nombre2.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel_Nombre2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre2.setText("Telefono:");
        getContentPane().add(jLabel_Nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jLabel_Nombre3.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel_Nombre3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre3.setText("Permisos de:");
        getContentPane().add(jLabel_Nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        jLabel_Nombre4.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel_Nombre4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre4.setText("User_name");
        getContentPane().add(jLabel_Nombre4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 50, -1, -1));

        jLabel_Nombre5.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel_Nombre5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre5.setText("Estatus:");
        getContentPane().add(jLabel_Nombre5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel_Nombre6.setFont(new java.awt.Font("Palatino Linotype", 1, 12)); // NOI18N
        jLabel_Nombre6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Nombre6.setText("Registrado por:");
        getContentPane().add(jLabel_Nombre6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        txt_nombre.setBackground(new java.awt.Color(153, 153, 255));
        txt_nombre.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(255, 255, 255));
        txt_nombre.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 180, -1));

        txt_mail.setBackground(new java.awt.Color(153, 153, 255));
        txt_mail.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_mail.setForeground(new java.awt.Color(255, 255, 255));
        txt_mail.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, -1));

        txt_telefono.setBackground(new java.awt.Color(153, 153, 255));
        txt_telefono.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_telefono.setForeground(new java.awt.Color(255, 255, 255));
        txt_telefono.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 180, -1));

        txt_username.setBackground(new java.awt.Color(153, 153, 255));
        txt_username.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usernameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 180, -1));

        txt_RegistradoPor.setBackground(new java.awt.Color(153, 153, 255));
        txt_RegistradoPor.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txt_RegistradoPor.setForeground(new java.awt.Color(255, 255, 255));
        txt_RegistradoPor.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txt_RegistradoPor.setEnabled(false);
        getContentPane().add(txt_RegistradoPor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 180, -1));

        cmb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activo", "Inactivo", " " }));
        getContentPane().add(cmb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, -1, -1));

        cmb_niveles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Capturista", "Tecnico" }));
        cmb_niveles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_nivelesActionPerformed(evt);
            }
        });
        getContentPane().add(cmb_niveles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        jButton_actualizar.setBackground(new java.awt.Color(153, 153, 255));
        jButton_actualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_actualizar.setForeground(new java.awt.Color(255, 255, 255));
        jButton_actualizar.setText("Actualizar Usuario");
        jButton_actualizar.setBorder(null);
        jButton_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_actualizarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 270, 170, 40));

        jButton_restaurarpassword.setBackground(new java.awt.Color(153, 153, 255));
        jButton_restaurarpassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_restaurarpassword.setForeground(new java.awt.Color(255, 255, 255));
        jButton_restaurarpassword.setText("Restaurar Pasword");
        jButton_restaurarpassword.setBorder(null);
        jButton_restaurarpassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_restaurarpasswordActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_restaurarpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, 170, 40));
        getContentPane().add(jLabel_Wallpaper, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_actualizarActionPerformed

    int validacion = 0;
        String nombre, mail, telefono, username;
        

        nombre = txt_nombre.getText().trim();
        mail = txt_mail.getText().trim();
        telefono = txt_telefono.getText().trim();
        username = txt_username.getText().trim();

        if (nombre.equals("")) {
            txt_nombre.setBackground(Color.red);

        }
        if (mail.equals("")) {
            txt_mail.setBackground(Color.red);

        }
        if (telefono.equals("")) {
            txt_telefono.setBackground(Color.red);

        }
        if (username.equals("")) {
            txt_username.setBackground(Color.red);

        }
        if (validacion == 0) {

            try {
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement(
                        "update usuarios set nombre_usuario=?, email=?, telefono=?, username=? "
                        + "where id_usuario = '"  + ID + "'" );
                
                pst.setString(1, nombre);
                pst.setString(2, mail);
                pst.setString(3, telefono);
                pst.setString(4, username);
                
                
                pst.executeUpdate();
                cn.close();
                
                Limpiar();
                txt_nombre.setBackground(Color.green);
                txt_mail.setBackground(Color.green);
                txt_telefono.setBackground(Color.green);
                txt_username.setBackground(Color.green);
                
                JOptionPane.showMessageDialog(null, "Actualizacion correcta.");
                this.dispose();

            } catch (SQLException e) {
                System.err.println("Error en actualizar usuario." + e);
                JOptionPane.showMessageDialog(null, "ERROR al actualizar usuario, contacte al administrador");

            }

        } else {
            JOptionPane.showMessageDialog(null, "Debes de llenar todos los campos");

        }



    }//GEN-LAST:event_jButton_actualizarActionPerformed

    private void jButton_restaurarpasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_restaurarpasswordActionPerformed

RestaurarPassword restaurarPassword = new RestaurarPassword();
restaurarPassword.setVisible(true);


        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_restaurarpasswordActionPerformed

    private void cmb_nivelesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_nivelesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmb_nivelesActionPerformed

    private void txt_usernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usernameActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InformacionUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InformacionUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_estatus;
    private javax.swing.JComboBox<String> cmb_niveles;
    private javax.swing.JButton jButton_actualizar;
    private javax.swing.JButton jButton_restaurarpassword;
    private javax.swing.JLabel jLabel_Nombre;
    private javax.swing.JLabel jLabel_Nombre1;
    private javax.swing.JLabel jLabel_Nombre2;
    private javax.swing.JLabel jLabel_Nombre3;
    private javax.swing.JLabel jLabel_Nombre4;
    private javax.swing.JLabel jLabel_Nombre5;
    private javax.swing.JLabel jLabel_Nombre6;
    private javax.swing.JLabel jLabel_Wallpaper;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JTextField txt_RegistradoPor;
    private javax.swing.JTextField txt_mail;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
public void
    Limpiar(){
    txt_nombre.setText("");
    txt_mail.setText("");
    txt_telefono.setText("");
    txt_username.setText("");

}

}


