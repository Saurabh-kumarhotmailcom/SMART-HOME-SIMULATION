package com.smarthome.simulation.device;

import com.smarthome.simulation.sensor.Subject;
import com.smarthome.simulation.sensor.WindSensor;

public class ExteriorBlinds implements SmartDevice,Observer{

	private Subject sub;
	
	
	public void accept() {
		// TODO Auto-generated method stub
		
	}
	public void update() {
		// TODO Auto-generated method stub

	}
	public void setConsumptionType(ConsumptionType consumptionType) {
		// TODO Auto-generated method stub
		
	}
	public void setSubject(Subject sub) {
		if(sub instanceof WindSensor) {
			this.sub=sub;
		}
		
	}
	
}
