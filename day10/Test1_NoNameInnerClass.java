/*
匿名内部类在开发中的应用
*/
class Test1_NoNameInnerClass {
	public static void main(String[] args) {
		//如何调用PersonDemo中的method()方法？
		PersonDemo pd = new PersonDemo();
		pd.method(new Student());	//Person p = new Student();父类引用指向子类对象
		//匿名内部类调用方法：
		pd.method(new Person() {
			public void show() {
				System.out.println("show匿名");
			}
		});
	}
}
//抽象类或接口
abstract class Person {
	public abstract void show();
}
class PersonDemo {
	public void method(Person p) {
		p.show();
	}
}
//非匿名内部类方法调用方法如下：
class Student extends Person {
	public void show() {
		System.out.println("show非匿名");
	}
}