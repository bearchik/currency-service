package ru.bearchik.currency.xml;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class Valute {
    private String ID;
    private String NumCode;
    private String CharCode;
    private int Nominal;
    private String Name;
    private String Value;

    @XmlAttribute(name="ID")
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @XmlElement(name="NumCode")
    public String getNumCode() {
        return NumCode;
    }

    public void setNumCode(String numCode) {
        NumCode = numCode;
    }

    @XmlElement(name="CharCode")
    public String getCharCode() {
        return CharCode;
    }

    public void setCharCode(String charCode) {
        CharCode = charCode;
    }

    @XmlElement(name="Nominal")
    public int getNominal() {
        return Nominal;
    }

    public void setNominal(int nominal) {
        Nominal = nominal;
    }

    @XmlElement(name="Name")
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    @XmlElement(name="Value")
    public String getValue() {
        return Value;
    }

    public void setValue(String value) {
        Value = value;
    }
}
