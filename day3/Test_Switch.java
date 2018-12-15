import java.util.Scanner;
class Test_Switch {
	public static void main(String[] args) {
		//Test_1：输出对应星期几
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int week = sc.nextInt();
		switch (week) {
		case 1:
			System.out.println("Monday");
		break;
		case 2:
			System.out.println("Tuesday");
		break;
		case 3:
			System.out.println("Wednesday");
		break;
		case 4:
			System.out.println("Thursday");
		break;
		case 5:
			System.out.println("Friday");
		break;
		case 6:
			System.out.println("Saturday");
		break;
		case 7:
			System.out.println("Sunday");
		break;
		default:
			System.out.println("sorry!");
		break;
		}
	}
}
