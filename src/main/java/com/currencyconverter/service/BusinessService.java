package com.currencyconverter.service;

public interface BusinessService {
	public String getExchangeRateByCurrency(String currency);
	
	public String getResultValueFromRateAndAmount(double rate, double amount);
	
	public String getConvertedValueFromCurrencyAndAmount(String currency, double amount);
}
