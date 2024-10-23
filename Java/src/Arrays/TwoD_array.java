package Arrays;

public class TwoD_array {
public static void main(String args[]) {
	TwoD obj = new TwoD();
	obj.m2();
//  obj.m3();
}
}
class TwoD{
	void m2() {
		int arr[][]= {{1,2},{3,4}};
		for (int i=0;i<2;i++) {
			for (int h=0;h<2;h++) {
				//System.out.println("arr[0][0]=" + arr[0][0]);
				//System.out.println("arr[0][1]=" + arr[0][1]);
				//System.out.println("arr[1][0]=" + arr[1][0]);
				//System.out.println("arr[1][1]=" + arr[1][1]);
	
		System.out.println("arr[" + i + "]["+ h + "]=" + arr[i][h]);
			}
		}
	}
}

