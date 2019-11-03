class Demo4_DataTypeConversion {
	public static void main(String[] args) {
		//输出字符a
		char c = 'a';
		System.out.println(c);
		char c1 = 97;
		System.out.println(c1);

		char a = 3;
		char b = 4;
		char d = 5;
		char e = 6;
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);

		//char是否可以存储中文？
		char c2 = '中';
		System.out.println(c2);
		//可以，因为一个中文字符与char类型都是占2type。（单引号内只能放一个字符）

	}
}
