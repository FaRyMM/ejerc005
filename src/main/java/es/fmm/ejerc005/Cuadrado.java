package es.fmm.ejerc005;

public class Cuadrado extends Figura {
	
	private double lado;
	
	public Cuadrado(double lado, String color, Posicion centro) 
	{
		super(color, centro);
		this.lado = lado;
	}
	

	public void cambiaColor(String color) 
	{
		this.color = color;
	}
	
	public String getColor() 
	{
		return this.color;
	}
	
}
