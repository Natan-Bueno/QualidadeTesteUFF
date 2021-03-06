package calculadora;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes do pacote calculadora")
public class calculadora_teste {
	
	
	@DisplayName("Testa a soma de dois n?meros")
	@Test
	public void testSomaDoisNumeros() {
		Calculadora calc = new Calculadora();
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@DisplayName("Testa a divis?o de dois n?meros")
	@Test
	public void testDivisaoDoisNumeros() {
		Calculadora calc = new Calculadora();
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
	
	@DisplayName("Testa a subtra??o de dois n?meros")
	@Test
	public void testSubtracaoDoisNumeros() {
		Calculadora calc = new Calculadora();
		int subtrai = calc.subtracao(10, 2);
		assertTrue(subtrai == 8);
	}
	
	@DisplayName("Testa se um n?mero ? positivo")
	@Test
	public void testNumPositivo() {
		Calculadora calc = new Calculadora();
		boolean positivo = calc.ehPositivo(10);
		assertTrue(positivo == true);
	}
	
	@DisplayName("Testa de compara??o entre dois n?meros")
	@Test
	public void testComparaDoisNumeros() {
		Calculadora calc = new Calculadora();
		int comparacao = calc.compara(10,10);
		assertTrue(comparacao == 0);
	}
}
