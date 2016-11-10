package com.currencyconverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.currencyconverter.service.BusinessServiceImpl;

@RestController
public class ExchangeController {
	
	@Autowired
	private BusinessServiceImpl businessServiceImpl;

	@RequestMapping("/getExchangeByCurrency")
	@ResponseBody
	public String getExchange(String currency) {
			return businessServiceImpl.getExchangeRate(currency);
	}

	@RequestMapping("/getValue")
	@ResponseBody
	public String getValue(double rate, double amount) {
		return businessServiceImpl.getResultValue(rate, amount);
	}

	@RequestMapping("/getValueById")
	@ResponseBody
	public String getValueByCurrency(String currency, double amount) {
		return businessServiceImpl.getResultValueByCurrency(currency, amount);
	}

}
