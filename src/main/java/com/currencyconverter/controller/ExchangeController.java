package com.currencyconverter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.currencyconverter.service.BusinessServiceImpl;

@RestController
public class ExchangeController {
	
	@Autowired
	private BusinessServiceImpl businessServiceObj;

	@RequestMapping("/exchange")
	@ResponseBody
	public String getExchangeRateByCurrency(String currency) {
			return businessServiceObj.getExchangeRateByCurrency(currency);
	}

	@RequestMapping("/value")
	@ResponseBody
	public String getConvertedValueFromRateAndAmount(double rate, double amount) {
		return businessServiceObj.getResultValueFromRateAndAmount(rate, amount);
	}

	@RequestMapping("/value")
	@ResponseBody
	public String getConvertedValueFromCurrencyAndAmount(@RequestParam("currency") String currency, double amount) {
		return businessServiceObj.getConvertedValueFromCurrencyAndAmount(currency, amount);
	}

}
