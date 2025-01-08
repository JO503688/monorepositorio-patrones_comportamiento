package com.profuturo.StrategyPattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		Context simpleContext = new Context(new SimpleAntivirus());
		simpleContext.run();

		Context advancedContext = new Context(new AdvancedAntivirus());
		advancedContext.run();
	}

}
