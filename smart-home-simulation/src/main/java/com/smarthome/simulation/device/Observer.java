package com.smarthome.simulation.device;

import com.smarthome.simulation.sensor.Subject;

/**
 * The Interface Observer.
 */
public interface Observer {
	
	/**
	 * Update metod used by Subjects to trgger updates
	 */
	void update();
	
	/**
	 * Sets the subject.
	 *
	 * @param sub the new subject
	 */
	void setSubject(Subject sub);
}
