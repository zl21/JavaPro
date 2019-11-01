/*
匿名内部类在开发中的应用
*/
class Test2_NoNameInnerClass {
	public static void main(String[] args) {
		Outer.method().show();	//用类调用方法，说明方法是静态的；
								//.show()说明Outer.method()是一个对象,是Inter的子类对象
		//方法二：
		Inter i = Outer.method();
		i.show();				//父类的引用指向子类对象
	}
}
interface Inter {
	void show();
}

/*错误：
class Outer { //补齐代码 
	public static Inter method(new Inter() {
		public void show() {
			System.out.println("重写");
		}
	});
}
*/

class Outer {
	//用类名.调用，说明方法是静态的。
	public static Inter method() {	//返回值类型是Inter的子类对象
		return new Inter() {
			public void show() {
				System.out.println("new一个Inter的子类匿名对象");
			}
		};

	}
}
