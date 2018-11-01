package br.com.cursojava;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalcDescTest {

	private CalcDescontos cd;

	@Before
	public void AntesDosTestes() {
		cd = new CalcDescontos();
	}

	@Test
	public void testRangeNegativos() {
		double resultado = cd.calculo(-10.00);
		Assert.assertEquals(0, resultado, 0);

		double resultado2 = cd.calculo(-1.00);
		Assert.assertEquals(0, resultado2, 0);

	}

	@Test
	public void testRange0a1800() {
		double resultado = cd.calculo(0.00);
		Assert.assertEquals(0, resultado, 0);

		double resultado1 = cd.calculo(17.00);
		Assert.assertEquals(17, resultado1, 0);

		double resultado2 = cd.calculo(1800.00);
		Assert.assertEquals(1800, resultado2, 0);

	}
	
	//desconto 5%
	@Test
	public void testRangeMaior1800ate2400() {
		double resultado = cd.calculo(1800.01);
		Assert.assertEquals(1710.0095, resultado, 0);

		double resultado2 = cd.calculo(2400.00);
		Assert.assertEquals(2280, resultado2, 0);

	}

	// desconto 22%
	@Test
	public void testRangeMaior24000ateMenor3600() {
		double resultado = cd.calculo(2400.01);
		Assert.assertEquals(1872.0078, resultado, 0.1);

		double resultado2 = cd.calculo(3599.99);
		Assert.assertEquals(2807.9922, resultado2, 0.1);

	}

	// desconto 32%
	@Test
	public void testRangeMaior3600() {
		double resultado = cd.calculo(3600.01);
		Assert.assertEquals(2448.0068, resultado, 0.1);

		double resultado2 = cd.calculo(5000.00);
		Assert.assertEquals(3400, resultado2, 0.1);

	}

}
