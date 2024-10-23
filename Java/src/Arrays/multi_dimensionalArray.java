package Arrays;

public class multi_dimensionalArray {
public static void main(String[] args) {
	ex obj = new ex();
	obj.m1();
	obj.m2();
}
}
class ex{
	void m1() {
		int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
		for (int i=0; i<2;i++) {
			for (int j=0;j<2;j++) {
				for (int k=0;k<2;k++) {
					// System.out.println(arr[i][j][k] + " ");
					System.out.println("\n"+"arr["+i+"]["+j+"]["+k+"]="+arr[i][j][k]);
					
				}
			
		}
	}
}
void m2() {
	int[][][] arr = {{{1,2},{3,4}},{{5,6},{7,8}}};
	for (int i=0; i<2;i++) {
		for (int j=0;j<2;j++) {
			for (int k=0;k<2;k++) {
				// System.out.println(arr[i][j][k] + " ");
				System.out.println("\n"+"arr["+i+"]["+j+"]["+k+"]="+arr[i][j][k]);
			}
				System.out.println();
			}
			System.out.println();
	}
}
}