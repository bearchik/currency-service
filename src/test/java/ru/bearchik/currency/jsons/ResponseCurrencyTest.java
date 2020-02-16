package ru.bearchik.currency.jsons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResponseCurrencyTest {
    ResponseCurrency responseCurrency = new ResponseCurrency(null);

    @Test
    void fillJson() {
        responseCurrency.fillJson("USD");
        ResponseCurrency testresponseCurrency = new ResponseCurrency(null);
        testresponseCurrency.setCode("Network error or cbr.ru is down.");
        assertEquals(responseCurrency.getCode(), testresponseCurrency.getCode());
    }
}