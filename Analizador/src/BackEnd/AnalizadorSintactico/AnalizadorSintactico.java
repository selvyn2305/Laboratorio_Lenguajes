/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.AnalizadorSintactico;


import BackEnd.AnalizadorLexico.TipoToken;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import java.util.ArrayList;

public class AnalizadorSintactico {

    public List<Bloques> analizarTokens(List<TipoToken> tokensList, DefaultTableModel tablaModel) {
        List<Bloques> listaSimbolos = new ArrayList<>();

        for (int i = 0; i < tokensList.size() - 3; i++) {
            TipoToken token1 = tokensList.get(i);
            TipoToken token2 = tokensList.get(i + 1);
            TipoToken token3 = tokensList.get(i + 2);
            TipoToken token4 = tokensList.get(i + 3);

            if (token1.getTipo().equals("Identificador") &&
                token2.getTipo().equals("Asignacion") &&
                (token3.getTipo().equals("CadenaDoble") || 
                 token3.getTipo().equals("CadenaSimple") || 
                 token3.getTipo().equals("Constante") ||
                 token3.getTipo().equals("Booleano"))) {

                String todo = token1.getLexema() + " " + token2.getLexema() + " " + token3.getLexema();
                String error = "Ninguno";
                int fila = token1.getFila();
                int columna = token1.getColumna();

                Bloques simbolo = new Bloques("Declaración de variables", todo, error, fila, columna);
                listaSimbolos.add(simbolo);

                // Avanzamos el índice para evitar duplicados
                i += 3;
            }
        }

        // Limpia la tabla
        tablaModel.setRowCount(0);

        // Itera a través de la lista de símbolos y agrega cada símbolo a la tabla
        for (Bloques simbolo : listaSimbolos) {
            tablaModel.addRow(new Object[]{
                simbolo.getRespuesta(),
                simbolo.getLexema(),
                simbolo.getError(),
                simbolo.getFila(),
                simbolo.getColumna()
            });
        }

        return listaSimbolos;
    }
}

