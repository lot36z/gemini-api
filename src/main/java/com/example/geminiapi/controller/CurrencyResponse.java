package com.example.geminiapi.controller;

import java.util.List;

import com.example.geminiapi.domain.Currency;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CurrencyResponse {
    private List<Currency> currencies;
}
