/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.AnalizadorLexico;

import FrontEnd.Principal;
import static FrontEnd.Principal.TablaReporte;
import static FrontEnd.Principal.txtArchivo;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SELVYN
 */
public class AnalizadorLexico {

    public void Inicio() {
        String ruta = "C:/Users/SELVYN/Desktop/Lenguajes/Laboratorio/Tarea de Lab/Laboratorio_Lenguajes/Analizador/src/BackEnd/AnalizadorLexico/Lexer.flex";
        generarLexer(ruta);
    }

    public void generarLexer(String ruta) {
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }

    public void Analizar() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaReporte.getModel();
        modeloTabla.setRowCount(0); // Limpia la tabla antes de agregar nuevos datos

        String texto = txtArchivo.getText(); // Obtiene el texto del JTextArea

        Lexer lexer = new Lexer(new StringReader(texto)); // Usa un StringReader para analizar el texto

        List<TipoToken> tokensList = new ArrayList<>(); // Lista para almacenar los tokens

        while (true) {
            Tokens tokenType = null;
            try {
                tokenType = lexer.yylex();
            } catch (IOException ex) {
                Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (tokenType == null) {
                modeloTabla.addRow(new Object[]{"Fin"});

                // Imprime los tokens después de haber llenado la lista
                System.out.println("Tokens almacenados:");
                for (TipoToken token : tokensList) {
                    System.out.println(token);
                }

                return;
            }

            String lexema = lexer.lexema;
            int fila = lexer.fila;
            int columna = lexer.columna;

            // Aquí utilizamos tokenType para obtener el tipo del token
            // y creamos una instancia de TipoToken
            String tipo = tokenType.toString(); // Convierte el tipo en una cadena
            TipoToken token = new TipoToken(tipo, lexema, fila, columna); // Crea una instancia de TipoToken
            tokensList.add(token); // Agrega el token a la lista

            switch (tokenType) {
                case ERROR:
                    modeloTabla.addRow(new Object[]{lexema, "Simbolo no reconocible", fila, columna});
                    break;
                case Identificador:
                case Aritmeticos:
                case Asignacion:
                case Palabras_Claves:
                case Comparacion:
                case Constante:
                case Comentarios:
                case CadenaDoble:
                case CadenaSimple:
                case Otros:
                case Logicos:
                case Booleanos:
                case Bits:    
                    modeloTabla.addRow(new Object[]{lexema, tokenType, fila, columna});
                    break;
                default:
                    modeloTabla.addRow(new Object[]{"Token " + tokenType});
                    break;
            }
        }
    }

    public void limpiarTabla(DefaultTableModel model) {
        model.setRowCount(0); // Limpiar la tabla
    }
}
