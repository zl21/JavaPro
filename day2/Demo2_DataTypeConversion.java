class Demo2_DataTypeConversion {
	public static void main(String[] args) {
		/*
		//数据类型转换之隐式转换,自动向大的类型转换

		int x = 3;			//4byte
		byte b = 4;			//1byte

		x = x + b;
		System.out.println(x);
		*/

		//强制类型转换,向下强转可能会损失精度！

		int x = 3;
		byte b = 4;
		
	//	b = x + b; fatal：精度可能损失
		b = (byte)(x + b);
		System.out.println(b);
	}
}
