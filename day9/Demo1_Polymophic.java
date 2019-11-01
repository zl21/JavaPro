/*
多态：【polymorphic】概述：
	事物存在的多种形态
前提：
	a、要有继承关系；
	b、要有方法重写；
	c、要有父类引用指向子类对象。
*/
class Demo1_Polymophic {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();

		Animal a = new Cat();	//父类引用指向子类对象
		a.eat();
	}
}
class Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

class Cat extends Animal {
	public void eat() {			//eat()方法重写
		System.out.println("猫吃鱼");
	}
}
