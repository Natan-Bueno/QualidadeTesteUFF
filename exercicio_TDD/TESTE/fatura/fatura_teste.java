package fatura;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fatura.Fatura;

@DisplayName("Testes da fatura")
public class fatura_teste {
	
	Fatura fatura;

	@BeforeEach
	public void inicializa() {
		fatura = new fatura(new Date(),"natan", 1000.0, 'nao pago')
	}
	
	@Test
	public void testegetnome() {
		String nome = fatura.getnome();
		Assertions.assertEquals(nome, "natan");
	}	

}
