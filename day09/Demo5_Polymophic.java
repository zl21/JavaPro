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
		System.out.println("√®≥‘”„");
	}
}

class Cat extends Animal {
	public void eat() {			//eat()∑Ω∑®÷ÿ–¥
		System.out.println("√®≥‘”„");
	}
}

class Dog extends Animal {
	public void eat() {
		System.out.println("π∑≥‘»‚");
	}
	public void lookHome() {
		System.out.println("π∑ø¥º“");
	}
}
