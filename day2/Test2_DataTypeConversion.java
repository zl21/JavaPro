class Test2_DataTypeConversion {
	public static void main(String[] args) {
		//long �� float ˭��
		float f = 12.3f;
		long x = 12345;

		f = x;						//��ʽת��������ת���Զ�ת��˵�� float>long
		System.out.println(f);

		x = (long)f;				//ǿ��ת��
		System.out.println(x);
	}
}
