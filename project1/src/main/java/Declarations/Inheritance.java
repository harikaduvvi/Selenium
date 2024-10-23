package Declarations;
public class Inheritance {
		public static void main(String args[]) {
		//Object Inheritance;
		multi obj = new multi();
			obj.m1();
			obj.m2();

	}
	static class multi extends Variable_declaration{
			public void m1() {
			String Name = "Harika";
			System.out.println( "WebElement Name ="+Name);		
		}
		public void m2() {
			String id = "234@";
			System.out.println( "WebElement id ="+id);
		}
	}
}
