class Demo1_DataType {
	public static void main(String[] args) {
		//��������
		byte a = 10;		//1byte��-128 �� 127��
		int b = 20;			//4byte������Ĭ�ϣ�
		short s = 30;		//2byte
		long l = 40;		//8byte
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);

		//��������
		float f = 12.3F;		//4byte
		double d = 33.4;		//8byte��С��Ĭ��double��
		System.out.println(f);
		System.out.println(d);

		//�ַ�����
		char c = 'a';
		System.out.println(c);	//2byte

		//��������
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
	}
}
