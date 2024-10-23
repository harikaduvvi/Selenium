package Polymorphism;

public class Method_Overriding {
public static void main(String[]args){
B obj = new B();
obj.m1(10);
obj.m2(10);
}
}
class A{
void m1(int a) {
a=100;
System.out.println("overridden method "+a);}  // Overridden method :
		 
void m2(int b) {
b=15;
System.out.println("overridden method "+b);}
}
class B extends A {
void m1(int a) {
a=20;
System.out.println("override method "+a);
}
void m2(int b) {
//		    b=20;
System.out.println("override method "+b);}
}

