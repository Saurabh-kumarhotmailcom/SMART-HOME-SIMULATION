package com.smarthome.simulation;

/**
 * The Enum House.Singleton House object
 */
public enum House implements HomeObject{
	INSTANCE;
	
	public HomeObject homeObject;
	
	
	
	void addHomeObject(HomeObject homeObject){
		if(homeObject instanceof Floor) {
			this.homeObject=homeObject;
		}
		//TODO: throw exception
	}
	
	public void removeHomeObject() {
		this.homeObject=null;
	}
	
}
