package Keyword;

public class super_keyword {// super keyword : it refers parent class
	
	public static void main(String args[]) {
		child obj = new child(); // by default super constructor
		obj.printColor();
	}
}
class parent{
	String color="white";
	parent() {//constructor
		System.out.println("parent class constructor");
	}
	void m1() {//method
		 System.out.println("parent class method");
	}
}
class child extends parent{
	String color="black";
	void printColor() {
		System.out.println(color);//prints color from child class
		System.out.println(super.color); //calling super class variable
		super.m1(); //calling super class method : by using super keyword
	}
}