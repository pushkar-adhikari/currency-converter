package com.currencyconverter.models;

import org.springframework.data.repository.CrudRepository;

public interface ExchangeDAO extends CrudRepository<Exchange, Long> {
	public Exchange findExchangeById(long id);

	public Exchange findExchangeByCurrency(String currency);
}
