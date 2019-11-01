/*
###10.14_面向对象(匿名内部类重写多个方法调用)
* A:案例演示
	* 匿名内部类的方法调用
*/
class Demo4_NoNameInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
		System.out.println("-------------分割线-------------");
	}
}
interface Inter {
	public void show1();
	public void show2();
}
class Outer {
	public void method() {
		new Inter() {		//new Inter() {}代表的是实现Inter接口的对象
			public void show1() {
				System.out.println("show1");
			}
			public void show2() {
				System.out.println("show2");
			}
		}.show1();		//对象.方法 调用
	}
}