package boleto;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testes do Boleto")
public class boleto_teste {
	
	Date data;
	Boleto boleto;
	
	@BeforeEach
	public void inicializa() {
		data = new Date();
		boleto = new Boleto("0001",data);
	}
	
	@Test
	public void testeGetValorPago() {
		double valor = boleto.getValorPago();
		Assertions.assertEquals(valor, 0.00);
	}
	
	@Test
	public void testeGetCodBoleto() {
		String codBoleto = boleto.getCodBoleto();
		Assertions.assertEquals(codBoleto, "0001");
	}
	
	@Test
	public void testeGetData() {
		Date dia = boleto.getData();
		Assertions.assertEquals(dia, data);
	}
	
	@Test
	public void testeSetValorPago() {
		boleto.setValorPago(100.00);
		double valor = boleto.getValorPago();
		Assertions.assertEquals(valor, 100.00);
	}
	
}
