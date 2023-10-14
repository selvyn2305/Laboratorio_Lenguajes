/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases2;

import java.awt.Color;

/**
 *
 * @author SELVYN
 */
public class Token {

    private String tipo;
    private String lexema;
    private String patron;
    private int fila;
    private int columnaInicio;

    public Token(String tipo, String lexema, String patron, int fila, int columnaInicio) {
        this.tipo = tipo;
        this.lexema = lexema;
        this.patron = patron;
        this.fila = fila;
        this.columnaInicio = columnaInicio;
     
    }

    //getters y setters 
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

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

    public int getColumnaInicio() {
        return columnaInicio;
    }

    public void setColumnaInicio(int columnaInicio) {
        this.columnaInicio = columnaInicio;
    }


}
