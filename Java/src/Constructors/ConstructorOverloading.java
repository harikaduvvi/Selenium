package Constructors;

public class ConstructorOverloading {
// constructor with one argument
	ConstructorOverloading(String name){
		System.out.println("Constructor with one "
		+ "argument- String:" + name);
	}
	//constructor with two arguments
		ConstructorOverloading (String name, int age){
		System.out . println("Constructor with two arguments + String and Integer :"+ name + " " + age);
		}
		// Constructor with one argument but with different type than previous.
		ConstructorOverloading(long id){
		System.out.println("Constructor with one argument : " +"Long : "+id);
	}
public static void main(String[] args) {
	//Creating the objects of the class named 'ConstructorOverloading' by passing different
	//Invoke the constructor with two arguments
	ConstructorOverloading overload1 = new ConstructorOverloading("Harika");
	//Invoke the constructor with two arguments
	ConstructorOverloading overload2 = new ConstructorOverloading("Jayanth", 27);
	//Invoke the constructor with one argument of type 'Long'
	ConstructorOverloading overload3 = new ConstructorOverloading(678954321);
}
}