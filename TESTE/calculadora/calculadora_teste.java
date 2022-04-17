package calculadora;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class calculadora_teste {
	
	//teste
	
	@Test
	public void testSomaDoisNumeros() {
		Calculadora calc = new Calculadora();
		int soma = calc.soma(4, 5);		
		Assertions.assertEquals(9, soma);		
	}
	
	@Test
	public void testDivisaoDoisNumeros() {
		Calculadora calc = new Calculadora();
		int divisao = calc.divisao(8, 4);
		assertTrue(divisao == 2);
	}
}
