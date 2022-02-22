package models;

import java.util.Date;

public class Contrato {
    private long numeroProtocolo;
    private Cadastro cadastro;
    private Date dataHora;

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

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Date getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return numeroProtocolo + " - "  + dataHora.toString();
    }
}
