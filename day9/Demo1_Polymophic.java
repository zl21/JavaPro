/*
��̬����polymorphic��������
	������ڵĶ�����̬
ǰ�᣺
	a��Ҫ�м̳й�ϵ��
	b��Ҫ�з�����д��
	c��Ҫ�и�������ָ���������
*/
class Demo1_Polymophic {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();

		Animal a = new Cat();	//��������ָ���������
		a.eat();
	}
}
class Animal {
	public void eat() {
		System.out.println("è����");
	}
}

class Cat extends Animal {
	public void eat() {			//eat()������д
		System.out.println("è����");
	}
}
