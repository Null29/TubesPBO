/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbotubes;
import Logic.*;
import javax.swing.JOptionPane;
import java.sql.*;
/**
 *
 * @author HUMAIDI
 */
public class signup extends javax.swing.JPanel {

    /**
     * Creates new form signup
     */
    public signup() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        user = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        confpass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setLayout(null);

        user.setBorder(null);
        add(user);
        user.setBounds(100, 43, 320, 53);

        pass.setBorder(null);
        add(pass);
        pass.setBounds(100, 138, 320, 53);

        confpass.setBorder(null);
        add(confpass);
        confpass.setBounds(100, 229, 320, 53);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/tombolsignup.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(145, 320, 229, 57);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/signup frame.png"))); // NOI18N
        add(jLabel4);
        jLabel4.setBounds(0, 0, 500, 400);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            if (pass.getText().equals(confpass.getText())) {
                if(Logic.login.daftar(user.getText(), pass.getText())){
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField confpass;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
