class Demo2_DataTypeConversion {
	public static void main(String[] args) {
		/*
		//��������ת��֮��ʽת��,�Զ���������ת��

		int x = 3;			//4byte
		byte b = 4;			//1byte

		x = x + b;
		System.out.println(x);
		*/

		//ǿ������ת��,����ǿת���ܻ���ʧ���ȣ�

		int x = 3;
		byte b = 4;
		
	//	b = x + b; fatal�����ȿ�����ʧ
		b = (byte)(x + b);
		System.out.println(b);
	}
}
