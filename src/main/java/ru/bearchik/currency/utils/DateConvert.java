package ru.bearchik.currency.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class DateConvert {
    private final static String XMLSTRINGPATTER= "dd/MM/yyyy";
    private final static String REQUESTSTRINGPATTERN = "yyyy-MM-dd";
    private final static String XMLANSWERSTRINGPATTERN = "dd.MM.yyyy";

    public String XmlDateToJsonDate(String date) {
        Date datestring = null;
        try {
            datestring = new SimpleDateFormat(XMLANSWERSTRINGPATTERN).parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        SimpleDateFormat formatter = new SimpleDateFormat(REQUESTSTRINGPATTERN);

        return formatter.format(datestring);
    }

    public String RequestDateToXmlDate(String date) {
        Date datestring = null;
        try {
            datestring = new SimpleDateFormat(REQUESTSTRINGPATTERN).parse(date);
        } catch (ParseException e) {
            return NowDateToXmlDate();
        }

        SimpleDateFormat formatter = new SimpleDateFormat(XMLSTRINGPATTER);

        return formatter.format(datestring);
    }

    public String NowDateToXmlDate() {
        Date datestring = new Date();
        LocalDateTime localDateTime = datestring.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime dateplusone = localDateTime.plusDays(1);
        Date currentDatePlusOneDay = Date.from(dateplusone.atZone(ZoneId.systemDefault()).toInstant());

        SimpleDateFormat formatter = new SimpleDateFormat(XMLSTRINGPATTER);

        return formatter.format(currentDatePlusOneDay);
    }

}
