package ru.bearchik.currency.utils;

import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class DateConvertTest {
    DateConvert dateConvert = new DateConvert();

    @Test
    void xmlDateToJsonDate() {
        assertEquals(dateConvert.XmlDateToJsonDate("02.03.2002"), "2002-03-02");
    }

    @Test
    void requestDateToXmlDate() {
        assertEquals(dateConvert.RequestDateToXmlDate("2020-02-15"), "15/02/2020");
        assertEquals(dateConvert.RequestDateToXmlDate("asdasdasd"), nowdateplusday());
    }

    @Test
    void nowDateToXmlDate() {
        assertEquals(dateConvert.NowDateToXmlDate(), nowdateplusday());
    }

    String nowdateplusday() {
        String xmlstringpattern = "dd/MM/yyyy";
        Date datestring = new Date();
        LocalDateTime localDateTime = datestring.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        LocalDateTime dateplusone = localDateTime.plusDays(1);
        Date currentDatePlusOneDay = Date.from(dateplusone.atZone(ZoneId.systemDefault()).toInstant());

        SimpleDateFormat formatter = new SimpleDateFormat(xmlstringpattern);

        return formatter.format(currentDatePlusOneDay);
    }
}