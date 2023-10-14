/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.awt.GridLayout;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author SELVYN
 */
public class LineNumberUpdater {

     public static void main(String[] args) {
       

        JTextPane txtEntrada = new JTextPane();
        JTextPane lineNumberPane = new JTextPane();


        List<String> lineNumbers = new ArrayList<>();
        lineNumbers.add("1"); // Inicialmente, hay una línea

        txtEntrada.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                String text = txtEntrada.getText();
                String[] lines = text.split("\n");
                int lineCount = lines.length;

                if (lineCount > lineNumbers.size()) {
                    for (int i = lineNumbers.size() + 1; i <= lineCount; i++) {
                        lineNumbers.add(String.valueOf(i));
                    }
                }

                updateLineNumberPane();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                String text = txtEntrada.getText();
                String[] lines = text.split("\n");
                int lineCount = lines.length;

                if (lineCount < lineNumbers.size()) {
                    lineNumbers.remove(lineNumbers.size() - 1);
                }

                updateLineNumberPane();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Cambios en estilo, no es necesario actualizar los números de línea
            }

            private void updateLineNumberPane() {
                StringBuilder lineNumbersText = new StringBuilder();
                for (String lineNumber : lineNumbers) {
                    lineNumbersText.append(lineNumber).append("\n");
                }
                lineNumberPane.setText(lineNumbersText.toString());
            }
        });

    }
}
