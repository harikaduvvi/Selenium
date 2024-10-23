package Abstraction;

public class Abstract_hw {
	public static void main(String[] args)
	{
        classB b = new classB();
        classC c = new classC();
        b.normalMethod();
        c.abstractMethod();
        classA.staticMethod(int  c, int d);
    }
}
	
	abstract class classA {
	    void normalMethod(int a, String b)
	    Class A() {
	    abstract void abstractMethod(int a, int b);
	    static void staticMethod(int c, int d) 
	    }

	classB extends classA {
	    @Override
	    void abstractMethod(int a, int b) {
	        System.out.printl(a+ "\n" +b);
	    }
	}

	classC extends classA {
	    @Override
	    void abstractMethod(int c, int d) {
	    	 System.out.printl(c+ "\n" +b);
	    }
	    }


