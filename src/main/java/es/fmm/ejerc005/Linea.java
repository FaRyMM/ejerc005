package es.fmm.ejerc005;

public class Linea {
	
	private Posicion inicial;
	private Posicion fin;
	private double angulo;
	
	public Linea(Posicion inicial, Posicion fin, double angulo) 
	{
		this.inicial = inicial;
		this.fin = fin;
		this.angulo = angulo;
	}
	
	public Posicion getInicial() 
	{
		return inicial;
	}
	
	public Posicion getFinal() 
	{
		return fin;
	}

	public double getAngulo() 
	{
		return angulo;
	}

}
