package com.profuturo.StatePattern;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		Pet dogui =  new Pet();

		new Menu(dogui).display();
	}

}
