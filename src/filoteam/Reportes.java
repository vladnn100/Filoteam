package filoteam;

import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.util.List;
//import java.util.Scanner;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Reportes extends javax.swing.JFrame {

    String REPORTE_BORBON = "Reporte_Borbon.txt";
    String REPORTE_TIPICA = "Reporte_Tipica.txt";
    String REPORTE_CATURRA = "Reporte_Caturra.txt";
    String REPORTE_CRUCES = "Reporte_Cruces.txt";
    
    public Reportes() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    File Fborbon = new File(REPORTE_BORBON);
    File Ftipica = new File(REPORTE_TIPICA);
    File Fcaturra = new File(REPORTE_CATURRA);
    File Fcruces = new File(REPORTE_CRUCES);
    
    Tipica tipica = new Tipica();
    Borbon borbon = new Borbon();
    MundoNovo mundoNovo = new MundoNovo();
    Caturra caturra = new Caturra();
    Catuai catuai = new Catuai();
    
    PlantaCafe hibrido1 = borbon.cruzar(tipica);
    PlantaCafe hibrido2 = hibrido1.cruzar(caturra);
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 153, 0));
        jLabel2.setText("Seleccione las especies de las cuales desea generar reportes:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 370, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 204, 153));
        jCheckBox1.setText("Borbon");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        jCheckBox3.setBackground(new java.awt.Color(255, 204, 153));
        jCheckBox3.setText("Caturra");
        jPanel2.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(255, 204, 153));
        jCheckBox2.setText("Tipica");
        jPanel2.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jCheckBox4.setBackground(new java.awt.Color(255, 204, 153));
        jCheckBox4.setText("Cruces");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jButton1.setText("Generar reportes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 130, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 390, 200));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 102, 0));
        jLabel1.setText("Gestion de reportes");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 230, 20));

        jButton2.setText("Volver al menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 470, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(jCheckBox1.isSelected())
        {
                PrintWriter pw_borbon = null;
            try {
                pw_borbon = new PrintWriter(new FileWriter(Fborbon));
                
            } catch (IOException ex) {
                //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
                pw_borbon.println(borbon.getInfo());
                pw_borbon.close();
        }
        if(jCheckBox2.isSelected())
        {
                PrintWriter pw_tipica = null;
            try {
                pw_tipica = new PrintWriter(new FileWriter(Ftipica));
            } catch (IOException ex) {
                //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
                pw_tipica.println(tipica.getInfo());
                pw_tipica.close();
        }
        if(jCheckBox3.isSelected())
        {
                PrintWriter pw_caturra = null;
            try {
                pw_caturra = new PrintWriter(new FileWriter(Fcaturra));
            } catch (IOException ex) {
                //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
                pw_caturra.println(caturra.getInfo());
                pw_caturra.close();
        }
        if(jCheckBox4.isSelected())
        {
                PrintWriter pw_cruces = null;
            try {
                pw_cruces = new PrintWriter(new FileWriter(Fcruces));
            } catch (IOException ex) {
                //Logger.getLogger(Reportes.class.getName()).log(Level.SEVERE, null, ex);
            }
                pw_cruces.println(hibrido1.getInfo());
                pw_cruces.println(hibrido2.getInfo());
                pw_cruces.close();
        }
        
        JOptionPane.showMessageDialog(null,"Los reportes fueron generados con exito","",WIDTH,null);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Principal k1 = new Principal();
        k1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
