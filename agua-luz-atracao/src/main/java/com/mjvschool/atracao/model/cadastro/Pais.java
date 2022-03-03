package com.mjvschool.atracao.model.cadastro;

public enum Pais {
	BRASIL ("BR","Brasil", "pt") ,
	PERU ("PE","Peru", "es") ,
	ESTADOS_UNIDOS ("US","Estados Unidos", "en") ;
	
	private String sigla;
	private String nome;
	private String language;
	
	private Pais(String sigla,String nome, String language) {
		this.nome = nome;
		this.sigla = sigla;
		this.language = language;
	}
	
	public String getSigla() {
		return sigla;
	}
	
	public String getNome() {
		return nome;
	}

	public String getLanguage() {
		return language;
	}
}
