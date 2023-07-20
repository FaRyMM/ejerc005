package es.fmm.ejerc005;

import java.io.IOException;
import java.util.List;

public class Circulo extends Figura {
	
	private double radio;
	
	public Circulo(Posicion centro, double radio, String color) 
	{
		super(color, centro);
		this.radio = radio;
	}

	public double getRadio() 
	{
		return radio;
	}
	
	public void setRadio(double radio) 
	{
		this.radio = radio;
	}
	
	public boolean verificaPosicion(Lienzo lienzo) throws Exception {
		
		double xInicio = centro.getX() - radio ;
		double yInicio = centro.getY() - radio;
		
		if(xInicio < 0 || xInicio >= lienzo.getAncho() || yInicio < 0 || yInicio >= lienzo.getAlto()) 
		{
			throw new Exception("la figura esta fuera del lienzo");
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
