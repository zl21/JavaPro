/*
�������������Զ�����������ǿ������ת����
		int i = 10;
		byte b = 20;
		i = b;					//�Զ���������
		b = (byte)i;			//ǿ������ת��

�����������͡�����
*/
class Demo4_Polymophic {
	public static void main(String[] args) {		
		Father f = new Son();		//��������ָ��������󣨼�������Ϊ����� ������������ �Զ�����������
		System.out.println(f.num);	//��Ա����
		f.print();					//��Ա����
		Son s = (Son)f;				//ǿ�ƽ� �����f���� ת��Ϊ �������s
		s.method();
		System.out.println("---------------------------");
	}
}
class Father {
	int num = 10;
	public void print() {
		System.out.println("father");
	}
}
class Son extends Father  {
	int num = 20;
	public void print() {
		System.out.println("son");
	}
	public static void method() {
		System.out.println("Son method");
	}
}
