package es.fmm.ejerc005;

import java.util.List;

public class Linea extends Figura{
	
	private Posicion fin;
	private double angulo;
	
	public Linea(Posicion centro, Posicion fin, double angulo, String color) 
	{
		super(color, new Posicion(
                (centro.getX() + fin.getX()) / 2,
                (centro.getY() + fin.getY()) / 2
        ));
		this.fin = fin;
		this.angulo = angulo;
	}
	
	public Posicion getInicial() 
	{
		return centro;
	}
	
	public Posicion getFinal() 
	{
		return fin;
	}

	public double getAngulo() 
	{
		return angulo;
	}
	
	public boolean verificaPosicion(Lienzo lienzo) {
			
			int xInicio = centro.getX() ;
			int yInicio = centro.getY() ;
			int xFin = fin.getX();
			int yFin = fin.getY();
			
			if(xInicio < 0 || xInicio >= lienzo.getAncho() || yInicio < 0 || yInicio >= lienzo.getAlto()
					|| xFin < 0 || xFin >= lienzo.getAlto() || yFin < 0 || yFin > lienzo.getAlto()) 
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
