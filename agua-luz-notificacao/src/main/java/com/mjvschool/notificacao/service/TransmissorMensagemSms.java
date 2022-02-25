package com.mjvschool.notificacao.service;

public class TransmissorMensagemSms extends TransmissorMensagem{

    @Override
    public void transmitir(String telefoneDestino, String mensagem) {        
        System.out.println("Transmintindo SMS");
        System.out.println("Telefone destino:" + telefoneDestino);
        System.out.println(mensagem);       
    }
    
}
