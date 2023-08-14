package entity;

import controller.ElectricityConsumer;

public class Lamp implements ElectricityConsumer{
    
    private void lightOn() {
	System.out.println("Light is ON now");
    }

    @Override
    public void electricityOn(Object object) {
	lightOn();
    }
}
