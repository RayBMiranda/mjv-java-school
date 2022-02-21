package models;

public class Pessoa {
    private String nome;
    private String cpf; //cnpj
    private String rg;
    private String telefone;
    private Endereco endereco;    

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public String getRg() {
        return rg;
    }

    public String getTelefone() {
        return telefone;
    }
}
