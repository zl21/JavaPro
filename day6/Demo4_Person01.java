/*
(private�ؼ��ֵĸ������ص�)
* A:���ำֵ���������
* B:private�ؼ����ص�
	* a:��һ��Ȩ�����η�
	* b:�������γ�Ա�����ͳ�Ա����
	* c:�������εĳ�Աֻ���ڱ����б�����
* ��װ��private��Ӧ�ã�
	* A:�ѳ�Ա������private����
	* B:�ṩ��Ӧ��getXxx()��setXxx()����
	* private�����Ƿ�װ��һ��������ʽ,����˵��װ����˽��
*/
	
class Demo4_Person01 {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "����";
		//p.age = 23;
		//p.speak();
		p1.setAge(-23);

		System.out.println(p1.name + p1.getAge());

		System.out.println("-------------�ָ���-------------");
	}
}

class Person {
	String name;
	private int age;

	public void setAge(int a) {		//��������
		if (a > 0 && a < 200) {
			age = a;
		}else {
			System.out.println("�������XXX��");
		}
	}

	public int getAge() {			//��ȡ����
		return age;
	}

	public void speak() {
		System.out.println(name + "����" + age);
	}
}
