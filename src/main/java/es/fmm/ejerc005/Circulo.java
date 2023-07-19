package es.fmm.ejerc005;

import java.util.List;

public class Circulo extends Figura {
	
	private double radio;
	
	public Circulo(Posicion centro, double radio, String color) 
	{
		super(color, centro);
		this.radio = radio;
	}

	@Override
	public void dibujar(List<char[]> lienzo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(List<char[]> lienzo) {
		// TODO Auto-generated method stub
		
	}

	//comprobar las x y las y de las posiciones y el temaño del lienzo para saber si esta dentro
	

}
