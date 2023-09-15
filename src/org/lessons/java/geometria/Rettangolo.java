package org.lessons.java.geometria;

public class Rettangolo {

		public int base;
		public int height;
		
		public Rettangolo(int base, int height) {
			this.base = base;
			this.height = height;
		}
		
		
		public int calculateArea() {
			
			int area = this.base * this.height;
			
			return area;
		}
		
		
		public int calculatePerimeter() {
			
			int perimeter = (this.base * 2) + (this.height * 2);
			
			return perimeter;
		}
		
		
		public void paintGeometry() {
			// Stampo il primo lato (Base)
			for(int i = 0; i < base; i++) {
				System.out.print("o");
			}
			
			
			// Stampo i lati ()
			System.out.print("\n");
			for(int i = 1; i < height -1; i++) {
				System.out.print("o");
				
				for(int x = 1; x < base -1; x++) {
					System.out.print(" ");
				}
				System.out.println("o");
			}
			
			// Stampo la base
			for(int i = 0; i < base; i++) {
				System.out.print("o");
			}
		}
}
