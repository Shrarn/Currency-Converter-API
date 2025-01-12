package com.shrarn.Currency.Converter.services;

import com.shrarn.Currency.Converter.model.Currency;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class CurrencyService {

    public List<Currency> getConversion(String CurrencyFrom, String CurrencyTo, double amountFrom){

        List<Currency> list = new ArrayList<>();

        //Conversion to Dollar
        HashMap<String, Double> conversionRatesToDollar = new HashMap<>();
        conversionRatesToDollar.put("USD", 1.0); // US Dollar
        conversionRatesToDollar.put("INR", 0.012); // Indian Rupee
        conversionRatesToDollar.put("EUR", 1.1);  // Euro
        conversionRatesToDollar.put("GBP", 1.3);  // British Pound
        conversionRatesToDollar.put("JPY", 0.007); // Japanese Yen
        conversionRatesToDollar.put("AUD", 0.65); // Australian Dollar
        conversionRatesToDollar.put("CAD", 0.75); // Canadian Dollar

        double usdAmount = 0;

        if (conversionRatesToDollar.containsKey(CurrencyFrom)) {
            double rate = conversionRatesToDollar.get(CurrencyFrom);
            usdAmount = amountFrom * rate;
        } else {
            System.out.println("Currency not supported.");
        }




        //Conversion From Dollar
        HashMap<String, Double> conversionRatesFromDollar = new HashMap<>();
        conversionRatesFromDollar.put("USD", 1.0);// US Dollar
        conversionRatesFromDollar.put("INR", 82.5); // Indian Rupee
        conversionRatesFromDollar.put("EUR", 0.91); // Euro
        conversionRatesFromDollar.put("GBP", 0.77); // British Pound
        conversionRatesFromDollar.put("JPY", 142.8); // Japanese Yen
        conversionRatesFromDollar.put("AUD", 1.54); // Australian Dollar
        conversionRatesFromDollar.put("CAD", 1.33); // Canadian Dollar


        double convertedAmount = 0.0;

        // Convert from USD to the target currency
        if (conversionRatesFromDollar.containsKey(CurrencyTo)) {
            double rate = conversionRatesFromDollar.get(CurrencyTo);
            convertedAmount = usdAmount * rate;
        } else {
            System.out.println("Currency not supported.");
        }

        Currency currencyTo = new Currency(CurrencyTo, convertedAmount);
        Currency currencyFrom = new Currency(CurrencyFrom, amountFrom);

        list.add(currencyFrom);
        list.add(currencyTo);

        return list;
    }

}
