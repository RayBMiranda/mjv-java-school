import java.util.Date;

import models.Cadastro;
import models.Contrato;
import models.Endereco;
import models.NotificacaoTipo;
import models.Pessoa;
import service.ContratoService;
import service.TransmissorMensagem;
import service.TransmissorMensagemSms;
import service.TransmissorMensagemWhats;

public class Principal {
    public static void main(String[] args) {
        Contrato contrato = new Contrato();
        contrato.setNumeroProtocolo(123);
        Cadastro cadastro = new Cadastro();
        cadastro.setAtivo(true);
        cadastro.setNumero(27);
        cadastro.setNotificacaoTipo(NotificacaoTipo.WHATS);
        Pessoa pessoa = new Pessoa();
        pessoa.setCpf("123123");
        pessoa.setNome("Gleyson Sampaio");
        pessoa.setRg("898797");
        pessoa.setTelefone("99999999");
        Endereco endereco = new Endereco();
        endereco.setBairro("Santo Antonio");
        endereco.setCep("27.310-657");
        endereco.setCidade("São Paulo");
        endereco.setEstado("SP");
        endereco.setLogradouro("Rua das Marias");
        endereco.setNumero("243");
        pessoa.setEndereco(endereco);
        cadastro.setPessoa(pessoa);
        contrato.setCadastro(cadastro);
        contrato.setDataHora(new Date());
    
        ContratoService contratoService = new ContratoService();

        String mensagem = contratoService.gerarConteudoContrato(contrato);

        TransmissorMensagem transmissor = cadastro.getNotificacaoTipo() == NotificacaoTipo.SMS ? new TransmissorMensagemSms() : new TransmissorMensagemWhats();
        transmissor.transmitir(contrato.getCadastro().getPessoa().getTelefone(), mensagem);
    }
}
