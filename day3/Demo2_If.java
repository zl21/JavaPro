class Demo2_If {
	public static void main(String[] args) {
		//if 语句的嵌套
		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b) {
			if (a > c) {
				System.out.println(a + "是最大的！");
			}else {
				System.out.println(c + "是最大的！");
			}
		}else {	//b >= a
			if (b > c) {
				System.out.println(b + "是最大的！");
			}else {
				System.out.println(c + "是最大的！");
			}
		}
	}
}
