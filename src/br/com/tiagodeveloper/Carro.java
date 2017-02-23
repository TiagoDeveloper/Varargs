package br.com.tiagodeveloper;

public class Carro {
	
	private String marca;
	private int ano;
	private String modelo;
	
	public Carro() {
	}
	public Carro(String marca, int ano, String modelo) {
		this.marca = marca;
		this.ano = ano;
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", ano=" + ano + ", modelo=" + modelo + "]";
	}
	
}
