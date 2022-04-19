package fatura;

import java.util.Date;

public class Fatura {
		
	private Date data;
	private String nome;
	private double valor;
	private String pago;
	
	public Fatura(Date data, String nome, double valor, String pago) {
		super();
		this.data = data;
		this.nome = nome;
		this.valor = valor;
		this.pago = pago;
	}
	
	public String getNome() {
		return nome;
	}
	
	public Date getData() {
		return data;
	}
	
	public double getValor() {
		return valor;
	}
	
}