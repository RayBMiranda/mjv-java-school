package com.mjvschool.notificacao.app;

import java.util.List;

import com.mjvschool.notificacao.model.dto.DadosArquivoDTO;
import com.mjvschool.notificacao.repository.ContratoRepository;
import com.mjvschool.notificacao.util.ArquivoUtil;

public class AguaLuzNotificacaoApp {
	private static ContratoRepository contratoRepositorio = new ContratoRepository();
	public static void main(String[] args) {
		faseLeituraArquivo();
        faseEnvioNotificacao();
		faseGeracaoArquivo();
	}


	private static void faseLeituraArquivo() {
		List<DadosArquivoDTO> dados = ArquivoUtil.lerArquivo();

        //contratoRepositorio.gravar(contrato2);
	}

    public static void faseEnvioNotificacao(){

    }

	private static void faseGeracaoArquivo() {
		/*List<Contrato> contratos =  contratoRepositorio.listarTodos();
		GeradorArquivo gerador = new GeradorArquivo();
		gerador.gerarArquivoCsv(contratos);
		gerador.gerarArquivoTxt(contratos);*/
		
	}
}
