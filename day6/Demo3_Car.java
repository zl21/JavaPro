class Demo3_Car {
	public static void main(String[] args) {
		Car c = new Car();
		c.color = "red";
		c.num = 4;
		System.out.print(c.color + c.num);

		c.run();
	}
}
class Car {
	String color;
	int num;
	public void run() {
		System.out.println("Εά");
	}
}
