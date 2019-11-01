class Test1_polymorphic {
	public static void main(String[] args) {
		Fu f = new Zi();	//父类的引用指向子类对象
		//f.method();		//错误:编译看左边，运行看右边。（编译不通过）
		f.show();			//编译看左边，运行看右边。（通过）
	}
}
class Fu {
	public void show() {
		System.out.println("fu show");
	} 
}
class Zi extends Fu {
	public void show() {
		System.out.println("Zi show");
	}
	public void method() {
		System.out.println("Zi method");
	}
}

