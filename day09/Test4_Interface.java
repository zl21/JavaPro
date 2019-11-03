class Test4_Interface {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.sleep();

		JumpCat jc = new JumpCat();
		jc.eat();
		jc.sleep();
		jc.jump();
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
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public abstract void eat();
	public abstract void sleep();
}
interface Jump {
	public abstract void jump();
}
class Cat extends Animal {
	public Cat() {}
	public Cat(String name,int age) {
		super(name,age);
	}
	public void eat() {
		System.out.println("³Ô·¹");
	}
	public void sleep() {
		System.out.println("Ë¯¾õ");
	}	 
}
class JumpCat extends Cat implements Jump {
	public JumpCat() {}
	public JumpCat(String name,int age) {
		super(name,age);
	}
	public void jump() {
		System.out.println("Ìø¸ßÃ¨");
	}
}