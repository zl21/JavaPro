/*
###10.08_面向对象(内部类概述和访问特点)(了解)
* A:内部类概述
* B:内部类访问特点
	* a:内部类可以直接访问外部类的成员，包括私有。
	* b:外部类要访问内部类的成员，必须创建对象。
	* 外部类名.内部类名 对象名 = 外部类对象.内部类对象;
* C:案例演示
	* 内部类极其访问特点
*/
class Demo2_InnerClass {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();		//创建内部类对象
		oi.method();
		
		System.out.println("-------------分割线-------------");
	}
}
class Outer {
	private int num = 10;
	class Inner {
		public void method() {
			System.out.println(num + "......khzsgjozdjgdsdhdxhxh");
		}
	}
}