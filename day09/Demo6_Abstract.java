/*
������֪��������ôʵ��һ����������ʱ���ó����������������������һ�������֪����ʲô���������޷��������Ҫ�ó���
1���������в�һ���г��󷽷��������г��󷽷�����һ���ǳ���������ǽӿڣ�
2�������಻��ֱ��ʵ������Ҫ���ն�̬�ķ�ʽ�ɾ��������ʵ������
3������������࣬Ҫô�ǳ����࣬Ҫô�������������еĳ��󷽷���д�ɷǳ��󷽷���
*/
class Demo6_Abstract {
	public static void main(String[] args) {
		//Animal a = new Animal();	//���󣺳����಻�ܱ�ʵ����
		Animal a = new Cat();
		a.eat();
	}
}
abstract class Animal {					//������
	public abstract void eat();			//���󷽷�
}
class Cat extends Animal {
	public void eat() {
		System.out.println("è����");
	}
}