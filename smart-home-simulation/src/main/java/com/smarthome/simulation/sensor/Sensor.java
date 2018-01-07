package com.smarthome.simulation.sensor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.smarthome.simulation.device.Observer;

public class Sensor implements Subject {

	private List<Observer> observers;
	private String message;
	private boolean changed;
	// private final Object MUTEX = new Object();

	public Sensor() {
		this.observers = Collections.synchronizedList(new ArrayList<Observer>());
	}

	public void register(Observer obj) {
		if (obj == null)
			throw new NullPointerException("Null Observer");

		if (!observers.contains(obj))
			observers.add(obj);
	}

	public void unregister(Observer obj) {
		observers.remove(obj);
	}

	public void notifyObservers() {
		List<Observer> observersLocal = null;
		
		if (!changed)
			return;
		observersLocal = new ArrayList<Observer>(this.observers);
		this.changed = false;
			
		for (Observer obj : observersLocal) {
			obj.update();
		}

	}

	public Object getUpdate(Observer obj) {
		return this.message;
	}

	public void notify(String msg) {
		this.message = msg;
		this.changed = true;
		notifyObservers();
	}
}
