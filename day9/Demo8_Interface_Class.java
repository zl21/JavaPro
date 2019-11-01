class Demo8_Interface_Class {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
	}
}
interface InterA {
	public abstract void print();
}
interface InterB {
	public abstract void print();
}
interface InterC extends InterA,InterB {	//接口与接口之间是继承关系，可以单继承也可以多继承
}

//所有类都默认继承Object类，implement(工具)Inter接口只是干爹
class Demo /*extends Object*/ implements InterA,InterB {	//类与接口之间是实现关系，可以但实现也可以多实现
	public void print() {
		System.out.println("必须重写抽象类中的抽象方法");
	}
	
}
