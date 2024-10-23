package Abstraction;

public class abstr {
public static void main(String args[]) {
	Rectangle obj= new Rectangle(); //it executes Rectangle class method
	obj.draw();
	obj.m1();
new Circle1().draw(); //it executes Circle1 class method
}
}
abstract class Shape{ //abstract class: A class declared with the abstract keyword
abstract void draw(); //abstract method: A method which is declared with abstract keyword
Shape() //Abstract class constructor
{
	int a=10;
	System.out.println("abstract class constructor " +a);
}
public void m1() //Concrete method
{
	int b=20;
	System.out.println("Concrete method " +b);	
}
}
class Rectangle extends Shape{
	void draw() {
		String name = "QA";
		System.out.println("drawing rectangle" +name);
	
	}
}
class Circle1 extends Shape{
	void draw() {
		int noofstudents = 8;
		System.out.println("drawing circle" +noofstudents);
	}
}