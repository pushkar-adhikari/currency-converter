package com.currencyconverter;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		
		return;
	}

}