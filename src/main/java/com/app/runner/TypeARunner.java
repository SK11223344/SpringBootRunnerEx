package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(55)
public class TypeARunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("From TypeARunner....");
	}

}
