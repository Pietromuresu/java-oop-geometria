package org.lessons.java.geometria;

public class Main {
	
	public static void main(String[] args) {
		Rettangolo rettangolo1 = new Rettangolo(20, 10);
		
		System.out.println("Base: " + rettangolo1.base);
		System.out.println("Height: " + rettangolo1.height);
		
		System.out.println("Area: " + rettangolo1.calculateArea());
		System.out.println("Perimeter: " + rettangolo1.calculatePerimeter());
	}
}
