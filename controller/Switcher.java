package controller;

import java.util.ArrayList;
import java.util.List;

public class Switcher {
    
    private List<ElectricityConsumer>  subscribers = new ArrayList<ElectricityConsumer>();

    public void addSubscriber (ElectricityConsumer electricityCinsumer) {
	subscribers.add(electricityCinsumer);
    }
    
    public void removeSubscriber(ElectricityConsumer electricityCinsumer) {
	this.subscribers.remove(electricityCinsumer);
    }
    
    public void switchOn() {
	System.out.println("Swtch is ON now");
	for (ElectricityConsumer electricityConsumer : subscribers) {
	    electricityConsumer.electricityOn(this);
	}
    }
}
