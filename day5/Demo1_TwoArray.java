/*
二维数组的求和
*/
import java.util.Scanner;
class Demo1_TwoArray {
	public static void main (String[] args) {
		int[][] arr2 ={{6,7,8},{9,10,11},{1,2}};
		System.out.println(sumA(arr2));
	}

	/*数组遍历求和的方法:
	1、返回值类型int
	2、参数列表int[] arr
	*/
	public static int sumA(int[][] arr) {
		int sum = 0;
		for (int i = 0;i < arr.length ;i++ ) {	//获取到每个二维数组中的一位数组
			for (int j = 0;j < arr[i].length ;j++ ) {
				sum = sum + arr[i][j];
			}
			return sum;
		}
		return 0;
	}
}
