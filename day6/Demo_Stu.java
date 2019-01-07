/*
(方法的形式参数是类名的时候如何调用)
* A:方法的参数是类名public void print(Student s){}//print(new Student());
	* 如果你看到了一个方法的形式参数是一个类类型(引用类型)，这里其实需要的是该类的对象。
*/

//测试类
class Demo_Stu {
	public static void main(String[] args) {
		print(10);	//调用此方法时，10就相当于给方法print中的局部变量x赋了值。

		Student s = new Student();	//new一下，在堆里面创建一个对象，并将地址值赋值给S
		print(s);	//把s的地址值又赋值给了print方法中的 x .

	}

	public static void print(int x) {	//基本数据类型当做形式参数
		System.out.println(x);
	}//返回类型是void，调用的时不能用输出调用，也不能用返回调用，只能直接调用x。

	//来一个引用类型不同的方法重载
	public static void print(Student x) {	//引用数据类型当做形式参数（引用了Student类）,两个参数都可以叫x，因为不同方法间的局部变量是不能相互访问的。
		x.name = "XiaoMing";
		x.age = 23;
		x.speak();
	}//调用的时候先要给它一个地址值（new一下），
}
class Student {
	String name;
	int age;

	public void speak() {
		System.out.println("说出你的" + name + "年龄" + age);

	}
}