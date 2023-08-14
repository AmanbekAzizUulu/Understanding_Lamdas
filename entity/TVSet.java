package entity;

import controller.ElectricityConsumer;

public class TVSet implements ElectricityConsumer{
    private void TVSetOn() {
	System.out.println("TVSet is ON now");
    }
    
    @Override
    public void electricityOn(Object object) {
	TVSetOn();
    }
}
