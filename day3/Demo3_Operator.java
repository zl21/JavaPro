class Demo3_Operator {		//��Ԫ�����
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		int z = (x > y) ? x : y;
		// x ���� y ô�����ڵĻ��ͽ� x ���� z ,��֮�� y ���� z ��
		System.out.println("z = " + z);

		//Test_1���Ƚ����������Ƿ���ͬ
		int a = 10;
		int b = 5;
		//boolean c = (a == b) ? true : false;
		boolean c = (a == b);
		System.out.println("b = " + c);

		//Test_2����ȡ�������е����ֵ
		int d = 10;
		int e = 20;
		int f = 30;
		
		int temp = (d > e) ? d : e;
		int max = (temp > f) ? temp : f;
		
		System.out.println("max = " + max);


	}
}
