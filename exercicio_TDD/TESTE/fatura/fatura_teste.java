package fatura;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Date;

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
		fatura = new Fatura(new Date(),"natan", 1000.0, "nao pago");
	}
	
	@Test
	public void testeGetNome() {
		String nome = fatura.getNome();
		Assertions.assertEquals(nome, "natan");
	}	

}
