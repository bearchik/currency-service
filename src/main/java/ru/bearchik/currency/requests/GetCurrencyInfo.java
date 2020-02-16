package ru.bearchik.currency.requests;

import ru.bearchik.currency.xml.ValCurs;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.net.MalformedURLException;
import java.net.URL;

public class GetCurrencyInfo {

    private final static String URLSTRING = "http://www.cbr.ru/scripts/XML_daily.asp?date_req=";
    private ValCurs valCurs;

    public ValCurs getCurrencyInfoXml(String date) {
        URL url = null;
        try {
            url = new URL( URLSTRING + date );
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            JAXBContext jaxbContext = JAXBContext.newInstance( ValCurs.class );
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();;
            valCurs = (ValCurs) jaxbUnmarshaller.unmarshal(url);
        } catch (JAXBException e) {
            return null;
        }


        return valCurs;
    }
}
