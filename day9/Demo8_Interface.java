class Demo8_Interface {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
		System.out.println(Inter.num);		//是static静态的，可以通过类.访问。
	}
}
interface Inter {
	/*public static final*/ int num = 10;	//三个修饰符是系统默认，与顺序无关
	//public Inter() {}						//接口中没有构造方法。
	//public void print() {}				//接口中的方法必须是抽象的
}

//所有类都默认继承Object类，implement(工具)Inter接口只是干爹
class Demo /*extends Object*/ implements Inter {	
	public void print() {
		//num = 20;							//是final常量，不能被修改。			
		System.out.println(num);
	}
	public Demo() {
		super();
	}
}
