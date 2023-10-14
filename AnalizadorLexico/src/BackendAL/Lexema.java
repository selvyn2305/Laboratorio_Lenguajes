/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackendAL;

/**
 *
 * @author SELVYN
 */
public class Lexema {
    
    private String lexema;
    private String patron;
    private int fila;
    private int columna;

    public Lexema(String lexema, String patron, int fila, int columna) {
        this.lexema = lexema;
        this.patron = patron;
        this.fila = fila;
        this.columna = columna;
    }

    //getters y setters

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
}


