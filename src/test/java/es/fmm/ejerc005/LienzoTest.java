package es.fmm.ejerc005;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.booleanThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.*;

class LienzoTest {

	Lienzo lienzo;
	
	@BeforeEach
	void setUp() throws Exception {
		lienzo = new Lienzo(20,500);
	}

	@Test
	void comprobarMetodoAdd() {
		
		Circulo circuloMock = mock(Circulo.class);
		Cuadrado cuadradoMock = mock(Cuadrado.class);
		lienzo.add(circuloMock);
		lienzo.add(cuadradoMock);

		assertThat(lienzo.getFiguras().size(), is(2));
		
	}
	
	@Test
	void comprobarSiMueveLaFigura() throws Exception 
	{
		  //simula la clase circulo
        Circulo circuloMock = mock(Circulo.class);
        lienzo.add(circuloMock);

        // establecemos el valor de la posicion
        when(circuloMock.getPosicion()).thenReturn(new Posicion(80, 180));
       // Movemos la figura simulada en el lienzo
        circuloMock.centro = new Posicion(80, 180);
        
        circuloMock.mover(lienzo, 20, 50);

        // Verificamos que el método funciona
        verify(circuloMock).mover(lienzo, 100, 230);

        // Verificamos que el método funciona(esto no sale bien)
        //verify(circuloMock).mover(lienzo, 100, 230);
        
        // Obtenemos la nueva posición
        Posicion nuevaPosicion = circuloMock.getPosicion();

        // Creamos la nueva posición esperada
        Posicion posicionEsperada = new Posicion(100, 230);

        // Verificamos que la nueva posición es la esperada
        assertEquals(posicionEsperada, nuevaPosicion);
        
	}
	
	@Test
	void comprobarQueCambiaDeColor() 
	{
        // Simulamos cuadrado
        Cuadrado cuadradoMock = mock(Cuadrado.class);
        cuadradoMock.setColor("verde");

        //damos valor a devolver
        when(cuadradoMock.getColor()).thenReturn("lila");
        when(cuadradoMock.getId()).thenReturn("ID"); 
        lienzo.add(cuadradoMock);
        //cambio de color
        lienzo.cambiarColorFigura(cuadradoMock, "lila");

        // Verificamos que se ha cambiado
        assertEquals("lila", lienzo.getFigura("ID").getColor());
    }
	
	@Test
	void comprobarQueEliminaFiguras() 
	{
		  Circulo circulo2 = mock(Circulo.class);

	        // Agregamos una figura simulada al lienzo
	        lienzo.add(circulo2);

	        // Eliminamos una figura simulada del lienzo
	        lienzo.borrarFigura(circulo2);

	        // Verificamos que el tamaño de la lista sea 1
	        assertThat(lienzo.getFiguras().size(), is(0));
	}
	
	@Test
	void comprobarQueVerificaPosicionYloPasa() 
	{
		// Simulamos cuadrado
        Cuadrado cuadradoMock = mock(Cuadrado.class);

        // Establecemos el valor a devolver
        when(cuadradoMock.verificaPosicion(any())).thenReturn(false);

        // Verificamos que el resultado que sea false
        assertFalse(cuadradoMock.verificaPosicion(lienzo));
		
	}
	
	@Test
	void comprobarQueVerificaPosicionYlanzaExcepcion() throws Exception 
	 {
        // Simulamos cuadrado
        Cuadrado cuadradoMock = mock(Cuadrado.class);

        // Establecemos que devuelva una excepcion
        when(cuadradoMock.verificaPosicion(any())).thenThrow(new Exception());

        // Verificamos que el metodo lanza una excepcion
        assertThrows(Exception.class, () -> cuadradoMock.verificaPosicion(lienzo));

	 }
	
}