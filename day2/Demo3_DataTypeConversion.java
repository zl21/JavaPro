class Demo3_DataTypeConversion {
	public static void main(String[] args) {

		//ASCII����У�a�ַ���Ӧint���͵�97��97 + 1 = 98
		System.out.println('a' + 1);

		//98��Ӧ��char��Ϊ��b
		System.out.println((char)('a' + 1));

		//�����Hello World!a1
		System.out.println("Hello World!" + 'a' + 1);

		//�����98Hello World!
		System.out.println('a' + 1 + "Hello World!");

		//�����5 + 5 = 55
		System.out.println("5 + 5 = " + 5 + 5);

		//�����5 + 5 = 10
		System.out.println("5 + 5 = " + (5 + 5));

	}
}
