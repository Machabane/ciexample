package ciexample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import ciexample.model.Calculadora;

/**
 * Unit test for simple App.
 */
public class CalculadoraTest {

	@Test
	public void deveriaSomarDoisNumeroPositivos() { 
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.somar(3, 7);
		
		assertEquals(9, soma); 
	}
}
