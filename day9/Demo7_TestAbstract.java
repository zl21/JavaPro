class Demo7_TestAbstract {
	public static void main(String[] args) {
		B b = new B();
		b.e();
		System.out.println("-------------�ָ���-------------");
	}
}
abstract class A {
	public abstract void e();
}
class B extends A {
	public void e() {
		System.out.println("��������");
	}
}
class C extends A {
	public void e() {
		System.out.println("��а����");
	}
}
class D extends A {
	public void e() {
		System.out.println("��������");
	}
}