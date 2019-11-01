/*
抽象类的成员特点：
1、成员变量：既可以是变量也可以是常量。abstract不能修饰成员变量。
2、构造方法：有。
3、成员方法：既可以是抽象的也可以是非抽象的。
4、抽象类成员方法的特性：抽象方法强制要求子类重写才可以使用；
						 非抽象方法子类继承父类提高代码复用性。
*/
class Demo7_Abstract {
	public static void main(String[] args) {
		//Animal a = new Animal();	//错误：抽象类不能被实例化
		Animal a = new Cat();
		a.eat();
	}
}
abstract class Animal {					//抽象类
	//int num1 = 10;
	//final num2 = 20;
	abstract public void eat();
	public Animal() {
		System.out.println("父类的构造方法");
	}
}
class Cat extends Animal {
	public Cat() {
		super();
	}
	public void eat() {
		System.out.println("猫吃鱼");
	}
}

abstract class Demo {
	int num1 = 10;			//变量
	final int num2 = 20;		//常量

	public Demo() {}

	public void print(){
		System.out.println("111");
	}

	abstract public void print2();
}
class Test extends Demo {
	public void print2() {
		System.out.println("继承并重写父类方法");
	}
}