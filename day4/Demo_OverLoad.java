/*
重载：方法名相同，参数列表不同，与返回值类型无关
eg:求两个数的和与求三个数的和，方法名都叫add，只是相加的个数不一样而已
重载的分类：
	1、参数个数不同
	2、参数类型不同
*/
class Demo_OverLoad {
	public static void main(String[] args) {
/*
		int sum1 = add(10,20);
		System.out.println(sum1);

		int sum2 = add(10,20,30);
		System.out.println(sum2);
	}
	public static int add(int a,int b) {
		return a + b;
	}
	public static int add(int a,int b,int c) {
		return a + b + c;
	}
*/
		boolean a = isEqual(2,2);
		System.out.println(a);

		boolean b = isEqual(2.0,2.0);
		System.out.println(b);
	}
//分别比较两个int类型的和两个double类型的是否相等
	public static boolean isEqual(int a,int b) {
		return a == b;
	}
	public static boolean isEqual(double a,double b) {
		return a == b;
	}
}
