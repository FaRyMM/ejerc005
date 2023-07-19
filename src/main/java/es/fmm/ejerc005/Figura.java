package es.fmm.ejerc005;

import java.util.List;

abstract class Figura {
	
	protected Posicion centro;
	protected String color;
	
	
	public Figura(String color, Posicion centro) 
	{
		this.centro = centro;
		this.color = color;
	}
	

    public void mover(int x, int y) {
        centro.setX(centro.getX() + x);
        centro.setY(centro.getY() + y);
    }

    public void cambiarColor(String nuevoColor) {
        color = nuevoColor;
    }

    public String obtenerColor() {
        return color;
    }

    public abstract void dibujar(List<char[]> lienzo);
    public abstract void borrar(List<char[]> lienzo);

}
