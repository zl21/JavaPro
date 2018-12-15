		/*
		方法的格式: 
		修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
			方法体语句;
			return 返回值; 
		} 
	方法的格式说明:
	* 修饰符：目前就用 public static。后面我们再详细的讲解其他的修饰符。
	* 返回值类型：就是功能结果的数据类型。
	* 方法名：符合命名规则即可。方便我们的调用。
	* 参数：
		* 实际参数：就是实际参与运算的。
		* 形式参数；就是方法定义上的，用于接收实际参数的。
	* 参数类型：就是参数的数据类型
	* 参数名：就是变量名
	* 方法体语句：就是完成功能的代码。
	* return：结束方法的。
	* 返回值：就是功能的结果，由return带给调用者。
		*/
		
import java.util.Scanner;
class Demo_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入行数:");
		int row = sc.nextInt();
		System.out.println("请输入列数:");
		int column = sc.nextInt();
		outPut(row,column);


		/*
		System.out.println("请输入a:");
		int a = sc.nextInt();
		System.out.println("请输入b:");
		int b = sc.nextInt();
		//int max = getMax(a,b); 
		//boolean p = isEqual(a,b);
		System.out.println(p);
		*/
	}
		//Test_1:返回较大值
		public static int getMax(int x,int y) {
			return x > y ? x : y ;
		}
		//Test_2:判断两个数是否相等
		public static boolean isEqual(int x,int y) {
			return x == y;
		}
		//输出键盘录入的星形
		/*1、明确返回值类型；2、明确参数列表。*/
		public static void outPut(int x,int y) {
			for (int i = 1;i <= x ;i++ ) {
				for (int j = 1;j <= y ;j++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
			return ;							//返回值类型为void，return可省略。
		}
}
