/*
(this�ؼ��ֵĸ�����Ӧ��)
* A:this�ؼ����ص�
	* ����ǰ���������(��ǰ����ľֲ���������������ʱ�ľͽ�ԭ��) 
* B:������ʾ
	* this��Ӧ�ó���
	* �������ֳ�Ա�����;ֲ���������*/
class Demo_This {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("����");
		p1.setAge(23);
		System.out.println(p1.getName() + "..." + p1.getAge());
		System.out.println("-------------�ָ���-------------");
	}
}

class Person {
	private String name;
	private int age;

	public void setAge(int age) {		//��������
		if (age > 0 && age < 200) {
			this.age = age;
		}else {
			System.out.println("�������XXX��");
		}
	}
	public int getAge() {			//��ȡ����
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void speak() {
		System.out.println(name + "����" + age);
	}
}

