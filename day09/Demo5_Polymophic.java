/*

*/
class Demo5_Polymophic {
	public static void main(String[] args) {
		method(new Cat());
		method(new Dog());
	}
	public static void method(Animal a) {
		a.eat();
	}
}
class Animal {
	public void eat() {
		System.out.println("è����");
	}
}

class Cat extends Animal {
	public void eat() {			//eat()������д
		System.out.println("è����");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("������");
	}
	public void lookHome() {
		System.out.println("������");
	}
}
