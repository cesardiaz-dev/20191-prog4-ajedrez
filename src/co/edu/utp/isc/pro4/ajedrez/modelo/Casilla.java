/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author utp
 */
public class Casilla extends Dibujable {

    private final Color color;
    private final int fila;
    private final char columna;

    private Ficha ficha;

    public Casilla(Color color, int fila, char columna) {
        this.color = color;
        this.fila = fila;
        this.columna = columna;
        ficha = null;
    }

    public Color getColor() {
        return color;
    }

    public int getFila() {
        return fila;
    }

    public char getColumna() {
        return columna;
    }

    public boolean isOcupada() {
        return ficha != null;
    }

    public Ficha getFicha() {
        return ficha;
    }

    public void setFicha(Ficha ficha) {
        this.ficha = ficha;
    }

    @Override
    public String toString() {
        return isOcupada() ? ficha.toString() : "  "; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(Graphics2D g, float x, float y) {
        g.draw(new Rectangle2D.Float(0, 0, 50, 50));
        
    }

}
