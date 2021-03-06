package com.mjvschool.atracao.model.cadastro;

public enum Servico {
	AGUA("Água",137.21, 'A'),
	LUZ("Luz",132.15, 'L');
	
	private String nome;
	private Double valor;
	private char sigla;
	
	private Servico(String nome, Double valor, char sigla) {
		this.nome = nome;
		this.valor = valor;
		this.sigla = sigla;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
	}

	public char getSigla() {
		return sigla;
	}
	
}
