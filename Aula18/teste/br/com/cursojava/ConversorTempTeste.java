package br.com.cursojava;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ConversorTempTeste {

	private ConversorTemperatura conversor;
	
	@Before
	public void AntesDosTestes() {
		conversor = new ConversorTemperatura();
	}
	
	@Test
	public void converte32FparaC() {
		double resultado = conversor.FparaC(32.0, 0.0);
		Assert.assertEquals(0.0, resultado, 1);
	}
	
	@Test
	public void converte60FparaC() {
		double resultado = conversor.FparaC(60.0, 0.0);
		Assert.assertEquals(15.5555555555555555555555555, resultado, 0);
	}
	
	@Test
	public void converte0CparaF() {
		double resultado = conversor.CparaF(0.0, 0.0);
		Assert.assertEquals(32.0, resultado, 0);
	}
	
	
	@Test
	public void converte50CparaF() {
		double resultado = conversor.CparaF(0.0, 50.0);
		Assert.assertEquals(122, resultado, 0);
	}

	@Test
	public void converte15CparaF() {
		double resultado = conversor.CparaF(0.0, 15.0);
		Assert.assertEquals(59, resultado, 0);
	}

}
