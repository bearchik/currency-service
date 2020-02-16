package ru.bearchik.currency.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.bearchik.currency.jsons.ResponseCurrency;
import ru.bearchik.currency.requests.GetCurrencyInfo;
import ru.bearchik.currency.utils.DateConvert;
import ru.bearchik.currency.xml.ValCurs;

@RestController
@RequestMapping("/currency/api/rate")
public class CurrencyController {

    @GetMapping
    public String index() {
        return "passed";
    }

    @GetMapping("{currencyname}")
    public ResponseCurrency getCurrency(@PathVariable String currencyname) {
        ValCurs valCurs = new GetCurrencyInfo().getCurrencyInfoXml(new DateConvert().NowDateToXmlDate());

        ResponseCurrency responseCurrency = new ResponseCurrency(valCurs);
        responseCurrency.fillJson(currencyname);

        return responseCurrency;
    }

    @GetMapping("{currencyname}/{requestdate}")
    public ResponseCurrency getCurrencyForDate(@PathVariable String currencyname, @PathVariable String requestdate) {
        ValCurs valCurs = new GetCurrencyInfo().getCurrencyInfoXml(new DateConvert().RequestDateToXmlDate(requestdate));

        ResponseCurrency responseCurrency = new ResponseCurrency(valCurs);
        responseCurrency.fillJson(currencyname);

        return responseCurrency;
    }

}
