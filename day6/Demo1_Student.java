/*
object-oriented
面向对象的封装复用、继承、多态。
成员变量（属性）、成员方法（行为）。
对象是类的实例。
定义类：变量定义在类中方法外；方法不要static

* A:文件名问题
	* 在一个java文件中一般有两个类：一个基本的类，一个测试类。
	* 建议：文件名称和测试类（main方法）名称一致。*/
class Demo1_Student {
	public static void main(String[] args) {
		/*
		* 创建对象并使用
		* 格式：类名 对象名 = new 类名();*/
		Student s = new Student();

		/*
		* 如何使用成员变量呢?
		* 对象名.变量名*/
		s.name = "小周";
		s.age = 18;
		System.out.println(s.name + "今年" + s.age + "岁。");

		/*
		* 如何使用成员方法呢?
		* 对象名.方法名(...)*/
		s.learn();
		s.sleep();
	}
}

class Student {
	String name;
	int age;
	String gender;

	public void learn() {
		System.out.println("学习");
	}
	public void sleep() {
		System.out.println("睡觉");
	}

}