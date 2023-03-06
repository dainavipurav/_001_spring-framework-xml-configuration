package com.abc.learning.modules.car;

import com.abc.learning.interfaces.GovtRecognition;
import com.abc.learning.interfaces.Introduction;
import com.abc.learning.interfaces.Vehicle;

public class Car implements Vehicle {

	private String name;
	private String type;
	private String color;
	private int gearCount;
	private int seatCount;

	private Introduction introduction;
	private GovtRecognition govtRecognition;

	public Car(String name, String type, String color, int gearCount, int seatCount, Introduction introduction,
			GovtRecognition govtRecognition) {
		super();
		this.name = name;
		this.type = type;
		this.color = color;
		this.gearCount = gearCount;
		this.seatCount = seatCount;
		this.introduction = introduction;
		this.govtRecognition = govtRecognition;
	}

	@Override
	public String name() {
		return name;
	}

	@Override
	public String type() {
		return type;
	}

	@Override
	public String color() {
		return color;
	}

	@Override
	public int seatCount() {
		return seatCount;
	}

	@Override
	public int gearCount() {
		return gearCount;
	}

	@Override
	public void display() {
		System.out.println("*** Vehicle Details ***");
		System.out.println("Vehicle Name : " + name);
		System.out.println("Vehicle Type : " + type);
		System.out.println("Vehicle Color : " + color);
		System.out.println("Vehicle Gear : " + gearCount);
		System.out.println("Vehicle No. Of Seats : " + seatCount);
		System.out.println("Vehicle Image : " + introduction.image());
		System.out.println("Vehicle Intro : " + introduction.intro());
		System.out.println("Vehicle Govt Recognized : " + govtRecognition.isGovtRecognized());
		System.out.println();
	}

	@Override
	public void destroy() {
		System.out.println("Destroying Car bean...");
	}

}
