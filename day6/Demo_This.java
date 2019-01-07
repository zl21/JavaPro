/*
(this关键字的概述和应用)
* A:this关键字特点
	* 代表当前对象的引用(当前对象的局部变量，避免重名时的就近原则) 
* B:案例演示
	* this的应用场景
	* 用来区分成员变量和局部变量重名*/
class Demo_This {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("张三");
		p1.setAge(23);
		System.out.println(p1.getName() + "..." + p1.getAge());
		System.out.println("-------------分割线-------------");
	}
}

class Person {
	private String name;
	private int age;

	public void setAge(int age) {		//设置年龄
		if (age > 0 && age < 200) {
			this.age = age;
		}else {
			System.out.println("年龄错误XXX！");
		}
	}
	public int getAge() {			//获取年龄
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void speak() {
		System.out.println(name + "今年" + age);
	}
}

