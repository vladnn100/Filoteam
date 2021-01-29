package filoteam;

import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.JOptionPane;


public class Arbol_generacion extends javax.swing.JFrame {
        //Creación de Plantas
        Tipica tipica = new Tipica();
        Borbon borbon = new Borbon();
        MundoNovo mundoNovo = new MundoNovo();
        Caturra caturra = new Caturra();
        Catuai catuai = new Catuai();
        //Creación de Árboles
        Arabica arabica = new Arabica();
        ArbolGeneral<PlantaCafe> arbolGeneracional = new ArbolGeneral<PlantaCafe>(arabica);
    
    public Arbol_generacion() {
        initComponents();
        //String Nod1 = "";
        //String Nod2 = "";
        //Creación de Plantas
        setLocationRelativeTo(null);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        MundoNovoP = new javax.swing.JCheckBox();
        ArabicaP = new javax.swing.JCheckBox();
        CaturraP = new javax.swing.JCheckBox();
        TipicaP = new javax.swing.JCheckBox();
        CatuaiP = new javax.swing.JCheckBox();
        BorbonP = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        MundoNovoH = new javax.swing.JCheckBox();
        ArabicaH = new javax.swing.JCheckBox();
        CaturraH = new javax.swing.JCheckBox();
        TipicaH = new javax.swing.JCheckBox();
        CatuaiH = new javax.swing.JCheckBox();
        BorbonH = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 51));
        jLabel1.setText("Arbol generacional de especies");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 300, 20));

        jButton3.setText("Volver al menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 440, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Seleccione la especie padre:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, -1));

        MundoNovoP.setText("Mundo Novo");
        jPanel2.add(MundoNovoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        ArabicaP.setText("Arabica");
        ArabicaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArabicaPActionPerformed(evt);
            }
        });
        jPanel2.add(ArabicaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        CaturraP.setText("Caturra");
        jPanel2.add(CaturraP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, -1, -1));

        TipicaP.setText("Tipica");
        TipicaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipicaPActionPerformed(evt);
            }
        });
        jPanel2.add(TipicaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        CatuaiP.setText("Catuai");
        jPanel2.add(CatuaiP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, -1, -1));

        BorbonP.setText("Borbon");
        BorbonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorbonPActionPerformed(evt);
            }
        });
        jPanel2.add(BorbonP, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Seleccione la especie hija:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 180, -1));

        jButton1.setText("Agregar par de especies al arbol");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        MundoNovoH.setText("Mundo Novo");
        MundoNovoH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MundoNovoHActionPerformed(evt);
            }
        });
        jPanel2.add(MundoNovoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        ArabicaH.setText("Arabica");
        jPanel2.add(ArabicaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        CaturraH.setText("Caturra");
        jPanel2.add(CaturraH, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, -1, -1));

        TipicaH.setText("Tipica");
        jPanel2.add(TipicaH, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, -1, -1));

        CatuaiH.setText("Catuai");
        jPanel2.add(CatuaiH, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        BorbonH.setText("Borbon");
        BorbonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorbonHActionPerformed(evt);
            }
        });
        jPanel2.add(BorbonH, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("<html>Seleccione el orden en el que desea visulizar el arbol generacional:<html>");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 330, 70));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Preorden", "Postorden", "Inorden" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jButton2.setText("Visualizar arbol");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 330, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 350, 370));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TipicaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipicaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TipicaPActionPerformed

    private void BorbonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorbonPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorbonPActionPerformed

    private void ArabicaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArabicaPActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ArabicaPActionPerformed

    private void BorbonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorbonHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BorbonHActionPerformed

    private void MundoNovoHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MundoNovoHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MundoNovoHActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(ArabicaP.isSelected() && TipicaH.isSelected())
        {
            arbolGeneracional.insertar(arabica, tipica);   
        }
        if(ArabicaP.isSelected() && BorbonH.isSelected())
        {
            arbolGeneracional.insertar(arabica, borbon);
        }
        if(TipicaP.isSelected() && MundoNovoH.isSelected())
        {
            arbolGeneracional.insertar(tipica, mundoNovo);
        }
        if(BorbonP.isSelected() && MundoNovoH.isSelected())
        {
            arbolGeneracional.insertar(borbon, mundoNovo);
        }
        if(BorbonP.isSelected() && MundoNovoH.isSelected())
        {
            arbolGeneracional.insertar(mundoNovo, catuai);
        }
        if(BorbonP.isSelected() && CaturraH.isSelected())
        {
            arbolGeneracional.insertar(borbon, caturra);
        }
        if(CaturraP.isSelected() && CatuaiH.isSelected())
        {
            arbolGeneracional.insertar(caturra, catuai);
        }
        
        JOptionPane.showMessageDialog(null,"Las especies fueron agregadas al arbol con exito","",WIDTH,null);
        ArabicaP.setSelected(false);
        CatuaiP.setSelected(false);
        TipicaP.setSelected(false);
        CaturraP.setSelected(false);
        BorbonP.setSelected(false);
        MundoNovoP.setSelected(false);
        ArabicaH.setSelected(false);
        CatuaiH.setSelected(false);
        TipicaH.setSelected(false);
        CaturraH.setSelected(false);
        BorbonH.setSelected(false);
        MundoNovoH.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String visualizar = "";
        if(jComboBox1.getSelectedItem()=="Preorden")
        {
          arbolGeneracional.mos();
          visualizar = arbolGeneracional.preOrden2(arbolGeneracional.raiz);
        }
        if(jComboBox1.getSelectedItem()=="Postorden")
        {
          arbolGeneracional.mos();
          visualizar = arbolGeneracional.postOrden2(arbolGeneracional.raiz);
        }
        if(jComboBox1.getSelectedItem()=="Inorden")
        {
          arbolGeneracional.mos();
          visualizar = arbolGeneracional.inOrden2(arbolGeneracional.raiz);
        }
        JOptionPane.showMessageDialog(null,visualizar,"DATOS",WIDTH,null);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Principal m1 = new Principal();
        m1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Arbol_generacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Arbol_generacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Arbol_generacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Arbol_generacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Arbol_generacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox ArabicaH;
    private javax.swing.JCheckBox ArabicaP;
    private javax.swing.JCheckBox BorbonH;
    private javax.swing.JCheckBox BorbonP;
    private javax.swing.JCheckBox CatuaiH;
    private javax.swing.JCheckBox CatuaiP;
    private javax.swing.JCheckBox CaturraH;
    private javax.swing.JCheckBox CaturraP;
    private javax.swing.JCheckBox MundoNovoH;
    private javax.swing.JCheckBox MundoNovoP;
    private javax.swing.JCheckBox TipicaH;
    private javax.swing.JCheckBox TipicaP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
