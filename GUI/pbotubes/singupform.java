/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbotubes;

import java.awt.Color;
import javax.swing.ImageIcon;
import Logic.login;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Aris Febriansyah
 */
public class singupform extends javax.swing.JFrame {

    /**
     * Creates new form singupform
     */
        int xmouse;
        int ymouse;
    public singupform() {
        initComponents();
        this.setBackground(new Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        confpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(680, 566));
        setSize(new java.awt.Dimension(680, 566));
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/close_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabel2MouseReleased(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(632, 9, 40, 40);

        user.setBorder(null);
        user.setOpaque(false);
        getContentPane().add(user);
        user.setBounds(178, 180, 320, 55);

        pass.setBorder(null);
        getContentPane().add(pass);
        pass.setBounds(178, 275, 320, 55);

        confpass.setBorder(null);
        getContentPane().add(confpass);
        confpass.setBounds(178, 367, 320, 53);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/tombolsignup.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(223, 458, 229, 57);

        jLabel3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel3MouseDragged(evt);
            }
        });
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel3MousePressed(evt);
            }
        });
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 680, 566);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/singupmantap.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 566);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        ImageIcon signup = new ImageIcon(getClass().getResource("/pbotubes/images/closeho.png"));
        jLabel2.setIcon(signup);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        ImageIcon signup = new ImageIcon(getClass().getResource("/pbotubes/images/close_1.png"));
        jLabel2.setIcon(signup);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        ImageIcon signup = new ImageIcon(getClass().getResource("/pbotubes/images/closec.png"));
        jLabel2.setIcon(signup);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
        ImageIcon signup = new ImageIcon(getClass().getResource("/pbotubes/images/close_1.png"));
        jLabel2.setIcon(signup);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void jLabel3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        
        this.setLocation(x- xmouse, y- ymouse);
        System.out.println(x+","+y);
    }//GEN-LAST:event_jLabel3MouseDragged

    private void jLabel3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MousePressed
        // TODO add your handling code here:
        xmouse = evt.getX();
        ymouse = evt.getY();
    }//GEN-LAST:event_jLabel3MousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            if (pass.getText().equals(confpass.getText())) {
                if(login.daftar(user.getText(), pass.getText())){
                    JOptionPane.showMessageDialog(this,"Daftar Sukses!");
                }
                else{
                    JOptionPane.showMessageDialog(this, "Username telah digunakan!", 
                                                "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Password dan konfirmasi password tidak sama", 
                                                "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Databasee Error!", 
                                                "ERROR", JOptionPane.ERROR_MESSAGE);
        }catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Driver Error!", 
                                                "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(singupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(singupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(singupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(singupform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new singupform().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
