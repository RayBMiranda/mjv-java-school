package com.mjvschool.notificacao.util;

import java.text.NumberFormat;
import java.util.Locale;

public class NumeroUtil {
    public static Double preparaDouble(String valorStr){
        String valorAtual = valorStr.substring(0, valorStr.length()-2) + "." + valorStr.substring(valorStr.length()-2, valorStr.length());
        Double valor = Double.parseDouble(valorAtual);
        return valor;
    }

    public static String formataValor(Double valor, Locale local){
        return NumberFormat.getCurrencyInstance(local).format(valor);
    }
}
