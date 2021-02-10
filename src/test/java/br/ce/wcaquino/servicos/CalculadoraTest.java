package br.ce.wcaquino.servicos;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

import br.ce.wcaquino.exceptions.NaoPodeDividirPorZero;

public class CalculadoraTest {
	
	private Calculadora calculadora;
	
	
	@Before
	public void init() {
		calculadora = new Calculadora();
	}

	@Test
	public void deveSomarDoisValores() {
		// cenario
		int a = 5;
		int b = 3;

		//acao
		int resultado = calculadora.somar(a, b);

		// verificacao
		assertThat(resultado, is(8));
	}

	@Test
	public void deveSubtrairDoisNumeros() {

		// cenario
		int a = 5;
		int b = 3;

		//acao
		int resultado = calculadora.subtrair(a, b);

		// verificacao
		assertThat(resultado, is(2));
	}

	@Test(expected = NaoPodeDividirPorZero.class)
	public void deveDividirDoisNumeros() throws NaoPodeDividirPorZero {
		// cenario
		int a = 6;
		int b = 0;

		//acao
		int resultado = calculadora.dividir(a, b);

		// verificacao
		assertThat(resultado, is(2));

	}
}
