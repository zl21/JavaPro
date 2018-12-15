/*
class Demo1_If {
	public static void main(String[] args) {
		int age = 17;
		if (age >= 18) {
			System.out.println("可以报考驾驶证!");
		}else {
			System.out.println("您还未达到法定年龄！");
		}

		//Test_1：输出大的
		int a = 10;
		int b = 20;
		int max;
		if (a > b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println(max);

		//Test_2：判断奇偶性
		int x = 10;
		if (x % 2 == 0) {
			System.out.println(x + "是偶数！");
		}else {
			System.out.println(x + "是奇数！");		
		}
*/

		//Test_3：键盘录入一个成绩，判断并输出成绩的等级
import java.util.Scanner;
class Demo1_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的成绩：");
		int x = sc.nextInt();
			if(x >= 90 & x <= 100) {
			System.out.println("优秀！");
			}else if (x < 90) {
				System.out.println("垃圾！");
			}else {
				System.out.println("这怕是个假的成绩！");
				}
	}

}