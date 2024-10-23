package Methodoverloading;

public class Methodoverloading {
	
		public static void main(String[]args) {
			
			Methodoverloading obj = new Methodoverloading();
			
			int ex = obj.plusMethodInt(6, 4);
			double exa = obj.plusMethodDouble(4.8, 6.2);
			System.out.println("X+Y="+ex+"\n"+"x+y="+exa);
		
		}

		int plusMethodInt(int x, int y) {
			return x+y;
		}
		
		double plusMethodDouble(double x, double y) {
			return x+y;
		}
	}


