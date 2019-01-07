/*
object-oriented
面向对象的封装复用、继承、多态。
成员变量（属性）、成员方法（行为）。
对象是类的实例。
定义类：变量定义在类中和方法外；方法不要static
*/
class Demo2_Phone {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "iphone";
		p.price = 8000;
		System.out.println(p.brand + "..." + p.price);
		p.call();
		p.sendMessage();
		p.playGame();		
	}
}

class Phone {
	//类中方法外的属性
	String brand;	//品牌
	int price;

	//两个行为方法
	public void call() {
		System.out.println("打电话");
	}
	public void sendMessage() {
		System.out.println("发信息");
	}
	public void playGame() {
		System.out.println("玩游戏");
	}

}