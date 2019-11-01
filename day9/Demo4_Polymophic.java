/*
基本数据类型自动类型提升和强制类型转换；
		int i = 10;
		byte b = 20;
		i = b;					//自动类型提升
		b = (byte)i;			//强制类型转换

引用数据类型。。。
*/
class Demo4_Polymophic {
	public static void main(String[] args) {		
		Father f = new Son();		//父类引用指向子类对象（即是提升为父类的 引用数据类型 自动类型提升）
		System.out.println(f.num);	//成员变量
		f.print();					//成员方法
		Son s = (Son)f;				//强制将 父类的f对象 转换为 子类对象s
		s.method();
		System.out.println("---------------------------");
	}
}
class Father {
	int num = 10;
	public void print() {
		System.out.println("father");
	}
}
class Son extends Father  {
	int num = 20;
	public void print() {
		System.out.println("son");
	}
	public static void method() {
		System.out.println("Son method");
	}
}
