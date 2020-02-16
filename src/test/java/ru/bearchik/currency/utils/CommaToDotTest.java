package ru.bearchik.currency.utils;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommaToDotTest {
    CommaToDot commaToDot = new CommaToDot();

    @Test
    void convert() {
        assertEquals(commaToDot.convert("123,123"),123.123);
    }
}