package serlization;

import java.io.Serializable;

public class Vehicle implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8452075896217418473L;
	private String type;
	private int number;
	public Vehicle(String type, int number) {
		super();
		this.type = type;
		this.number = number;
	}
	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", number=" + number + "]";
	}
	
	

}
