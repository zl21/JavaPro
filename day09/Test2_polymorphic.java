class Test2_polymorphic {
	public static void main(String[] args) {
		A a = new B();		//父类的引用指向子类对象
		a.show();			//编译看左边，运行看右边。（运行B继承了A的show（）方法调用子类自己的show2（）方法输出“自”）
		
		B b = new C();
		b.show();			//编译看左边，运行看右边。（编译看A的show（）方法，运行时A的show（）方法调用C自己的show2（）方法输出“律”）
	}
}
class A {
	public void show() {
		show2();
	} 
	public void show2() {
		System.out.println("我");
	}
}
class B extends A {
	public void show2() {
		System.out.println("自");
	}
}
class C extends B {
	public void show() {
		super.show();
	}
	public void show2() {
		System.out.println("律");
	}
}
