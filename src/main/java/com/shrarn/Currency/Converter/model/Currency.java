package com.shrarn.Currency.Converter.model;

public class Currency {

    private String currency;

    private double amount;

    public Currency(String currency, double amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public Currency()
    {

    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
