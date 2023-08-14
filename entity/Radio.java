package entity;

import controller.ElectricityConsumer;

public class Radio implements ElectricityConsumer{

    
    private void radioOn() {
	System.out.println("Radio is ON now");
    }
    
    @Override
    public void electricityOn(Object object) {
	radioOn();
    }

}
