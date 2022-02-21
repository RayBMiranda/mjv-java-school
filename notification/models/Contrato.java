package models;

public class Contrato {
    private long numeroProtocolo;
    private Cadastro cadastro;

    public void setNumeroProtocolo(long numeroProtocolo) {
        this.numeroProtocolo = numeroProtocolo;
    }

    public void setCadastro(Cadastro cadastro) {
        this.cadastro = cadastro;
    }

    public Cadastro getCadastro() {
        return cadastro;
    }
    
    public long getNumeroProtocolo() {
        return numeroProtocolo;
    }

}
