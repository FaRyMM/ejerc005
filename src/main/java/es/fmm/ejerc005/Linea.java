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

	@Override
	public void dibujar(List<char[]> lienzo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(List<char[]> lienzo) {
		// TODO Auto-generated method stub
		
	}

}
