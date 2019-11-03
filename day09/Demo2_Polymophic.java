/*
成员变量：编译看左边，运行也看左边

*/
class Demo2_Polymophic {
	public static void main(String[] args) {
		Animal a = new Cat();		//父类引用指向子类对象
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
