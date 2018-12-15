/*
	* a:导包
			* 格式： import java.util.Scanner; 
			* 位置： 在class上面。
	* b:创建键盘录入对象
		* 格式： Scanner sc = new Scanner(System.in);
	* c:通过对象获取数据	
		* 格式： int x = sc.nextInt();		
*/
import java.util.Scanner;
class Demo4_Operator {	//键盘录入
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	//创建键盘录入对象
		System.out.println("请输入一个整数：");
		int x = sc.nextInt();
		System.out.println(x);

		//Text_1:录入两个整数
		System.out.println("请输入第二个整数：");
		int y = sc.nextInt();
		System.out.println(y);

		//Test_2:键入两个数求和并输出
		int sum = x + y;
		System.out.println("x + y = " + sum);

		//获取两个数中的最大值
		int max = (x > y) ? x : y;
		System.out.println("max = " + max);

	}
}
