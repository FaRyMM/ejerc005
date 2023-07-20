package es.fmm.ejerc005;

import java.util.List;
import java.util.UUID;

abstract class Figura {
	
	protected String id;
	protected Posicion centro;
	protected String color;
	
	
	public Figura(String color, Posicion centro) 
	{
		this.id = UUID.randomUUID().toString();
		this.centro = centro;
		this.color = color;
	}
	
	public Posicion getPosicion() 
	{
		return centro;
	}
	
	public void setPosicion(Posicion centro) 
	{
		this.centro = centro;
	}

    
	public void dibujar(Figura figura, Lienzo lienzo) throws Exception {
		if(figura.verificaPosicion(lienzo))
			throw new RuntimeException("La figura esta fuera del area del dibujo");
		lienzo.add(figura);
	}
	
	public abstract void setColor(String color);
	public abstract String getColor();
	public abstract String getId();
    public abstract boolean verificaPosicion(Lienzo lienzo) throws Exception;
    public abstract void mover(Lienzo lienzo, int x, int y) throws Exception;


}
