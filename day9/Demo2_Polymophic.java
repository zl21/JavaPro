/*
��Ա���������뿴��ߣ�����Ҳ�����

*/
class Demo2_Polymophic {
	public static void main(String[] args) {
		Animal a = new Cat();		//��������ָ���������
		System.out.println(a.num);

		Cat c = new Cat();	
		System.out.println(c.num);
	}
}
class Animal {
	int num = 10;
}

class Cat extends Animal {
	int num = 20;
}
