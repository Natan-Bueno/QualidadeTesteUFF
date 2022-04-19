package fatura;

import java.util.Date;

public class Fatura {
		
	private Date data;
	private String nome;
	private double valor;
	private String status;
	
	public Fatura(Date data, String nome, double valor) {
		super();
		this.data = data;
		this.nome = nome;
		this.valor = valor;
		this.status = "não pago";
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
	
	public String getStatus() {
		return status;
	}
	
	public void setStatusPago() {
		this.status = "pago";
	}
	
}