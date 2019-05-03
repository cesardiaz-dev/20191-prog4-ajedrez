/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.pro4.ajedrez.modelo;

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *
 * @author utp
 */
public class Peon extends Ficha {
    
    public Peon(Color color) {
        super(color);
    }
    
    @Override
    public void mover() {
        //TODO: Mover como peon
    }
    
    @Override
    public void comer() {
        //TODO: Comer como peon
    }
    
    @Override
    public void draw(Graphics2D g, float x, float y) {
        // 50x50 dibujar la ficha
        g.draw(new Ellipse2D.Float(25, 20, 10, 10));
        g.draw(new Rectangle2D.Float(25, 30, 35, 40));
    }
}
