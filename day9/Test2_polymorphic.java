class Test2_polymorphic {
	public static void main(String[] args) {
		A a = new B();		//���������ָ���������
		a.show();			//���뿴��ߣ����п��ұߡ�������B�̳���A��show�����������������Լ���show2��������������ԡ���
		
		B b = new C();
		b.show();			//���뿴��ߣ����п��ұߡ������뿴A��show��������������ʱA��show������������C�Լ���show2��������������ɡ���
	}
}
class A {
	public void show() {
		show2();
	} 
	public void show2() {
		System.out.println("��");
	}
}
class B extends A {
	public void show2() {
		System.out.println("��");
	}
}
class C extends B {
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("��");
	}
}
