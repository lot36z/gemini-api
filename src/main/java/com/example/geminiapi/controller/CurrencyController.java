package com.example.geminiapi.controller;

import java.util.List;

import com.example.geminiapi.domain.Currency;
import com.example.geminiapi.service.CurrencyService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyController {

    private final CurrencyService currencyService;

    public CurrencyController(CurrencyService currencyService) {
        this.currencyService = currencyService;
    }

    @RequestMapping(value = "/api/currency/", method = RequestMethod.GET)
    public ResponseEntity<CurrencyResponse> findAll() {
        List<Currency> currencies = currencyService.findAll();
        CurrencyResponse currencyResponse = CurrencyResponse.builder().currencies(currencies).build();
        return new ResponseEntity<CurrencyResponse>(currencyResponse, HttpStatus.OK);
    }

    @RequestMapping(value = "/api/currency/", method = RequestMethod.POST)
    public ResponseEntity<HttpStatus> save(@RequestBody CurrencyAddRequest request) {
        currencyService.save(request.getName(), request.getSymbol());
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
