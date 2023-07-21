package com.gqt.entities;

public class Mobile {

	public OperatingSystem operatingsystem = new OperatingSystem("Android",512);
	
	public Charger charger;
	
	public void setCharger(Charger charger) {
		this.charger = charger;
	}
	
}
