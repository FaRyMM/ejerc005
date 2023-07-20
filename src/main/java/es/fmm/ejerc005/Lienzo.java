package es.fmm.ejerc005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lienzo {
	
	private int ancho ;
	private int alto ;
	private List<Figura> figuras;
	
	public Lienzo(int xancho, int yalto) 
	{
		this.ancho = xancho;
		this.alto = yalto;
		figuras = new ArrayList<>();
	}
	
	 public int getAncho() {
	        return ancho;
	    }

	    public int getAlto() {
	        return alto;
	    }
//metodo dibujas solo añade al listado la figura a pinta comprobando su posicion antes
	    
	    public void add(Figura figura) {
	        figuras.add(figura);
	    }
//borrar de la lita la figura
	    
	    public void borrarFigura(Figura figura) {
	        figuras.remove(figura);
	    }

	    public void moverFigura(Figura figura, Lienzo lienzo, int x, int y) throws Exception {
	        figura.mover(lienzo, x, y);
	    }
//cambia el color de la figura
	    
	    public void cambiarColorFigura(Figura figura, String nuevoColor) {
	        figura.setColor(nuevoColor);
	    }
	    
//obtiene por id la figura   
	    
	    public Figura getFigura(String Id) 
	    {
	    	for(Figura x : figuras)
			{
				if(x.getId().equals(Id)) 
				{
					return x;
				}
			}
			return null;
	    
	    }
//obtiene todas las figuras    
	    
	    public List<Figura> getFiguras() {
	        return figuras;
	    }





	

}
