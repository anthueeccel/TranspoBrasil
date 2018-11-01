package br.com.cursojava;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTeste {
		
	private Calculador calc;

	@Before
	public void antesDeCadaTest() { 
		calc = new Calculador();
		
		System.out.print("Iniciando teste...");
	}
	
	@After
	public void depoisDeCadaTest() {
		System.out.println("Finalizado.");
	}
	@Test
	public void testSomarDoisMaisDois() { 
	

		double resultado = calc.somar(2.0, 2.0);
		Assert.assertEquals(4.0, resultado, 0);
		//Assert.fail("Teste somar ainda nao implementado");
	}
	
	@Test
	public void testSomarDoisMaisTres() { 		

		double resultado = calc.somar(2.0, 3.0);
		Assert.assertEquals(5.0, resultado, 0);
	}

	@Test
	public void testSomarCincoMaisVinte() { 		

		double resultado = calc.somar(5.0, 20.0);
		Assert.assertEquals(25.0, resultado, 0);
	}
	
	@Test
	public void testSubtrairCincoMenosDois() { 		

		double resultado = calc.subtrair(5.0, 2.0);
		Assert.assertEquals(3.0, resultado, 0);
	}
	
	@Test
	public void testDividirOitoPorDois() { 		

		double resultado = calc.subtrair(8.0, 2.0);
		Assert.assertEquals(4.0, resultado, 0);
//		Assert.fail("Teste dividir falhou");
	}
}
