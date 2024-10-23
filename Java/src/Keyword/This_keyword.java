package Keyword;

public class This_keyword {
		public static void main(String[]args) {
		ex1 obj= new ex1(01,"Aadhya");
		obj.m1();	
		}
	}
	class ex1{
		int a;
		String s;
		ex1(int a, String s){
			this.a=a;
			this.s=s;
		}
		void m1() {
			System.out.println(a+"="+s);
		}
	}

