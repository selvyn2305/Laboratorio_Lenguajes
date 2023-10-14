/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaanalizador;

import java.io.File;

/**
 *
 * @author SELVYN
 */
public class PruebaAnalizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String ruta = "C:/Users/SELVYN/Desktop/Carpeta IPC 2/Laboratorio/Proyectos/Proyecto 1/PruebaAnalizador/src/Backend/Lexer.flex";
        generarLexer(ruta);
    }
    
    public static void generarLexer(String ruta){
        File archivo = new File(ruta);
        JFlex.Main.generate(archivo);
    }
}
