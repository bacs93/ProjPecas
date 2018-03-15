package br.com.projpecas.entidade;

public class Cadastro {
	
	private int id;
	private String nome;
	private double peso;
	private String tipo;
	private int data_de_cadastro;
	private float valor;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getData_de_cadastro() {
		return data_de_cadastro;
	}
	public void setData_de_cadastro(int data_de_cadastro) {
		this.data_de_cadastro = data_de_cadastro;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}
}
