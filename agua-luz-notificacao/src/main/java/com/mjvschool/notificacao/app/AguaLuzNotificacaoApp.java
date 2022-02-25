package com.mjvschool.notificacao.app;

import java.util.List;

import com.mjvschool.notificacao.model.cadastro.NotificacaoTipo;
import com.mjvschool.notificacao.model.dto.DadosArquivoDTO;
import com.mjvschool.notificacao.repository.DadosArquivoRepository;
import com.mjvschool.notificacao.service.ContratoService;
import com.mjvschool.notificacao.service.TransmissorMensagem;
import com.mjvschool.notificacao.service.TransmissorMensagemSms;
import com.mjvschool.notificacao.service.TransmissorMensagemWhats;
import com.mjvschool.notificacao.util.ArquivoUtil;

public class AguaLuzNotificacaoApp {
	private static DadosArquivoRepository dadosRepositorio = new DadosArquivoRepository();
	public static void main(String[] args) {
		faseLeituraArquivo();
        faseEnvioNotificacao();
		faseGeracaoArquivo();
	}


	private static void faseLeituraArquivo() {
		List<DadosArquivoDTO> dados = ArquivoUtil.lerArquivo();
		for (DadosArquivoDTO dadosArquivoDTO : dados) {
			dadosRepositorio.gravar(dadosArquivoDTO);
		}
	}

    public static void faseEnvioNotificacao(){
		ContratoService contratoService = new ContratoService();

		for(DadosArquivoDTO dados : dadosRepositorio.listarTodos()){
			String mensagem = contratoService.gerarConteudoContrato(dados);

			TransmissorMensagem transmissor = dados.getNotificacaoTipo() == NotificacaoTipo.SMS ? new TransmissorMensagemSms() : new TransmissorMensagemWhats();
			transmissor.transmitir(dados.getCelular(), mensagem);
		}
    }

	private static void faseGeracaoArquivo() {
		/*List<Contrato> contratos =  contratoRepositorio.listarTodos();
		GeradorArquivo gerador = new GeradorArquivo();
		gerador.gerarArquivoCsv(contratos);
		gerador.gerarArquivoTxt(contratos);*/
		
	}
}
