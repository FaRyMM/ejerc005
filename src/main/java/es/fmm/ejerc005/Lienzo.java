package es.fmm.ejerc005;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lienzo<T> implements Pintar<T>{
	
	private int ancho = 100000;
	private int alto = 100000;
	private List<Object> figuras;
	
	public Lienzo() 
	{
		figuras = new ArrayList<>();
	}
	

    public void addFigura(T figura) {
        figuras.add(figura);
    }

	@Override
	public void borrar() {

	}


	@Override
	public void mover() {
	
	}


	@Override
	public void cambiarColor(String color) {

	}


	@Override
	public void dibujar(Object figura) {
		// TODO Auto-generated method stub
		
	}





	

}
