/*
1����������ָ�������Ա����ʱ��
		���뿴��ߣ����ࣩ������Ҳ�����
2����������ָ�������Ա����ʱ��
		���뿴��ߣ����ࣩ�����п��ұߣ����ࣩ����Ҳ�ж�̬�󶨣�
3����̬�ĳ�Ա����������أ��㲻����д����������ʱ������ߣ����ࣩ�ġ�
*/
class Demo3_Polymophic {
	public static void main(String[] args) {
		Father f = new Son();		//��������ָ���������
		System.out.println(f.num);	//��Ա����
		f.print();					//��Ա����������ʱ�������print������������ʱ�ߵ��������print������
		f.method();					//��̬��Ա����
		System.out.println("---------------------------");
		Son s = new Son();	
		System.out.println(s.num);
		s .print();
		s.method();
	}
}

class Father {
	int num = 10;
	public void print() {
		System.out.println("father");
	}
	public static void method() {
		System.out.println("Father static method");
	}
}

class Son extends Father  {
	int num = 20;
	public void print() {
		System.out.println("son");
	}
	public static void method() {
		System.out.println("Son static method");
	}
}
