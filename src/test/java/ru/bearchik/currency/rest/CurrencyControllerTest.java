package ru.bearchik.currency.rest;

import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.*;

class CurrencyControllerTest extends Assert {

    CurrencyController currencyController =  new CurrencyController();

    @Test
    void index() {
        assertEquals(currencyController.index(), "Test passed. App v2");
    }

}