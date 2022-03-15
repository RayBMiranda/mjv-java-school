package com.mjvschool.util;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class NumberUtil {
    public static String currencyFormat(BigDecimal n) {
        return NumberFormat.getCurrencyInstance().format(n);
    }
}
