/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Clases2.SubirArchivo;

/**
 *
 * @author SELVYN
 */
public class Acerca extends javax.swing.JFrame {

    /**
     * Creates new form Acerca
     */
    public Acerca() {
        initComponents();
        this.setResizable(false);
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

        btnAcerca = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAyuda = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        Archivo = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        GenerarGrafico = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        Ayuda = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        Acerca = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAcerca.setText("Acerca");
        btnAcerca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAcercaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAcerca, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 110, 40));

        txtAyuda.setEditable(false);
        txtAyuda.setColumns(20);
        txtAyuda.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        txtAyuda.setRows(5);
        txtAyuda.setText("Un analizador léxico es la primera \nfase de un compilador o \nintérprete que procesa el \ncódigo fuente en un lenguaje de \nprogramación y lo convierte en \nuna secuencia de tokens \nsignificativos para el compilador \no intérprete. Su función principal \nes dividir el código fuente en \nunidades léxicas más pequeñas y \nmanejables llamadas \"tokens\",\nque son representaciones \nsimbólicas de elementos como \nidentificadores, palabras \nclave, constantes, operadores y \nsímbolos.");
        jScrollPane1.setViewportView(txtAyuda);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 260, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Decoracion/kali-mr-robot-augmented-reality-game-1.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 420));

        Archivo.setText("Archivo ");
        Archivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ArchivoActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Archivo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        Archivo.add(jMenuItem1);

        jMenuBar1.add(Archivo);

        GenerarGrafico.setText("Generar Grafico");

        jMenuItem2.setText("Generar_Grafico");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        GenerarGrafico.add(jMenuItem2);

        jMenuBar1.add(GenerarGrafico);

        Ayuda.setText("Ayuda");

        jMenuItem3.setText("Ayuda");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        Ayuda.add(jMenuItem3);

        jMenuBar1.add(Ayuda);

        Acerca.setText("Acerca de ");

        jMenuItem4.setText("Acerca De");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        Acerca.add(jMenuItem4);

        jMenuBar1.add(Acerca);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Archivo ventana = new Archivo();
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ArchivoActionPerformed

    }//GEN-LAST:event_ArchivoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        GenerarGrafico ventana = new GenerarGrafico();
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Ayuda ventana = new Ayuda();
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Acerca ventana = new Acerca();
        ventana.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void btnAcercaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAcercaActionPerformed
        // TODO add your handling code here:
        SubirArchivo rt = new SubirArchivo();
        rt.AbrirArchivo("Manual Tecnico.pdf");
    }//GEN-LAST:event_btnAcercaActionPerformed

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
            java.util.logging.Logger.getLogger(Acerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Acerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Acerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Acerca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Acerca().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acerca;
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenu GenerarGrafico;
    private javax.swing.JButton btnAcerca;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAyuda;
    // End of variables declaration//GEN-END:variables
}