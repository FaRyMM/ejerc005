package es.fmm.ejerc005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lienzo {
	
	private int ancho = 100000;
	private int alto = 100000;
	private List<Figura> figuras;
	
	public Lienzo() 
	{
		figuras = new ArrayList<>();
	}
	
	 public int getAncho() {
	        return ancho;
	    }

	    public int getAlto() {
	        return alto;
	    }

	    public void addFigura(Figura figura) {
	        figuras.add(figura);
	    }

	    public void borrarFigura(Figura figura) {
	        figuras.remove(figura);
	    }

	    public void moverFigura(Figura figura, int x, int y) {
	        figura.mover(x, y);
	    }

	    public void cambiarColorFigura(Figura figura, String nuevoColor) {
	        figura.cambiarColor(nuevoColor);
	    }

	    public List<Figura> getFiguras() {
	        return figuras;
	    }





	

}
