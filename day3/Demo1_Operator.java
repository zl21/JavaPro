class Demo1_Operator {
	public static void main(String[] args) {
		//与（&）运算，全真为真，一假则假；
		//或（|）运算，全假为假，一真则真。
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b & b < c);	//true
		System.out.println(a < b & b > c);	//false
		System.out.println(a > b & b < c);	//false
		System.out.println(a > b & b > c);	//false

		int x = 3;
		int y = 4;
		System.out.println((++x == 3) & (++y == 4));	//false
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
