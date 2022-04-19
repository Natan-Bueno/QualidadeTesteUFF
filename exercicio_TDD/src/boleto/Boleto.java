package boleto;

import java.util.Date;

public class Boleto {
	
	//Um boleto contém :
	//código do boleto, 
	//data, e 
	//valor pago.
	
	private String codBoleto;
	private Date data;
	private double valorPago;
	
	public Boleto(String codBoleto, Date data) {
		super();
		this.codBoleto = codBoleto;
		this.data = data;
		this.valorPago = 0.00;
	}

	public double getValorPago() {
		return valorPago;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

	public String getCodBoleto() {
		return codBoleto;
	}

	public Date getData() {
		return data;
	}
	
	
	

}
