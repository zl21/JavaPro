/*
（当不知道具体怎么实现一个方法或类时就用抽象来描述，比如叫你描述一个动物，不知道是什么动物所以无法描述因此要用抽象）
1、抽象类中不一定有抽象方法，但含有抽象方法的类一定是抽象类或者是接口；
2、抽象类不能直接实例化，要按照多态的方式由具体的子类实例化。
3、抽象类的子类，要么是抽象类，要么将抽象类中所有的抽象方法重写成非抽象方法。
*/
class Demo6_Abstract {
	public static void main(String[] args) {
		//Animal a = new Animal();	//错误：抽象类不能被实例化
		Animal a = new Cat();
		a.eat();
	}
}
abstract class Animal {					//抽象类
	public abstract void eat();			//抽象方法
}
class Cat extends Animal {
	public void eat() {
		System.out.println("猫吃鱼");
	}
}