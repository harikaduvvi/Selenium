package Access_modifiers;

public class access_mod {
public static void main(String[] args) {
	em obj1 = new em();
	// obj1.em1(); //private
	obj1.em2(); //public
	obj1.em3(); //default
	obj1.em4(); //protected
	
}
}
class em{
	private void em1() //private access modifier: it can access methods and member functions
	{
		System.out.println("private method");
		
	}
	public void em2() //public access modifier: it can access methods and member functions
	{
		System.out.println("public method");
}
	void em3() //default access modifier: if we not specofy any access modifier for a class or method or data member
	{
		System.out.println("default method");
}
	protected void em4() //protected access modifier: it can access methods and member functions
	{
		System.out.println("protected method");
	}
}
