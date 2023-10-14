/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd.AnalizadorSintactico;

/**
 *
 * @author SELVYN
 */
public class Bloques {

    private String respuesta;
    private String Lexema;
    private String Error;
    private int fila;
    private int columna;

    public Bloques(String respuesta, String Lexema, String Error, int fila, int columna) {
        this.respuesta = respuesta;
        this.Lexema = Lexema;
        this.Error = Error;
        this.fila = fila;
        this.columna = columna;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public String getLexema() {
        return Lexema;
    }

    public void setLexema(String Lexema) {
        this.Lexema = Lexema;
    }

    public String getError() {
        return Error;
    }

    public void setError(String Error) {
        this.Error = Error;
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

    @Override
    public String toString() {
        return "Bloque{" + "bloque =" + respuesta + ", lexema =" + Lexema + ", fila =" + fila + ", columna =" + columna + '}';
    }
}
