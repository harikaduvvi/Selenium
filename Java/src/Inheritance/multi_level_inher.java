package Inheritance;

public class multi_level_inher {
	
		public static void main(String args[]) {
		
		c obj = new c();
		obj.m1();
		obj.m2();
		obj.m3();
		}
	}
	class a {
		void m1() {
			System.out.println("Class A method");
		}
	}
	class b extends a{
		void m2() {
			System.out.println("Class B method");
		}
	}
	class c extends b{
		void m3() {
			System.out.println("Class C method");
		}
	}
