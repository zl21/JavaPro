/*
###10.14_�������(�����ڲ�����д�����������)
* A:������ʾ
	* �����ڲ���ķ�������
*/
class Demo4_NoNameInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
		System.out.println("-------------�ָ���-------------");
	}
}
interface Inter {
	public void show1();
	public void show2();
}
class Outer {
	public void method() {
		new Inter() {		//new Inter() {}�������ʵ��Inter�ӿڵĶ���
			public void show1() {
				System.out.println("show1");
			}
			public void show2() {
				System.out.println("show2");
			}
		}.show1();		//����.���� ����
	}
}