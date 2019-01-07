/*
(匿名对象的概述和应用)
* A:什么是匿名对象
	* 没有名字的对象 
* B:匿名对象应用场景
	* a:调用方法，仅仅只调用一次的时候。
		* 那么，这种匿名调用有什么好处吗?
			* 节省代码 
		* 注意：调用多次的时候，不适合。匿名对象调用完毕就是垃圾。可以被垃圾回收器回收。
*/
class Demo_Car {
	public static void main(String[] args) {
		Car c1 = new Car();		//创建有名字的对象
		c1.run();
		c1.run();

		new Car().run();		//创建匿名对象
		new Car().run();		//匿名对象只适合对方法的一次调用，因为调用多次会在堆里面创建多个对象，不如用有名字的对象；
		System.out.println("-------------分割线-------------");

/*
	匿名对象可以调用属性并赋值呢？有什么意义？
	答：可以调用，但毫无意义，因为没有实例来接收new出来的对象的地址值，所以new完对象赋了值之后就变成垃圾了。
	例如以下实例，编译运行结果将会输出：null......0
*/			
		new Car().color = "red";
		new Car().num = 8;
		new Car().run();
	}
}
class Car {
	String color;
	int num;
	public void run() {
		System.out.println(color + "......" + num);
	}
}
