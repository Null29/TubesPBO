/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbotubes;

import java.awt.Color;
import javax.swing.ImageIcon;
import Logic.*;

/**
 *
 * @author Aris Febriansyah
 */
public class mainframe extends javax.swing.JFrame {

    /**
     * Creates new form home
     */
        int xmouse;
        int ymouse;
        user pengguna;
    public mainframe(user temp) {
        initComponents(temp);
        this.setBackground(new Color(0,0,0,0));
        pengguna = temp;
        history.setVisible(false);
        beli.setVisible(false);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    private void initComponents(user temp) {
        jLabel2 = new javax.swing.JLabel();
        history = new history(temp);
        home = new home(temp);
        beli = new beli(temp);
        bhome = new javax.swing.JButton();
        bbeli = new javax.swing.JButton();
        bhistory = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

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
        jLabel2.setBounds(628, 9, 40, 40);

        history.setLayout(null);
        getContentPane().add(history);
        history.setBounds(118, 60, 560, 460);

        home.setLayout(null);
        getContentPane().add(home);
        home.setBounds(117, 60, 560, 460);

        beli.setLayout(null);
        getContentPane().add(beli);
        beli.setBounds(117, 60, 560, 460);

        bhome.setVisible(false);
        bhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/home.png"))); // NOI18N
        bhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhomeActionPerformed(evt);
            }
        });
        getContentPane().add(bhome);
        bhome.setBounds(0, 70, 114, 34);

        bbeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/beli.png"))); // NOI18N
        bbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbeliActionPerformed(evt);
            }
        });
        getContentPane().add(bbeli);
        bbeli.setBounds(0, 112, 117, 36);

        bhistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/history.png"))); // NOI18N
        bhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhistoryActionPerformed(evt);
            }
        });
        getContentPane().add(bhistory);
        bhistory.setBounds(0, 160, 116, 35);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/signout.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(8, 525, 105, 22);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/main.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 566);

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

        pack();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        history = new javax.swing.JPanel();
        home = new javax.swing.JPanel();
        beli = new javax.swing.JPanel();
        bhome = new javax.swing.JButton();
        bbeli = new javax.swing.JButton();
        bhistory = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(680, 566));
        setSize(new java.awt.Dimension(680, 566));
        getContentPane().setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/signout.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(8, 525, 105, 22);

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
        jLabel2.setBounds(628, 9, 40, 40);

        history.setLayout(null);
        getContentPane().add(history);
        history.setBounds(118, 60, 560, 460);

        home.setLayout(null);
        getContentPane().add(home);
        home.setBounds(117, 60, 560, 460);

        beli.setLayout(null);
        getContentPane().add(beli);
        beli.setBounds(117, 60, 560, 460);

        bhome.setVisible(false);
        bhome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/home.png"))); // NOI18N
        bhome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhomeActionPerformed(evt);
            }
        });
        getContentPane().add(bhome);
        bhome.setBounds(0, 70, 114, 34);

        bbeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/beli.png"))); // NOI18N
        bbeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bbeliActionPerformed(evt);
            }
        });
        getContentPane().add(bbeli);
        bbeli.setBounds(0, 112, 117, 36);

        bhistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/history.png"))); // NOI18N
        bhistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bhistoryActionPerformed(evt);
            }
        });
        getContentPane().add(bhistory);
        bhistory.setBounds(0, 160, 116, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pbotubes/images/main.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 680, 566);

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        ImageIcon hm = new ImageIcon(getClass().getResource("/pbotubes/images/closeho.png"));
        jLabel2.setIcon(hm);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        ImageIcon hm = new ImageIcon(getClass().getResource("/pbotubes/images/close_1.png"));
        jLabel2.setIcon(hm);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        ImageIcon hm = new ImageIcon(getClass().getResource("/pbotubes/images/closec.png"));
        jLabel2.setIcon(hm);
    }//GEN-LAST:event_jLabel2MousePressed

    private void jLabel2MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseReleased
        // TODO add your handling code here:
        ImageIcon hm = new ImageIcon(getClass().getResource("/pbotubes/images/close_1.png"));
        jLabel2.setIcon(hm);
    }//GEN-LAST:event_jLabel2MouseReleased

    private void bhomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhomeActionPerformed
        // TODO add your handling code here:
        bhome.setVisible(false);
        bbeli.setVisible(true);
        bhistory.setVisible(true);
        home.setVisible(true);
        beli.setVisible(false);
        history.setVisible(false);
    }//GEN-LAST:event_bhomeActionPerformed

    private void bbeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bbeliActionPerformed
        // TODO add your handling code here:
        bhome.setVisible(true);
        bbeli.setVisible(false);
        bhistory.setVisible(true);
        home.setVisible(false);
        beli.setVisible(true);
        history.setVisible(false);
    }//GEN-LAST:event_bbeliActionPerformed

    private void bhistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bhistoryActionPerformed
        // TODO add your handling code here:
        ((history)history).refresh();
        bhome.setVisible(true);
        bbeli.setVisible(true);
        bhistory.setVisible(false);
        home.setVisible(false);
        beli.setVisible(false);
        history.setVisible(true);
    }//GEN-LAST:event_bhistoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        loginframe a = new loginframe();
        a.setVisible(true);
        
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
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
//        mainframe a = new mainframe(new user("tubes"));
//        a.setVisible(true);
        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new mainframe().setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bbeli;
    private javax.swing.JPanel beli;
    private javax.swing.JButton bhistory;
    private javax.swing.JButton bhome;
    private javax.swing.JPanel history;
    private javax.swing.JPanel home;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}