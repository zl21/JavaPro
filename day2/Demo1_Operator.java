class Demo1_Operator {
	public static void main(String[] args) {
		int a = 3;
		//a++;
		//++a;
		int b1;
		int b2;
		b1 = a++;		//a在前，先使用，后加1
		//b2 = ++a;		//a在后，先加1，后使用
		System.out.println("a = " + a);
		System.out.println("b1 = " + b1);
		//System.out.println("b2 = " + b2);

	}
}
