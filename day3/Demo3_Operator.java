class Demo3_Operator {		//三元运算符
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int z = (x > y) ? x : y;
		// x 大于 y 么？大于的话就将 x 赋给 z ,反之则将 y 赋给 z 。
		System.out.println("z = " + z);

		//Test_1：比较两个整数是否相同
		int a = 10;
		int b = 5;
		//boolean c = (a == b) ? true : false;
		boolean c = (a == b);
		System.out.println("b = " + c);

		//Test_2：获取三个数中的最大值
		int d = 10;
		int e = 20;
		int f = 30;
		
		int temp = (d > e) ? d : e;
		int max = (temp > f) ? temp : f;
		
		System.out.println("max = " + max);


	}
}
