package com.nartkoc.ehcachedemo.controller;

import com.nartkoc.ehcachedemo.entity.Currency;
import com.nartkoc.ehcachedemo.repository.CurrencyRepository;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Transactional
public class CurrencyController {

	private final CurrencyRepository currencyRepository;

	public CurrencyController(CurrencyRepository currencyRepository) {
		this.currencyRepository = currencyRepository;
	}

	@GetMapping("/currency")
    @Cacheable(cacheNames = "allCurrency")
	public ResponseEntity<List<Currency>> getAllCurrency() {

		List<Currency> allCurrency = currencyRepository.findAll();
		return ResponseEntity.status(HttpStatus.OK).body(allCurrency);

	}

}
