class Demo3_DataTypeConversion {
	public static void main(String[] args) {

		//ASCII码表中，a字符对应int类型的97。97 + 1 = 98
		System.out.println('a' + 1);

		//98对应的char型为：b
		System.out.println((char)('a' + 1));

		//输出：Hello World!a1
		System.out.println("Hello World!" + 'a' + 1);

		//输出：98Hello World!
		System.out.println('a' + 1 + "Hello World!");

		//输出：5 + 5 = 55
		System.out.println("5 + 5 = " + 5 + 5);

		//输出：5 + 5 = 10
		System.out.println("5 + 5 = " + (5 + 5));

	}
}
