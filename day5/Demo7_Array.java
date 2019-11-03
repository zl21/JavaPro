/*
查表法
*/
import java.util.Scanner;
class Demo7_Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数:");
		int week = sc.nextInt();
		System.out.println("今天是星期" + getWeek(week));
	}

	/*根据索引返回对应的星期的方法:
	1、返回值类型char
	2、参数列表int week
	*/
	public static char getWeek(int week) {
		char[] arr = {' ','一','二','三','四','五','六','日',};		//定义了一张星期表
		return arr[week];
	}
}
