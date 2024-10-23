package Variables;

public class Normalandstaticmethod {

		public static void main(String[]args) {
			
			A obj1 = new A();
			obj1.m1();
			obj1.m2();//end of second class //
			obj1.m3();
			B obj2 = new B();
			obj2.m4();
			obj2.m5();
			C obj3 = new C();
			obj3.m6();
			obj3.m7();
			obj3.m8();
			obj3.m9();
			obj3.m10();		
}
}
	class A{
		int m1() {
			int a=10;
			int b=30;
			int c= a+b;
			
		System.out.println("instance method" + c);
		return c;
	}
		static void m2() {
			System.out.println("Print Static method 2");
		}
		static void m3() {
			System.out.println("Print Static method 3");
		}
	}
	class B{
	void m4 () {
		System.out.println("Print Instance");
	}
		static void m5() {
		String print = ("Print Static method 5");
		System.out.println(print);
		}
	}
	class C {
		static void m6() {
			System.out.println("Print Static method 6");
		}
		static void m7 () {
			System.out.println("Print Static Method 7");
		}
		void m8 () {
			System.out.println("Print method 8");
		}
		void m9() {
			System.out.println("Print method 9");
		}
		void m10() {
			System.out.println("Print method 10");
		}
	}


	


	

