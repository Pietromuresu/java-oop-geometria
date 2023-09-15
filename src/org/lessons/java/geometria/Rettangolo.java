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
		
}
