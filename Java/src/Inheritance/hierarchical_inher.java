package Inheritance;

public class hierarchical_inher { // when two or more classes inherits a single class

public static void main(String[] args) {
 Father obj = new Father();
 obj.m1();
 obj.m2();
 
 son obj1 = new son();
 obj1.m1();
 obj1.m3();
}
}
class GrandPaa {
public void m1() {
System.out.println("GrandPaa");
}
}
class Father extends GrandPaa {
public void m2() {
System.out.println("Father");
}
}
class son extends GrandPaa{
	public void m3() {
System.out.println("child");		
}
}


