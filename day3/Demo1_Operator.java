class Demo1_Operator {
	public static void main(String[] args) {
		//�루&�����㣬ȫ��Ϊ�棬һ����٣�
		//��|�����㣬ȫ��Ϊ�٣�һ�����档
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.println(a < b & b < c);	//true
		System.out.println(a < b & b > c);	//false
		System.out.println(a > b & b < c);	//false
		System.out.println(a > b & b > c);	//false

		int x = 3;
		int y = 4;
		System.out.println((++x == 3) & (++y == 4));	//false
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
