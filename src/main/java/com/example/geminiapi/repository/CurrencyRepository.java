package com.example.geminiapi.repository;

import com.example.geminiapi.domain.Currency;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CurrencyRepository extends JpaRepository<Currency, Long> {

}
