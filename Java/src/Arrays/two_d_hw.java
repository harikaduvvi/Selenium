package Arrays;

public class two_d_hw{
public static void main(String[] args){
exe obj = new exe();
		obj.m1();
		}
	}
	class exe {
		void m1() {
			int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
			for (int i=0;i<3;i++) {
				for (int h=0;h<3;h++) {
			System.out.println("arr[" + i + "]["+ h + "]=" + arr[i][h]);
				}
				System.out.println();
			}
		}
	}
