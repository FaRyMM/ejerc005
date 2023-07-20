package es.fmm.ejerc005;

import java.util.List;

public class Cuadrado extends Figura {
	
	private double lado;
	
	public Cuadrado(double lado, String color, Posicion centro) 
	{
		super(color, centro);
		this.lado = lado;
	}
	

	@Override
	public boolean verificaPosicion(Lienzo lienzo) {
		
		double xInicio = centro.getX() - (lado / 2);
		double yInicio = centro.getY() - (lado / 2);
		
		if(xInicio < 0 || xInicio >= lienzo.getAncho() || yInicio < 0 || yInicio >= lienzo.getAlto()) 
		{
			return true;
		}
		
		return false;
	}


	@Override
	public void mover(Lienzo lienzo, int x, int y) throws Exception {
		if(verificaPosicion(lienzo))
    		throw new Exception("No se puede mover a esa posición");
    	
        centro.setX(centro.getX() + x);
        centro.setY(centro.getY() + y);
		
	}


	@Override
	public String getId() {
		return id;
	}


	@Override
	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public String getColor() {
		return this.color;
	}



	
	
}
