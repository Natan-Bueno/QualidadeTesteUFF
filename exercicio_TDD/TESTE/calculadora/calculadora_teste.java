package calculadora;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fatura.Fatura;

@DisplayName("Testes do pacote calculadora")
public class calculadora_teste {
	
	
	@DisplayName("Testa a soma de dois números")
	@Test
	public void testSomaDoisNumeros() {
		Fatura calc = new Fatura();
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@DisplayName("Testa a divisão de dois números")
	@Test
	public void testDivisaoDoisNumeros() {
		Fatura calc = new Fatura();
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@DisplayName("Testa a subtração de dois números")
	@Test
	public void testSubtracaoDoisNumeros() {
		Fatura calc = new Fatura();
		int subtrai = calc.subtracao(10, 2);
		assertTrue(subtrai == 8);
	}
	
	@DisplayName("Testa se um número é positivo")
	@Test
	public void testNumPositivo() {
		Fatura calc = new Fatura();
		boolean positivo = calc.ehPositivo(10);
		assertTrue(positivo == true);
	}
	
	@DisplayName("Testa de comparação entre dois números")
	@Test
	public void testComparaDoisNumeros() {
		Fatura calc = new Fatura();
		int comparacao = calc.compara(10,10);
		assertTrue(comparacao == 0);
	}
}
