/*
�����ڲ����ڿ����е�Ӧ��
*/
class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		//��ε���PersonDemo�е�method()������
		PersonDemo pd = new PersonDemo();
		pd.method(new Student());	//Person p = new Student();��������ָ���������
		//�����ڲ�����÷�����
		pd.method(new Person() {
			public void show() {
				System.out.println("show����");
			}
		});
	}
}
//�������ӿ�
abstract class Person {
	public abstract void show();
}
class PersonDemo {
	public void method(Person p) {
		p.show();
	}
}
//�������ڲ��෽�����÷������£�
class Student extends Person {
	public void show() {
		System.out.println("show������");
	}
}