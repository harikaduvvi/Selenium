package Returntype;

public class datatype {
	public static void main(String[] args)
	{
	string obj = new string();
	obj.m1();
	float ex= obj.m2(0.11f,0.22f);
	System.out.println("a+b="+ex);	
	
	}
}
class string {
	 void m1()
	{
		System.out.println("Print");
	}
	float m2(float a, float b)
	{
		return a+b;
	}
}

