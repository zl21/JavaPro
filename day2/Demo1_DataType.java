class Demo1_DataType {
	public static void main(String[] args) {
		//整数类型
		byte a = 10;		//1byte（-128 到 127）
		int b = 20;			//4byte（整数默认）
		short s = 30;		//2byte
		long l = 40;		//8byte
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);

		//浮点类型
		float f = 12.3F;		//4byte
		double d = 33.4;		//8byte（小数默认double）
		System.out.println(f);
		System.out.println(d);

		//字符类型
		char c = 'a';
		System.out.println(c);	//2byte

		//布尔类型
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	}
}
