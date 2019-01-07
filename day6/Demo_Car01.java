class Demo_Car01 {
	public static void main(String[] args) {
/*
	我要10辆red、8个车轱辘的车！
	怎么办？new 10个对象吗？emmmm...太麻烦了8！
*/
		Car c1 = new Car();
		c1.color = "red";
		c1.num = 8;
		c1.run();
		//抽取后：
		method(c1);

		Car c2 = new Car();
		c2.color = "red";
		c2.num = 8;
		c2.run();
		method(c2);

		System.out.println("-------------分割线-------------");
	}
		//emmm...new 10 次？？
		//所以要有（抽取方法提高代码的复用性）的觉悟啊！
		public static void method(Car c) {
			c.color = "red";
			c.num = 8;
			c.run();
		}		
}

class Car {
	String color;
	int num;
	public void run() {
		System.out.println(color + "......" + num);
	}
}