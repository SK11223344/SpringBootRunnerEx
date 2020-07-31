package com.app.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

@Component
public class MyTestRunner implements CommandLineRunner,Ordered {

	@Override
	public int getOrder() {
		return 55;
	}

	@Override
	public void run(String... args) throws Exception {
	System.out.println("From MyTestRunner....");	
	}

}
