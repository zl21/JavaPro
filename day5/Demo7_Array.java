/*
���
*/
import java.util.Scanner;
class Demo7_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ����:");
		int week = sc.nextInt();
		System.out.println("����������" + getWeek(week));
	}

	/*�����������ض�Ӧ�����ڵķ���:
	1������ֵ����char
	2�������б�int week
	*/
	public static char getWeek(int week) {
		char[] arr = {' ','һ','��','��','��','��','��','��',};		//������һ�����ڱ�
		return arr[week];
	}
}
