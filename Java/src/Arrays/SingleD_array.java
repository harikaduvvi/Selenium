package Arrays;

public class SingleD_array {
 public static void main(String args[]) {
 SingleD obj = new SingleD();
 obj.m1();
}
}
class SingleD{ //1D array
	void m1() {
		String a[]= {"Duvvi", "Harika", "Yadav"};
for (int i=0; i<3; i++)	{
	System.out.println(a[i]);
}
	}
}