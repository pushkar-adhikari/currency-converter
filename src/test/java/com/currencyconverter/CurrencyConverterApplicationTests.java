package com.currencyconverter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.currencyconverter.models.ExchangeDAO;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CurrencyConverterApplicationTests {

	@Autowired
	ExchangeDAO exchangeDAO;
	
	@Test
	public void contextLoads() {
		assertEquals(2, exchangeDAO.count());
	}

}
