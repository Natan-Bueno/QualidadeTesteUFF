package fatura;

import java.util.Date;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Testes da fatura")
public class fatura_teste {
	
	Date data;
	Fatura fatura;

	@BeforeEach
	public void inicializa() {
		data = new Date();
		fatura = new Fatura(data,"natan", 1000.0, "nao pago");
	}
	
	@Test
	public void testeGetNome() {
		String nome = fatura.getNome();
		Assertions.assertEquals(nome, "natan");
	}
	
	@Test
	public void testeGetData() {
		Date dia = fatura.getData();
		Assertions.assertEquals(dia, data);
	}
	
	@Test
	public void testeGetValor() {
		double valor = fatura.getValor();
		Assertions.assertEquals(valor, 1000.0);
	}
	
	@Test
	public void testeGetStatus() {
		String sts = fatura.getStatus();
		Assertions.assertEquals(sts, "nao pago");
	}
	

}
