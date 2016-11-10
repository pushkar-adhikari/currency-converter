package com.currencyconverter.service;

public interface BusinessService {
	public String getExchangeRate(String currency);
	
	public String getResultValue(double rate, double amount);
	
	public String getResultValueByCurrency(String currency, double amount);
}
