/*
(��������ʽ������������ʱ����ε���)
* A:�����Ĳ���������public void print(Student s){}//print(new Student());
	* ����㿴����һ����������ʽ������һ��������(��������)��������ʵ��Ҫ���Ǹ���Ķ���
*/

//������
class Demo_Stu {
	public static void main(String[] args) {
		print(10);	//���ô˷���ʱ��10���൱�ڸ�����print�еľֲ�����x����ֵ��

		Student s = new Student();	//newһ�£��ڶ����洴��һ�����󣬲�����ֵַ��ֵ��S
		print(s);	//��s�ĵ�ֵַ�ָ�ֵ����print�����е� x .

	}

	public static void print(int x) {	//�����������͵�����ʽ����
		System.out.println(x);
	}//����������void�����õ�ʱ������������ã�Ҳ�����÷��ص��ã�ֻ��ֱ�ӵ���x��

	//��һ���������Ͳ�ͬ�ķ�������
	public static void print(Student x) {	//�����������͵�����ʽ������������Student�ࣩ,�������������Խ�x����Ϊ��ͬ������ľֲ������ǲ����໥���ʵġ�
		x.name = "XiaoMing";
		x.age = 23;
		x.speak();
	}//���õ�ʱ����Ҫ����һ����ֵַ��newһ�£���
}
class Student {
	String name;
	int age;

	public void speak() {
		System.out.println("˵�����" + name + "����" + age);

	}
}