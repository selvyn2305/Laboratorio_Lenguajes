/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases2;

import static GUI.Archivo.TablaErrores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SELVYN
 */
public class AnalizadorLexico {

    public static List<Token> analizarLexemas(String texto) {
        List<Token> tokens = new ArrayList<>();
        List<String> errores = new ArrayList<>();
        int fila = 1;
        int columnaInicio = 1;
        int longitudTexto = texto.length();
        int indice = 0;
        String[] PALABRAS_RESERVADAS = {
            "and", "as", "assert", "break", "class", "continue", "def", "del", "elif", "else", "except",
            "False", "finally", "for", "from", "global", "if", "import", "in", "is", "lambda", "None",
            "nonlocal", "not", "or", "pass", "raise", "return", "True", // Aquí agregamos una coma para separar
            "try", "while", "with", "yield"
        };

        Set<String> OTROS = new HashSet<>(Arrays.asList("(", ")", "[", "]", "{", "}", ",", ".", ";", ":"));

        while (indice < longitudTexto) {
            char caracter = texto.charAt(indice);

            if (Character.isWhitespace(caracter)) {
                if (caracter == '\n') {
                    fila++;
                    columnaInicio = 1;
                } else {
                    columnaInicio++;
                }
                indice++;
            } else if (Character.isLetter(caracter) || caracter == '_') {
                StringBuilder lexemaBuilder = new StringBuilder();
                String patron = Patrones.IDENTIFICADOR;

                while (indice < longitudTexto && (Character.isLetterOrDigit(texto.charAt(indice)) || texto.charAt(indice) == '_')) {
                    lexemaBuilder.append(texto.charAt(indice));
                    indice++;
                    columnaInicio++;
                }

                String lexema = lexemaBuilder.toString();

                if (Arrays.asList(PALABRAS_RESERVADAS).contains(lexema)) {
                    tokens.add(new Token("Palabra Reservada", lexema, "Palabra Reservada", fila, columnaInicio - lexema.length()));
                } else {
                    tokens.add(new Token("Identificador", lexema, patron, fila, columnaInicio - lexema.length()));
                }
            } else if (Character.isDigit(caracter)) {
                StringBuilder lexemaBuilder = new StringBuilder();
                String patron = Patrones.CONSTANTE;

                while (indice < longitudTexto && Character.isDigit(texto.charAt(indice))) {
                    lexemaBuilder.append(texto.charAt(indice));
                    indice++;
                    columnaInicio++;
                }

                tokens.add(new Token("Constante", lexemaBuilder.toString(), patron, fila, columnaInicio - lexemaBuilder.length()));
            } else if (Patrones.OPERADOR_ARITMETICO.contains(String.valueOf(caracter))) {
                tokens.add(new Token("Aritmetico", String.valueOf(caracter), Patrones.OPERADOR_ARITMETICO, fila, columnaInicio));
                indice++;
                columnaInicio++;
            } else if (Patrones.CADENAS.contains(String.valueOf(caracter))) {
                tokens.add(new Token("Cadenas", String.valueOf(caracter), Patrones.CADENAS, fila, columnaInicio));
                indice++;
                columnaInicio++;
            } else if (Patrones.OPERADOR_ASIGNACION.contains(String.valueOf(caracter))) {
                tokens.add(new Token("Asignacion", String.valueOf(caracter), Patrones.OPERADOR_ASIGNACION, fila, columnaInicio));
                indice++;
                columnaInicio++;
            } else if (Patrones.OPERADOR_COMPARACION.contains(String.valueOf(caracter))) {
                tokens.add(new Token("Comparacion", String.valueOf(caracter), Patrones.OPERADOR_COMPARACION, fila, columnaInicio));
                indice++;
                columnaInicio++;
            } else if (Patrones.COMENTARIOS.contains(String.valueOf(caracter))) {
                tokens.add(new Token("Comentarios", String.valueOf(caracter), Patrones.COMENTARIOS, fila, columnaInicio));
                indice++;
                columnaInicio++;
            } else if (OTROS.contains(String.valueOf(caracter))) {
                tokens.add(new Token("Otros", String.valueOf(caracter), "Otros", fila, columnaInicio));
                indice++;
                columnaInicio++;
            } else {
                // Carácter no reconocido, considerarlo como un error
                errores.add("Error en fila " + fila + ", columna " + columnaInicio + ": Carácter no reconocido");
                indice++;
                columnaInicio++;
            }
            //No cambiar eso 
            {

                columnaInicio++;
                indice++;
            }

            //No cambiar eso 
            AnalizadorLexico ar = new AnalizadorLexico();
            ar.TablaErrores(errores, (DefaultTableModel) TablaErrores.getModel());
        }

        return tokens;
    }

    // Limpiar ambas tablas
    public void limpiarTabla(DefaultTableModel model) {
        model.setRowCount(0); // Limpiar la tabla
    }

    // No tocar //
    public void TablaErrores(List<String> errores, DefaultTableModel model) {
        for (String error : errores) {
            model.addRow(new Object[]{error});
        }
    }

    // No tocar //
}
