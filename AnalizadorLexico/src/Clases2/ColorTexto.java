/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases2;

import static Clases2.AnalizadorLexico.analizarLexemas;
import java.awt.Color;
import java.util.List;
import javax.swing.JTextPane;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyleContext;
import javax.swing.text.StyledDocument;

/**
 *
 * @author SELVYN
 */
public class ColorTexto {

    java.awt.Color cyan = java.awt.Color.cyan;
    java.awt.Color red = java.awt.Color.red;
    java.awt.Color gray = java.awt.Color.gray;
    java.awt.Color green = java.awt.Color.green;
    java.awt.Color orange = java.awt.Color.orange;
    java.awt.Color yellow = java.awt.Color.yellow;
    java.awt.Color black = java.awt.Color.black;

    public void colorearEditorTexto(JTextPane textPane) {
        StyledDocument doc = textPane.getStyledDocument();
        String contenido = null;
        try {
            // Obtiene el texto completo del JTextPane
            contenido = doc.getText(0, doc.getLength());
        } catch (BadLocationException e) {
            e.printStackTrace();
            return;
        }

        List<Token> tokens = analizarLexemas(contenido); // Llama al analizador léxico para obtener los tokens

        int indice = 0;
        for (Token token : tokens) {
            int startIndex = contenido.indexOf(token.getLexema(), indice); // Encuentra el inicio del token
            if (startIndex == -1) {
                continue; // Si no se encuentra, continúa con el siguiente token
            }

            int length = token.getLexema().length(); // La longitud del token

            Color color;

            if (token.getTipo().equals("Palabra Reservada")) {
                color = Color.pink; // Color para palabras reservadas
            } else if (token.getTipo().equals("Identificador")) {
                color = Color.blue; // Color para identificadores (según tu código original)
            } else if (token.getTipo().equals("Constante")) {
                color = red; // Color para constantes (según tu código original)
            } else if (token.getTipo().equals("Cadenas")) {
                color = Color.orange; // Color para constantes (según tu código original)
            } else if (token.getTipo().equals("Aritmetico")) {
                color = Color.cyan; // Color para constantes (según tu código original)
            } else if (token.getTipo().equals("Asignacion")) {
                color = Color.cyan; // Color para constantes (según tu código original)
            } else if (token.getTipo().equals("Comparacion")) {
                color = Color.cyan; // Color para constantes (según tu código original)
            } else if (token.getTipo().equals("Comentarios")) {
                color = Color.MAGENTA; // Color para constantes (según tu código original)
            } else if (token.getTipo().equals("Otros")) {
                color = Color.green; // Color para constantes (según tu código original)
            } else {
                color = Color.black; // Color para otros tokens (según tu código original)
            }

            StyleContext sc = StyleContext.getDefaultStyleContext();
            AttributeSet aset = sc.addAttribute(SimpleAttributeSet.EMPTY, StyleConstants.Foreground, color);

            doc.setCharacterAttributes(startIndex, length, aset, true);
            indice = startIndex + length; // Actualiza el índice para continuar buscando
        }
    }

}
