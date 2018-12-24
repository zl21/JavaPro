/*
数组元素查找(查找指定元素第一次在数组中出现的索引)
*/
import java.util.Scanner;
class Demo8_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int value = sc.nextInt();
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int index = getIndex(arr1,value);
		System.out.println(value + "所在的Index是" + index);
	}

	/*元素查找的方法:
	1、返回值类型int
	2、参数列表int[] arr,int[] value
	*/
	public static int getIndex(int[] arr,int value ) {
		for (int i = 0;i < arr.length ;i++ ) {
			if (arr[i] == value) {
				return i;
			}
		}
		return -1;
	}
}
