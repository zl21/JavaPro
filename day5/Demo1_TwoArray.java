/*
��ά��������
*/
import java.util.Scanner;
class Demo1_TwoArray {
	public static void main (String[] args) {
		int[][] arr2 ={{6,7,8},{9,10,11},{1,2}};
		System.out.println(sumA(arr2));
	}

	/*���������͵ķ���:
	1������ֵ����int
	2�������б�int[] arr
	*/
	public static int sumA(int[][] arr) {
		int sum = 0;
		for (int i = 0;i < arr.length ;i++ ) {	//��ȡ��ÿ����ά�����е�һλ����
			for (int j = 0;j < arr[i].length ;j++ ) {
				sum = sum + arr[i][j];
			}
			return sum;
		}
		return 0;
	}
}
