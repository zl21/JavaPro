/*
*/
class Test3_Abstract {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		System.out.println("-------------∑÷∏Óœﬂ-------------");
	}
}
abstract class Animal {
	private String name;
	private int age;
	public Animal() {}
	public Animal(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setName() {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge() {
		this.age = age;	
	}
	public int getAge() {
		return age;
	}
	public abstract void eat();
}
class Cat extends Animal {
	public Cat() {}
	public Cat(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("√®≥‘”„");
	}
}