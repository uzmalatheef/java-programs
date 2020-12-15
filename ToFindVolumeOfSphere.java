package com.xworkz.memorymanagement1;

public class ToFindVolumeOfSphere {

	public static void main(String[] args) {
		// TODO Auto-generated method
		// Volume = 4/3*pi*r^3;
		System.out.println("program to find volume of sphere");
		ToFindVolumeOfSphere findvol = new ToFindVolumeOfSphere();
		double result = findvol.findvolumeofsphere(1);
		System.out.println("Volume :" + result);
		System.out.println("End of the program");

	}

	double findvolumeofsphere(int radius) {
		double volume;
		double pi = findpi();
		volume = (4.00 / 3.00) * pi * radius * radius * radius;
		return volume;

	}

	double findpi() {
		double pi = (22d / 7d);
		return pi;
	}

}
