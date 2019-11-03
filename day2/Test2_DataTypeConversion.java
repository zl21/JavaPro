class Test2_DataTypeConversion {
	public static void main(String[] args) {
		//long 和 float 谁大？
		float f = 12.3f;
		long x = 12345;

		f = x;						//隐式转换，向上转型自动转，说明 float>long
		System.out.println(f);

		x = (long)f;				//强制转换
		System.out.println(x);
	}
}
