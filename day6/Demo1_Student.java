/*
object-oriented
�������ķ�װ���á��̳С���̬��
��Ա���������ԣ�����Ա��������Ϊ����
���������ʵ����
�����ࣺ�������������з����⣻������Ҫstatic

* A:�ļ�������
	* ��һ��java�ļ���һ���������ࣺһ���������࣬һ�������ࡣ
	* ���飺�ļ����ƺͲ����ࣨmain����������һ�¡�*/
class Demo1_Student {
	public static void main(String[] args) {
		/*
		* ��������ʹ��
		* ��ʽ������ ������ = new ����();*/
		Student s = new Student();

		/*
		* ���ʹ�ó�Ա������?
		* ������.������*/
		s.name = "С��";
		s.age = 18;
		System.out.println(s.name + "����" + s.age + "�ꡣ");

		/*
		* ���ʹ�ó�Ա������?
		* ������.������(...)*/
		s.learn();
		s.sleep();
	}
}

class Student {
	String name;
	int age;
	String gender;

	public void learn() {
		System.out.println("ѧϰ");
	}
	public void sleep() {
		System.out.println("˯��");
	}

}