package com.mjvschool.notificacao.service;

public abstract class TransmissorMensagem {

    public abstract void transmitir (String telefoneDestino, String mensagem);
}
