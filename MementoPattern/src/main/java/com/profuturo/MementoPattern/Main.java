package com.profuturo.MementoPattern;

import com.profuturo.MementoPattern.originator.Originator;
import com.profuturo.MementoPattern.protector.Protector;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		// Se crea el estado inicial de un carro
		Originator car = new Originator("Mazda", "2015", "90000");
		car.showInfo();

		// Se crea el objeto Protector (Caretaker)
		Protector caretaker = new Protector();

		// Se guarda el primer estado del carro
		caretaker.addMemento(car.createMemento());

		// Se modifica el estado del carro
		car.modInfo("Chevrolet", "2018", "85000");
		car.showInfo();

		// Se retorna el objeto carro al estado anterior
		car.restoreState(caretaker.getMemento());
		car.showInfo();
	}

}
