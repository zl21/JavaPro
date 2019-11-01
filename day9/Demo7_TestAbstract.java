class Demo7_TestAbstract {
	public static void main(String[] args) {
		B b = new B();
		b.e();
		System.out.println("-------------分割线-------------");
	}
}
abstract class A {
	public abstract void e();
}
class B extends A {
	public void e() {
		System.out.println("葵花宝典");
	}
}
class C extends A {
	public void e() {
		System.out.println("辟邪剑谱");
	}
}
class D extends A {
	public void e() {
		System.out.println("东方不败");
	}
}