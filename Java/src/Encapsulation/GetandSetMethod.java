package Encapsulation;

class Person{
	private String name; //private = restricted access
	//Getter
	public String getName() {
		return name;
	}
	//Setter
	public void setName(String newName) {
		this.name = newName;
	}
}
public class GetandSetMethod {
	
	public static void main(String[] args) {
	Person myObj = new Person();
	myObj.name = "Hary"; //Error: Name has private access in Person
	System.out.println(myObj.name); //Error: Name has private access in person
	}
}
