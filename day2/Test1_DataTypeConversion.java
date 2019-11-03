class Test1_DataTypeConversion {
	public static void main(String[] args) {
		//面试题：以下程序是否有问题，如有请指出说明。
		
		byte b1 = 3;
		byte b2 = 4;
	//  byte b3 = b1 + b2;
	/*
	从两个方面：
	1、byte与byte（或short，char）进行运算时会先自动向上转型为int，int+int，结果必然为int；
	2、b1和b2是两个变量，变量存储的值是变化的，编译时无法判断里面的值是否超出byte类型的取值范围。
	*/
		byte b3 = (byte)(b1 + b2);
		byte b4 = 3 + 4;
		System.out.println(b3);
		System.out.println(b4);//java编译器有常量优化机制，自动判断其结果是否超出该数据类型取值范围。
	}
}
