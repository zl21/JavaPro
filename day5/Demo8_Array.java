/*
����Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
*/
import java.util.Scanner;
class Demo8_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����:");
		int value = sc.nextInt();
		int[] arr1 = {1,2,3,4,5,6,7,8,9,10};
		int index = getIndex(arr1,value);
		System.out.println(value + "���ڵ�Index��" + index);
	}

	/*Ԫ�ز��ҵķ���:
	1������ֵ����int
	2�������б�int[] arr,int[] value
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
