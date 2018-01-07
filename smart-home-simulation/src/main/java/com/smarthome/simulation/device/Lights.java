package com.smarthome.simulation.device;

import com.smarthome.simulation.sensor.MotionDetector;
import com.smarthome.simulation.sensor.Subject;

public class Lights implements SmartDevice,Observer{
	private Subject sub=null;

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
		if(sub instanceof MotionDetector) {
			this.sub=sub;
		}
		
	}

	
}
