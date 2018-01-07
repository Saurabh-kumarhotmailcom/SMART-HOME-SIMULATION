package com.smarthome.simulation.device;

import com.smarthome.simulation.sensor.Subject;

public interface Observer {
	void update();
	void setSubject(Subject sub);
}
