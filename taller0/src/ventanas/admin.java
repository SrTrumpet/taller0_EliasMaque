/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

/**
 *
 * @author Elias M. Olivares
 */
public class admin extends javax.swing.JFrame {

    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        botonChappie1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        buscarRut = new javax.swing.JTextField();
        botonChappie = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonRapidoFurioso = new javax.swing.JButton();
        botonAvatar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cerrarSesionAdmin = new javax.swing.JButton();
        salirAdmin = new javax.swing.JButton();
        fondoAdmin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, 220, 160));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Buscar Rut");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 180, 80, -1));

        jTextField1.setEditable(false);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 480, 140));

        botonChappie1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/demosSlayer.jpg"))); // NOI18N
        botonChappie1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonChappie1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonChappie1ActionPerformed(evt);
            }
        });
        getContentPane().add(botonChappie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 160, 240));

        jButton1.setBackground(new java.awt.Color(17, 138, 178));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, -1, -1));

        buscarRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarRutActionPerformed(evt);
            }
        });
        getContentPane().add(buscarRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 210, 170, -1));

        botonChappie.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/chapie.jpg"))); // NOI18N
        botonChappie.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonChappie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonChappieActionPerformed(evt);
            }
        });
        getContentPane().add(botonChappie, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 80, 160, 240));

        jLabel3.setBackground(new java.awt.Color(0, 153, 153));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, 240, 290));

        botonRapidoFurioso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RapidoYFu.jpg"))); // NOI18N
        botonRapidoFurioso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonRapidoFurioso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRapidoFuriosoActionPerformed(evt);
            }
        });
        getContentPane().add(botonRapidoFurioso, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 160, 240));

        botonAvatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar.jpg"))); // NOI18N
        botonAvatar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        botonAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAvatarActionPerformed(evt);
            }
        });
        getContentPane().add(botonAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 160, 240));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ganancia por Pelicula");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 270, 40));

        cerrarSesionAdmin.setBackground(new java.awt.Color(7, 59, 76));
        cerrarSesionAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cerrarSesionAdmin.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesionAdmin.setText("Loggout");
        cerrarSesionAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarSesionAdminActionPerformed(evt);
            }
        });
        getContentPane().add(cerrarSesionAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 120, 40));

        salirAdmin.setBackground(new java.awt.Color(239, 71, 111));
        salirAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        salirAdmin.setForeground(new java.awt.Color(255, 255, 255));
        salirAdmin.setText("Salir");
        salirAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirAdminActionPerformed(evt);
            }
        });
        getContentPane().add(salirAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 20, 120, 40));

        fondoAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ventanaAdmin.jpg"))); // NOI18N
        getContentPane().add(fondoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesionAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarSesionAdminActionPerformed
        // TODO add your handling code here:
        inicioLogo volverPaginaInicio = new inicioLogo();
        volverPaginaInicio.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_cerrarSesionAdminActionPerformed

    private void salirAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirAdminActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_salirAdminActionPerformed

    private void botonRapidoFuriosoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRapidoFuriosoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRapidoFuriosoActionPerformed

    private void botonChappieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonChappieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonChappieActionPerformed

    private void botonAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAvatarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAvatarActionPerformed

    private void buscarRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buscarRutActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonChappie1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonChappie1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonChappie1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAvatar;
    private javax.swing.JButton botonChappie;
    private javax.swing.JButton botonChappie1;
    private javax.swing.JButton botonRapidoFurioso;
    private javax.swing.JTextField buscarRut;
    private javax.swing.JButton cerrarSesionAdmin;
    private javax.swing.JLabel fondoAdmin;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton salirAdmin;
    // End of variables declaration//GEN-END:variables
}
