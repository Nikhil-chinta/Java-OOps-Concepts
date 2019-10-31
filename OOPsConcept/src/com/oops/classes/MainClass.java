package com.oops.classes;

public class MainClass {
	public static void main(String[] args) {
		
		Car Hyundai = new Car();
//		Hyundai.model = "i20";
		Hyundai.setModel("i10");
		System.out.println("model is "+ Hyundai.getModel());
	}

}
