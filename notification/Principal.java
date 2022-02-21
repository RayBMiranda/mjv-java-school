import models.Contrato;
import models.Endereco;

public class Principal {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNumeroProtocolo(123);

        System.out.println(contrato.getNumeroProtocolo());

        Endereco end = new Endereco();
        end.setEstado("SP");

        System.out.println(end.getEstado());
    }
}
