package es.fmm.ejerc005;

public interface Pintar<T> {

	void dibujar(T figura);
    void borrar();
    void mover();
	void cambiarColor(String color);
	
}
