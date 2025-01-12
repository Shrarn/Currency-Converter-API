package com.shrarn.Currency.Converter.Controllers;

import com.shrarn.Currency.Converter.model.Currency;
import com.shrarn.Currency.Converter.services.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/CurrencyConvert")
public class CurrencyConverter {

    @Autowired
    private CurrencyService currency_service;

    // Define the endpoint to get currency conversions
    @GetMapping
    public List<Currency> getCurrency(@RequestBody CurrencyRequest request) {
        // Validate the input parameters
        if (request.getAmountFrom() == null) {
            throw new IllegalArgumentException("amountFrom cannot be null");
        }

        // Call the service method
        return currency_service.getConversion(request.getCurrencyFrom(), request.getCurrencyTo(), request.getAmountFrom());
    }

    // DTO for encapsulating the request body
    public static class CurrencyRequest {
        private String currencyFrom;
        private Double amountFrom;
        private String currencyTo;

        // Getters and Setters
        public String getCurrencyFrom() {
            return currencyFrom;
        }

        public void setCurrencyFrom(String currencyFrom) {
            this.currencyFrom = currencyFrom;
        }

        public Double getAmountFrom() {
            return amountFrom;
        }

        public void setAmountFrom(Double amountFrom) {
            this.amountFrom = amountFrom;
        }

        public String getCurrencyTo() {
            return currencyTo;
        }

        public void setCurrencyTo(String currencyTo) {
            this.currencyTo = currencyTo;
        }
    }
}