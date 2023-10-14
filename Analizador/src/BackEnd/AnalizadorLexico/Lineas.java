/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.AnalizadorLexico;

import static FrontEnd.Principal.txtArchivo;
import static FrontEnd.Principal.txtLineas;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author SELVYN
 */
public class Lineas {

    public void Lineas() {

        // Agregar un DocumentListener a txtEntrada para actualizar el número de fila en txtLineaNumeros
        List<String> lineNumbers = new ArrayList<>();
        lineNumbers.add("1"); // Inicialmente, hay una línea

        txtArchivo.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                updateLineNumber();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                updateLineNumber();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                // Cambios en estilo, no es necesario actualizar los números de línea
            }

            private void updateLineNumber() {
                String text = txtArchivo.getText();
                String[] lines = text.split("\n");
                int lineCount = lines.length;

                if (lineCount > lineNumbers.size()) {
                    for (int i = lineNumbers.size() + 1; i <= lineCount; i++) {
                        lineNumbers.add(String.valueOf(i));
                    }
                }

                updateLineNumberPane();
            }

            private void updateLineNumberPane() {
                StringBuilder lineNumbersText = new StringBuilder();
                for (String lineNumber : lineNumbers) {
                    lineNumbersText.append(lineNumber).append("\n");
                }
                txtLineas.setText(lineNumbersText.toString());
            }
        });

    }
}
