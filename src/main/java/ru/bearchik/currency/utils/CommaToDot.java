package ru.bearchik.currency.utils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class CommaToDot {
    public Double convert(String value) {
        NumberFormat format = NumberFormat.getInstance(Locale.FRANCE);
        Number number = null;
        try {
            number = format.parse(value);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return number.doubleValue();
    }
}
