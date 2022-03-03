package com.mjvschool.notificacao.service;

import java.util.Locale;

import com.mjvschool.notificacao.model.dto.DadosArquivoDTO;
import com.mjvschool.notificacao.util.DataUtil;
import com.mjvschool.notificacao.util.NumeroUtil;
import com.mjvschool.notificacao.util.TextoUtil;

public class ContratoService {
    public String gerarConteudoContrato(DadosArquivoDTO dadosArquivoDTO){
        StringBuilder txt = new StringBuilder();
        txt.append("Senhor(a) ");
        txt.append(dadosArquivoDTO.getNome());
        txt.append(" cpf de número ");
        txt.append(TextoUtil.formatarCPF(dadosArquivoDTO.getCpf()));
        txt.append(" Informamos que conforme contrato com protocolo de número ");
        txt.append(dadosArquivoDTO.getProtocolo());
        txt.append(" está agendado para a data "); 
        txt.append(DataUtil.formataData(dadosArquivoDTO.getData(), new Locale(dadosArquivoDTO.getLinguagem(), dadosArquivoDTO.getPais()))).append(" as ").append(DataUtil.preparaHora(dadosArquivoDTO.getData())).append("h");
        txt.append(" a instalação da ").append(dadosArquivoDTO.getTipoInstalacao().getNome());
        txt.append(" com taxa de valor ").append(NumeroUtil.formataValor(dadosArquivoDTO.getTipoInstalacao().getValor(), new Locale(dadosArquivoDTO.getLinguagem(), dadosArquivoDTO.getPais()) ));
        txt.append(" em sua residência localizada no endereço abaixo:");
        txt.append("\nLogradouro: ").append(dadosArquivoDTO.getLogradouro());
        txt.append("\nComplemento: ").append(dadosArquivoDTO.getComplemento());
        txt.append("\nBairro: ").append(dadosArquivoDTO.getBairro());
        txt.append("\nCidade: ").append(dadosArquivoDTO.getCidade()).append(" / ").append(dadosArquivoDTO.getEstado());
        txt.append("\nCep: ").append(TextoUtil.formatarCEP(dadosArquivoDTO.getCep()));

        return txt.toString();
    }
}
