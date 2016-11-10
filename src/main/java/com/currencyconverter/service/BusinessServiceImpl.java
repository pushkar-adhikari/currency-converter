package com.currencyconverter.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.currencyconverter.models.Exchange;
import com.currencyconverter.models.ExchangeDAO;

@Service
public class BusinessServiceImpl implements BusinessService {
	
	@Autowired
	private ExchangeDAO exchangeDAO;

	@Override
	public String getExchangeRate(String currency) {
		Exchange exchange = exchangeDAO.findExchangeByCurrency(currency);
		return exchange.getRate();
	}

	@Override
	public String getResultValue(double rate, double amount) {
		double value = rate * amount;
		return String.valueOf(value);
	}

	@Override
	public String getResultValueByCurrency(String currency, double amount) {
		String rateAsString = getExchangeRate(currency);
		double rateAsDouble = Double.valueOf(rateAsString);
		return getResultValue(rateAsDouble, amount);
	}

}
