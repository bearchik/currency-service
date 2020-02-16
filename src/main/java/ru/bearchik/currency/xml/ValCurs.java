package ru.bearchik.currency.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement(name = "ValCurs")
public class ValCurs {
    private String date;
    private String name;
    private ArrayList<Valute> valutes;

    @XmlAttribute(name="Date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @XmlAttribute(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name="Valute")
    public ArrayList<Valute> getValutes() {
        return valutes;
    }

    public void setValutes(ArrayList<Valute> valutes) {
        this.valutes = valutes;
    }
}
