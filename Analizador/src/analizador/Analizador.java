/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package analizador;

import BackEnd.AnalizadorLexico.AnalizadorLexico;
import BackEnd.AnalizadorLexico.Lineas;
import FrontEnd.Principal;

/**
 *
 * @author SELVYN
 */
public class Analizador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Principal p = new Principal();
        p.setVisible(true);

        //AnalizadorLexico an = new AnalizadorLexico();
        //an.Inicio();

        Lineas lin = new Lineas();
        lin.Lineas();
    }

}
