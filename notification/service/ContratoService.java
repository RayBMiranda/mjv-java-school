package service;

import models.Contrato;

public class ContratoService {
    public String gerarConteudoContrato(Contrato contrato){
        String texto = "";
        texto += "Senhor(a) " + contrato.getCadastro().getPessoa().getNome();
        texto += " Informamos que conforme contrato com protocolo de número " + contrato.getNumeroProtocolo();
        return texto;
    }
}
