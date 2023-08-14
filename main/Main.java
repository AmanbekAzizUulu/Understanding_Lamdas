package main;

import controller.ElectricityConsumer;
import controller.Switcher;
import entity.Lamp;
import entity.Radio;
import entity.TVSet;

public class Main {
    public static void fire(Object subscriber) {
	System.out.println("FIRE!!!!");
    }

    public static void main(String[] args) {
	String message = "FIRE";
	
	Switcher switcher = new Switcher();
	Lamp lamp = new Lamp();
	Radio radio = new Radio();
	TVSet tVSet = new TVSet();

	// Event subscribe
	switcher.addSubscriber(lamp);
	switcher.addSubscriber(tVSet);
	switcher.addSubscriber(radio);

	switcher.addSubscriber(new ElectricityConsumer() {
	    @Override
	    public void electricityOn(Object subscriber) {
		System.out.println(message);
	    }
	});

	switcher.addSubscriber(subscriber -> {
	    System.out.println("\nFIRE!");
	    System.out.println("FIRE!!");
	    System.out.println("FIRE!!!");
	});
	
	switcher.addSubscriber(subscriber -> Main.fire(subscriber));
	switcher.addSubscriber(Main::fire);
	
	switcher.switchOn();

    }
}
