package Variables;

public class Methods {
		public static void main(String[] args) {
			
			normalandStaticMethods obj = new normalandStaticMethods();
			obj.m1();
			normalandStaticMethods.m2();
			
		}

	}
	class normalandStaticMethods {
		void m1() {
			System.out.println("instance method");
		}
		static void m2() {
			String print = "print static method";
			System.out.println(print);
		
	}
	}

