package Encapsulation;

public class encapsulation {
public static void main(String[]args) {
	ex obj = new ex();
	obj.m1();
	System.out.println(ex.b); //public data members/variables can be access 
//	System.out.println(ex.a); //private data members/variables cannot be access 
	obj.m2();
}
}
class ex{
	static int b=20; // 'b'is not a tightly encapsulated variable because of non-private access modifier
	private static int a=10; //variable 'a' is tightly type encapsulation
	public void m1() {
		System.out.println(a);
	}
	private double balance= 380000.90;
	public double m2() {
		System.out.println(balance);
		return balance;
		
	}
}