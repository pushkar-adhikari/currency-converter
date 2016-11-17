package com.currencyconverter.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "exchange")
public class Exchange {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@NotNull
	private String currency;

	@NotNull
	private String rate;

	// Constructors

	public Exchange() {
	}

	public Exchange(String currency) {
		this.currency = currency;
	}

	public Exchange(String currency, String exchangeRate) {
		this.currency = currency;
		this.rate = exchangeRate;
	}

	// Getter & Setter

	public void setId(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getRate() {
		return rate;
	}

	public void setRate(String rate) {
		this.rate = rate;
	}

}
