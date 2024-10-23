package Inheritance; //Inheritance : it acquires the properties from one class to other

//Single inheritance: one class acquires all the properties of another class with

public class Single_inheritance {
	public static void main(String args[]) {
	
	child obj = new child();
	obj.m1();
	obj.m2();
	}
}
class parent {
	void m1() {
		int a= 10;
		System.out.println("parent class " +a);
	}
}
class child extends parent {
		void m2() {
			System.out.println("child class");

		}
}