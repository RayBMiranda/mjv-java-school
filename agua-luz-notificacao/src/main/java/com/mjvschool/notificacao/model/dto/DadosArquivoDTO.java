package com.mjvschool.notificacao.model.dto;

import java.util.Date;

import com.mjvschool.notificacao.model.cadastro.NotificacaoTipo;
import com.mjvschool.notificacao.model.cadastro.Servico;

public class DadosArquivoDTO {
    private String cpf;
    private String nome;
    private String celular;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String protocolo;
    private Date data;
    private Servico tipoInstalacao;
    private Double valor;
    private NotificacaoTipo notificacaoTipo;
    private String pais;
    private String linguagem;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() { 
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Servico getTipoInstalacao() {
        return tipoInstalacao;
    }

    public void setTipoInstalacao(Servico tipoInstalacao) {
        this.tipoInstalacao = tipoInstalacao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public NotificacaoTipo getNotificacaoTipo() {
        return notificacaoTipo;
    }

    public void setNotificacaoTipo(NotificacaoTipo notificacaoTipo) {
        this.notificacaoTipo = notificacaoTipo;
    }

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }

    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
}
