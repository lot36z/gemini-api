package com.example.geminiapi.service;

import java.util.List;

import com.example.geminiapi.domain.Currency;
import com.example.geminiapi.repository.CurrencyRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrencyService {

    private final CurrencyRepository currencyRepository;

    @Autowired
    public CurrencyService(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public List<Currency> findAll() {
        return currencyRepository.findAll();
    }

    public Currency save(String name, String symbol) {
        return currencyRepository.save(Currency.newCurrency(name, symbol));
    }
}
