/*
1、父类引用指向子类成员变量时：
		编译看左边（父类），运行也看左边
2、父类引用指向子类成员方法时：
		编译看左边（父类），运行看右边（子类）。（也叫动态绑定）
3、静态的成员方法和类相关，算不上重写，所以运行时还是左边（父类）的。
*/
class Demo3_Polymophic {
	public static void main(String[] args) {
		Father f = new Son();		//父类引用指向子类对象
		System.out.println(f.num);	//成员变量
		f.print();					//成员方法（编译时看父类的print方法，但运行时走的是子类的print方法）
		f.method();					//静态成员方法
		System.out.println("---------------------------");
		Son s = new Son();	
		System.out.println(s.num);
		s .print();
		s.method();
	}
}

class Father {
	int num = 10;
	public void print() {
		System.out.println("father");
	}
	public static void method() {
		System.out.println("Father static method");
	}
}

class Son extends Father  {
	int num = 20;
	public void print() {
		System.out.println("son");
	}
	public static void method() {
		System.out.println("Son static method");
	}
}
