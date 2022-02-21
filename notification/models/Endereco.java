package models;

public class Endereco {
    private String logradouro;
    private String cep;
    private String numero;
    private String bairro;
    private String cidade;
    private String estado;

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getLogradouro() {
        return logradouro;
    }
    public String getCep() {
        return cep;
    }
    public String getBairro() {
        return bairro;
    }
    public String getCidade() {
        return cidade;
    }
    public String getEstado() {
        return estado;
    }
    public String getNumero() {
        return numero;
    }
}
