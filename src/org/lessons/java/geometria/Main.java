package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int limit = 3;
		
		Rettangolo rettangolo1 = null;
		Rettangolo rettangolo2 = null;
		Rettangolo rettangolo3 = null;
		
		for(int i = 1; i < limit + 1; i++) {
			String rettangoloName = "rettangolo" + i;
			
			System.out.print("Define an heigth for " + rettangoloName + ": " );
			int height = sc.nextInt();

			System.out.print("Define the base length for " + rettangoloName  + ": " );
			int base = sc.nextInt();
			
			if(i == 1) {
				
				rettangolo1 = new Rettangolo(base, height); 
			}else if(i == 2) {
				
				rettangolo2 = new Rettangolo(base, height); 	
			}else {
				
				rettangolo3 = new Rettangolo(base, height); 
			}
		}
		
		System.out.println("\n Rettangolo 1 --------------------------------------- ");
		System.out.println("Rettangolo 1 Area: " + rettangolo1.base);
		System.out.println("Rettangolo 1 Area: " + rettangolo1.height);
		System.out.println("Rettangolo 1 Area: " + rettangolo1.calculateArea());
		System.out.println("Rettangolo 1 Perimeter: " + rettangolo1.calculatePerimeter());
		rettangolo1.paintGeometry();
		
		
		System.out.println("\n Rettangolo 2 --------------------------------------- ");

		System.out.println("Rettangolo 1 Area: " + rettangolo2.base);
		System.out.println("Rettangolo 1 Area: " + rettangolo2.height);
		System.out.println("Rettangolo 2 Area: " + rettangolo2.calculateArea());
		System.out.println("Rettangolo 2 Perimeter: " + rettangolo2.calculatePerimeter());
		rettangolo2.paintGeometry();
		
		System.out.println("\n Rettangolo 3 ---------------------------------------  ");
		System.out.println("Rettangolo 1 Area: " + rettangolo3.base);
		System.out.println("Rettangolo 1 Area: " + rettangolo3.height);
		System.out.println("Rettangolo 3 Area: "	+ rettangolo3.calculateArea());
		System.out.println("Rettangolo 3 Perimeter: "	+ rettangolo3.calculatePerimeter());
		rettangolo3.paintGeometry();
		
	}
}
