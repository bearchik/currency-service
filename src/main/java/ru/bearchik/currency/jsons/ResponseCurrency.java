package ru.bearchik.currency.jsons;

import ru.bearchik.currency.utils.CommaToDot;
import ru.bearchik.currency.utils.DateConvert;
import ru.bearchik.currency.xml.ValCurs;

import java.text.DecimalFormat;

public class ResponseCurrency {
    private String code;
    private String rate;
    private String date;
    private ValCurs valCurs;

    public ResponseCurrency(ValCurs valCurs) {
        this.valCurs = valCurs;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void fillJson(String currencyname) {
        if (valCurs == null) {
            code = "Network error or cbr.ru is down.";
            return;

        }

        if ((valCurs.getValutes() == null)) {
            code = "Date is wrong or nothing found for this date.";
            return;
        }

        for (int i = 0; i < valCurs.getValutes().size(); i++) {
            if (valCurs.getValutes().get(i).getCharCode().equals(currencyname.toUpperCase())) {
                this.code = currencyname.toUpperCase();
                Double value = new CommaToDot().convert(valCurs.getValutes().get(i).getValue());
                this.rate =  new DecimalFormat("#0.0000").format(value).replace(",",".");
                this.date = new DateConvert().XmlDateToJsonDate(valCurs.getDate());
                return;
            }

            if (code == null) {
                code = "Currency not found.";
            }
        }
    }



}
