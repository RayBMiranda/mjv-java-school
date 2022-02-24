package com.mjvschool.notificacao.repository;

import java.util.ArrayList;
import java.util.List;

import com.mjvschool.notificacao.model.contrato.Contrato;

public class ContratoRepository {
	private List <Contrato> contratos = new ArrayList<Contrato>();
	public void gravar(Contrato contato) {
		contratos.add(contato);
	}
	public List <Contrato> listarTodos(){
		return contratos;
	}
}
