package Returntype;

public class ex1 {
	public static void main(String[]args) {
		
		ex1 obj = new ex1();
		
		int exe = obj.m1(1, 2);
		int exa = obj.m2(4, 2);
		System.out.println("a+b="+exe+"\n"+"c/d="+exa);
		}
		public int m1(int a, int b) {
				return a+b;
			}
		public int m2(int c, int d) {
			return c/d;
		}

}
