package Variables;

public class Variables {
	
public static void main(String[] args) {
		
		ex obj = new ex(); // or new ex().m1();
		obj.m1();//method calling
		System.out.println("static variable :" + ex.s); // calling static variable
		ex obj1 = new ex();
		obj1.m2();
	}
}

class ex {
	int i = 10; // instance variable
	static int s = 20; // static variable
	
	void m1() { 
		int L; //variable declaration
		L = 12; // Assigning the value
		System.out.println("local variable :" + L + "\n" + "instance variable :" + i );
	}
	
	void m2() {
		System.out.println(i + s);
	}
}
