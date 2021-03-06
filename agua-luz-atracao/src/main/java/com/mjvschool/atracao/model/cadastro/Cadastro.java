package com.mjvschool.atracao.model.cadastro;

public class Cadastro {
    private int numero;
    private boolean ativo;
    private Pessoa pessoa;
    private NotificacaoTipo notificacaoTipo;

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public int getNumero() {
        return numero;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public NotificacaoTipo getNotificacaoTipo() {
        return notificacaoTipo;
    }

    public void setNotificacaoTipo(NotificacaoTipo notificacaoTipo) {
        this.notificacaoTipo = notificacaoTipo;
    }
}
