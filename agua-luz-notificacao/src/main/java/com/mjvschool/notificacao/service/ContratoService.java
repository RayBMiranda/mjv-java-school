package com.mjvschool.notificacao.service;

import com.mjvschool.notificacao.model.dto.DadosArquivoDTO;
import com.mjvschool.notificacao.util.DataUtil;

public class ContratoService {
    public String gerarConteudoContrato(DadosArquivoDTO dadosArquivoDTO){
        StringBuilder txt = new StringBuilder();
        txt.append("Senhor(a) ");
        txt.append(dadosArquivoDTO.getNome());
        txt.append(" cpf de número ");
        txt.append(dadosArquivoDTO.getCpf());
        txt.append(" Informamos que conforme contrato com protocolo de número ");
        txt.append(dadosArquivoDTO.getProtocolo());
        txt.append(" está agendado para a data "); 
        txt.append(DataUtil.preparaData(dadosArquivoDTO.getData())).append(" as ").append(DataUtil.preparaHora(dadosArquivoDTO.getData())).append("h");
        txt.append(" a instalação da ").append(dadosArquivoDTO.getTipoInstalacao().getNome());
        txt.append(" com taxa de valor ").append(dadosArquivoDTO.getTipoInstalacao().getValor());
        txt.append(" em sua residência localizada no endereço abaixo:");
        txt.append("\nLogradouro: ").append(dadosArquivoDTO.getLogradouro());
        txt.append("\nComplemento: ").append(dadosArquivoDTO.getComplemento());
        txt.append("\nBairro: ").append(dadosArquivoDTO.getBairro());
        txt.append("\nCidade: ").append(dadosArquivoDTO.getCidade()).append(" / ").append(dadosArquivoDTO.getEstado());
        txt.append("\nCep: ").append(dadosArquivoDTO.getCep());

        return txt.toString();
    }
}
