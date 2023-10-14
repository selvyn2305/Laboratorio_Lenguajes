/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frontend;

import BackendAL.SubirArchivo;
import BackendAL.AnalizadorLexico;
import BackendAL.ColorTabla;
import BackendAL.ColorTexto;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SELVYN
 */
public class Archivo extends javax.swing.JFrame {

    ColorTexto tex = new ColorTexto();

    /**
     * Creates new form Archivo
     */
    //ColorTabla colortabla = new ColorTabla();
    public Archivo() {

        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //TablaReporte.setDefaultRenderer(TablaReporte.getColumnClass(0), colortabla);
        this.TablaReporte.setDefaultRenderer(Object.class, new ColorTabla());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimpiar = new javax.swing.JButton();
        btnSubirArchivo1 = new javax.swing.JButton();
        btnDetectar = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaReporte = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtArchivo = new javax.swing.JTextPane();
        btnColorTexto = new javax.swing.JButton();
        NombreDelEditor = new javax.swing.JLabel();
        NombreAnalizadorLexico = new javax.swing.JLabel();
        btnAnalizadorSintactico = new javax.swing.JButton();
        NombreAnalizadorSintactico = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaReporteSin = new javax.swing.JTable();
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

        btnLimpiar.setBackground(new java.awt.Color(0, 204, 204));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 80, 30));

        btnSubirArchivo1.setBackground(new java.awt.Color(0, 204, 204));
        btnSubirArchivo1.setText("Subir");
        btnSubirArchivo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubirArchivo1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubirArchivo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 80, 30));

        btnDetectar.setBackground(new java.awt.Color(0, 204, 204));
        btnDetectar.setText("Analizador Lexico");
        btnDetectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetectarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDetectar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 140, 50));

        TablaReporte.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        TablaReporte.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Token", "Lexema", "Patron", "Fila", "Columna"
            }
        ));
        jScrollPane5.setViewportView(TablaReporte);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 870, 260));

        txtArchivo.setFont(new java.awt.Font("Segoe UI Black", 2, 18)); // NOI18N
        jScrollPane3.setViewportView(txtArchivo);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 720, 310));

        btnColorTexto.setBackground(new java.awt.Color(0, 204, 204));
        btnColorTexto.setText("Color");
        btnColorTexto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColorTextoActionPerformed(evt);
            }
        });
        getContentPane().add(btnColorTexto, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 100, 30));

        NombreDelEditor.setFont(new java.awt.Font("Segoe UI Emoji", 3, 18)); // NOI18N
        NombreDelEditor.setForeground(new java.awt.Color(255, 255, 255));
        NombreDelEditor.setText("PARSER-PY");
        getContentPane().add(NombreDelEditor, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, -1, -1));

        NombreAnalizadorLexico.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        NombreAnalizadorLexico.setForeground(new java.awt.Color(255, 255, 255));
        NombreAnalizadorLexico.setText("Analizador Lexico ");
        getContentPane().add(NombreAnalizadorLexico, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 200, 30));

        btnAnalizadorSintactico.setBackground(new java.awt.Color(0, 204, 204));
        btnAnalizadorSintactico.setText("Analizador Sintactico");
        getContentPane().add(btnAnalizadorSintactico, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 130, 50));

        NombreAnalizadorSintactico.setBackground(new java.awt.Color(255, 255, 255));
        NombreAnalizadorSintactico.setFont(new java.awt.Font("Segoe Print", 3, 18)); // NOI18N
        NombreAnalizadorSintactico.setForeground(new java.awt.Color(153, 255, 0));
        NombreAnalizadorSintactico.setText("Analizador Sintactico");
        NombreAnalizadorSintactico.setToolTipText("");
        getContentPane().add(NombreAnalizadorSintactico, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 80, 240, -1));

        TablaReporteSin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Bloque", "Lexema", "Error ", "Linea", "Columna"
            }
        ));
        jScrollPane2.setViewportView(TablaReporteSin);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 110, 720, 310));

        jLabel1.setBackground(new java.awt.Color(0, 204, 204));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Decoracion/Fondo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1720, 890));

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

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtArchivo.setText("");
        AnalizadorLexico in = new AnalizadorLexico();
        in.limpiarTabla((DefaultTableModel) TablaReporteSin.getModel());
        in.limpiarTabla((DefaultTableModel) TablaReporte.getModel());
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSubirArchivo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubirArchivo1ActionPerformed
        // TODO add your handling code here:
        SubirArchivo arch = new SubirArchivo();
        arch.AgregarArchivo();
    }//GEN-LAST:event_btnSubirArchivo1ActionPerformed

    private void btnDetectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetectarActionPerformed
        // TODO add your handling code here:
        String texto = txtArchivo.getText();
        List<BackendAL.Token> tokens = AnalizadorLexico.analizarLexemas(texto);

        DefaultTableModel model = (DefaultTableModel) TablaReporte.getModel();
        model.setRowCount(0); // Esto elimina todas las filas existentes
        for (BackendAL.Token token : tokens) {
            Object[] rowData = {
                token.getTipo(),
                token.getLexema(),
                token.getPatron(),
                token.getFila(),
                token.getColumnaInicio()
            };

            model.addRow(rowData);

        }
    }//GEN-LAST:event_btnDetectarActionPerformed

    private void btnColorTextoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColorTextoActionPerformed
        // TODO add your handling code here:
        tex.colorearEditorTexto(txtArchivo);
    }//GEN-LAST:event_btnColorTextoActionPerformed

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
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archivo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archivo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Acerca;
    private javax.swing.JMenu Archivo;
    private javax.swing.JMenu Ayuda;
    private javax.swing.JMenu GenerarGrafico;
    private javax.swing.JLabel NombreAnalizadorLexico;
    private javax.swing.JLabel NombreAnalizadorSintactico;
    private javax.swing.JLabel NombreDelEditor;
    public static javax.swing.JTable TablaReporte;
    public static javax.swing.JTable TablaReporteSin;
    private javax.swing.JButton btnAnalizadorSintactico;
    private javax.swing.JButton btnColorTexto;
    private javax.swing.JButton btnDetectar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSubirArchivo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    public static javax.swing.JTextPane txtArchivo;
    // End of variables declaration//GEN-END:variables
}
