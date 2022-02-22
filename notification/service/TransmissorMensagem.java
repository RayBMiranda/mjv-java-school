package service;

public abstract class TransmissorMensagem {

    public abstract void transmitir (String telefoneDestino, String mensagem);

    /*
    public void transmitir(String telefoneDestino, String mensagem){
        if(telefoneDestino == null || telefoneDestino.isEmpty())
            return;
        
        System.out.println("Transmintindo SMS");
        System.out.println("Telefone destino:" + telefoneDestino);
        System.out.println(mensagem);
    } */  
}
