/*
������ĳ�Ա�ص㣺
1����Ա�������ȿ����Ǳ���Ҳ�����ǳ�����abstract�������γ�Ա������
2�����췽�����С�
3����Ա�������ȿ����ǳ����Ҳ�����Ƿǳ���ġ�
4���������Ա���������ԣ����󷽷�ǿ��Ҫ��������д�ſ���ʹ�ã�
						 �ǳ��󷽷�����̳и�����ߴ��븴���ԡ�
*/
class Demo7_Abstract {
	public static void main(String[] args) {
		//Animal a = new Animal();	//���󣺳����಻�ܱ�ʵ����
		Animal a = new Cat();
		a.eat();
	}
}
abstract class Animal {					//������
	//int num1 = 10;
	//final num2 = 20;
	abstract public void eat();
	public Animal() {
		System.out.println("����Ĺ��췽��");
	}
}
class Cat extends Animal {
	public Cat() {
		super();
	}
	public void eat() {
		System.out.println("è����");
	}
}

abstract class Demo {
	int num1 = 10;			//����
	final int num2 = 20;		//����

	public Demo() {}

	public void print(){
		System.out.println("111");
	}

	abstract public void print2();
}
class Test extends Demo {
	public void print2() {
		System.out.println("�̳в���д���෽��");
	}
}