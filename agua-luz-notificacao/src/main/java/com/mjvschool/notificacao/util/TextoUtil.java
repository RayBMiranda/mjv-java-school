package com.mjvschool.notificacao.util;

import java.lang.System.Logger.Level;
import java.text.ParseException;
import java.util.logging.Logger;

import javax.swing.text.MaskFormatter;

public class TextoUtil {
	public static String preencher(String textoOriginal, int tamanhoMaximo, boolean esquerda){
        String formato = "%" + (esquerda == true ? "" : "-") + String.valueOf(tamanhoMaximo).concat("s");
        String novaString = String.format(formato, textoOriginal);
        return novaString;
    }

    public static String limitar(String textoOriginal, int tamanhoMaximo) {
        String novaString = textoOriginal.substring(0, Math.min(tamanhoMaximo, textoOriginal.length()));
        return novaString;
    }

    public static String ajustar(String textoOriginal, int tamanhoMaximo){
        String novaString = "";
        if (textoOriginal == null)
            novaString = preencher("", tamanhoMaximo, false);
        else
            novaString = preencher(textoOriginal, tamanhoMaximo, false);
        novaString = limitar(novaString, tamanhoMaximo);
        return novaString;
    }

    public static String somenteNumeros(String textoOriginal) {
        String novaString = textoOriginal.replaceAll("[^0-9]", "");
        return novaString;
    }

    public static String ajustarSomenteNumeros(String textoOriginal, int tamanhoMaximo){
        String novaString = somenteNumeros(textoOriginal);
        novaString = ajustar(novaString, tamanhoMaximo);
        return novaString;
    }

    public static String preencherSomenteNumeros(String textoOriginal, int tamanhoMaximo, boolean esquerda){
        String novaString = somenteNumeros(textoOriginal);
        novaString = preencher(novaString, tamanhoMaximo, esquerda);
        return novaString;
    }

    public static String formatarCPF(String cnpj) {
        try {
            MaskFormatter mask = new MaskFormatter("###.###.###-##");
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(cnpj);
        } catch (ParseException ex) {
            System.out.println(ex);
            return "";
        }
    }

    public static String formatarCEP(String cep) {
        try {
            MaskFormatter mask = new MaskFormatter("##.###-###");
            mask.setValueContainsLiteralCharacters(false);
            return mask.valueToString(cep);
        } catch (ParseException ex) {
            System.out.println(ex);
            return "";
        }
    }
}
