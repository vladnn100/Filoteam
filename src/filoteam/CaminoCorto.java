package filoteam;

import static java.awt.image.ImageObserver.WIDTH;
import java.util.Collection;
import javax.swing.JOptionPane;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.Set;

public class CaminoCorto extends javax.swing.JFrame {
    
    //HashSet<String> hset = new HashSet<String>();
    Grafo grafo = new Grafo();
    Vertice arabica = new Vertice(new Arabica(), 1);
    Vertice borbon = new Vertice(new Borbon(), 1);
    Vertice catuai = new Vertice(new Catuai(), 1);
    Vertice caturra = new Vertice(new Caturra(), 1);
    Vertice tipica = new Vertice(new Tipica(), 1);
    
    public CaminoCorto() {
        initComponents();
        setLocationRelativeTo(null);
        grafo.adicionarVertice(arabica);
	grafo.adicionarVertice(borbon);
	grafo.adicionarVertice(catuai);
	grafo.adicionarVertice(caturra);
	grafo.adicionarVertice(tipica);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Arabica = new javax.swing.JCheckBox();
        Caturra = new javax.swing.JCheckBox();
        Borbon = new javax.swing.JCheckBox();
        Catuai = new javax.swing.JCheckBox();
        Tipica = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(153, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Seleccione las especies de plantas que dese agregar al mapa de caminos:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 420, -1));

        Arabica.setText("Arabica");
        jPanel2.add(Arabica, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        Caturra.setText("Caturra");
        jPanel2.add(Caturra, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, -1, -1));

        Borbon.setText("Borbon");
        jPanel2.add(Borbon, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, -1, -1));

        Catuai.setText("Catuai");
        Catuai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CatuaiActionPerformed(evt);
            }
        });
        jPanel2.add(Catuai, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        Tipica.setText("Tipica");
        jPanel2.add(Tipica, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 255));
        jLabel3.setText("Introduzca la distancia en metros que separa a estas dos especies:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 400, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 130, 30));

        jButton1.setText("Agregar al mapa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 230, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 255));
        jLabel4.setText("Mostrar el mapa con las especies y las distancias respectivas:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 380, -1));

        jButton2.setText("Mostrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 110, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 450, 350));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Caminos mas cortos hasta las especies");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 370, 30));

        jButton3.setText("Volver al menu");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 420, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void CatuaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CatuaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CatuaiActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x = Integer.parseInt(jTextField1.getText());
        if(Arabica.isSelected() && Catuai.isSelected())
        {
            grafo.conecta(arabica, catuai, new Arista(x));   
        }
        if(Arabica.isSelected() && Tipica.isSelected())
        {
            grafo.conecta(arabica, tipica, new Arista(x));
        }
        if(Catuai.isSelected() && Caturra.isSelected())
        {
            grafo.conecta(catuai, caturra, new Arista(x));
        }
        if(Catuai.isSelected() && Borbon.isSelected())
        {
            grafo.conecta(catuai, borbon, new Arista(x));
        }
        if(Tipica.isSelected() && Caturra.isSelected())
        {
            grafo.conecta(tipica, caturra, new Arista(x));
        }
        
        //el resto de if :v
        if(Arabica.isSelected() && Caturra.isSelected())
        {
            grafo.conecta(arabica, caturra, new Arista(x));   
        }
        if(Arabica.isSelected() && Borbon.isSelected())
        {
            grafo.conecta(arabica, borbon, new Arista(x));
        }
        if(Catuai.isSelected() && Arabica.isSelected())
        {
            grafo.conecta(catuai, arabica, new Arista(x));
        }
        if(Catuai.isSelected() && Tipica.isSelected())
        {
            grafo.conecta(catuai, tipica, new Arista(x));
        }
        if(Tipica.isSelected() && Arabica.isSelected())
        {
            grafo.conecta(tipica, arabica, new Arista(x));
        }
        if(Tipica.isSelected() && Catuai.isSelected())
        {
            grafo.conecta(tipica, catuai, new Arista(x));
        }
        if(Tipica.isSelected() && Borbon.isSelected())
        {
            grafo.conecta(tipica, borbon, new Arista(x));
        }
        if(Caturra.isSelected() && Arabica.isSelected())
        {
            grafo.conecta(caturra, arabica, new Arista(x));
        }
        if(Caturra.isSelected() && Catuai.isSelected())
        {
            grafo.conecta(caturra, catuai, new Arista(x));
        }
        if(Caturra.isSelected() && Tipica.isSelected())
        {
            grafo.conecta(caturra, tipica, new Arista(x));
        }
        if(Caturra.isSelected() && Borbon.isSelected())
        {
            grafo.conecta(caturra, borbon, new Arista(x));
        }
        if(Borbon.isSelected() && Arabica.isSelected())
        {
            grafo.conecta(borbon, arabica, new Arista(x));
        }
        if(Borbon.isSelected() && Catuai.isSelected())
        {
            grafo.conecta(borbon, catuai, new Arista(x));
        }
        if(Borbon.isSelected() && Tipica.isSelected())
        {
            grafo.conecta(borbon, tipica, new Arista(x));
        }
        if(Borbon.isSelected() && Caturra.isSelected())
        {
            grafo.conecta(borbon, caturra, new Arista(x));
        }
        
        
        JOptionPane.showMessageDialog(null,"Las especies fueron agregadas al mapa con exito","",WIDTH,null);
        jTextField1.setText(null);
        Arabica.setSelected(false);
        Catuai.setSelected(false);
        Tipica.setSelected(false);
        Caturra.setSelected(false);
        Borbon.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Dijkstra dijkstra = new Dijkstra(grafo);
	dijkstra.caminoCostoMinimo(arabica, caturra);
        
	Collection col1 = dijkstra.vertices.values();
        Collection col2 = dijkstra.vertices.keySet();
        
        //Set<String> hset = new HashSet<String>();
        //hset = (Set<String>) col2;
        //Iterator<String> it = col2.iterator();
        //for (String temp : hset) {
        //JOptionPane.showMessageDialog(null,temp,"",WIDTH,null);
     //}   
        /*while(it.hasNext()){
                if("Tipica".equals(it.next())){
                JOptionPane.showMessageDialog(null,it.next(),"",WIDTH,null);
                }
              }*/
        JOptionPane.showMessageDialog(null,"Especies-destino:  " + col2 + "\n" + "Distancias hasta llegar a especies  " + col1,"",WIDTH,null);
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
            java.util.logging.Logger.getLogger(CaminoCorto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CaminoCorto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CaminoCorto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CaminoCorto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CaminoCorto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Arabica;
    private javax.swing.JCheckBox Borbon;
    private javax.swing.JCheckBox Catuai;
    private javax.swing.JCheckBox Caturra;
    private javax.swing.JCheckBox Tipica;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
