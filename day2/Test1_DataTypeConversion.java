class Test1_DataTypeConversion {
	public static void main(String[] args) {
		//�����⣺���³����Ƿ������⣬������ָ��˵����
		
		byte b1 = 3;
		byte b2 = 4;
	//  byte b3 = b1 + b2;
	/*
	���������棺
	1��byte��byte����short��char����������ʱ�����Զ�����ת��Ϊint��int+int�������ȻΪint��
	2��b1��b2�����������������洢��ֵ�Ǳ仯�ģ�����ʱ�޷��ж������ֵ�Ƿ񳬳�byte���͵�ȡֵ��Χ��
	*/
		byte b3 = (byte)(b1 + b2);
		byte b4 = 3 + 4;
		System.out.println(b3);
		System.out.println(b4);//java�������г����Ż����ƣ��Զ��ж������Ƿ񳬳�����������ȡֵ��Χ��
	}
}
