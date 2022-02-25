package com.mjvschool.notificacao.service;

public class TransmissorMensagemWhats extends TransmissorMensagem{

    @Override
    public void transmitir(String telefoneDestino, String mensagem) {        
        System.out.println("Transmintindo Whats");
        System.out.println("Telefone destino:" + telefoneDestino);
        System.out.println(mensagem);       
    }
    
}
