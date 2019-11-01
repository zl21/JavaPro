package com.zl.object;

import com.zl.bean.Student;

public class Demo4_Equals {
/*比较两个对象是否相等
 *Object中的方法是通过地址值比较两个对象是否相等的，没有意义
 *public boolean equals(Object obj) {
	        return (this == obj);
	    }
 *开发中需要比较的是对象的属性，所以要重写equals()方法；
 *	==	和	equals	的区别：
 *共同点：都可以比较，返回值都是boolean
 *区别：1、==是比较运算符，既可以比较基本数据类型（比较的是值），也可以比较引用数据类型（比较的是地址值）；
 *	  2、equals方法只能比较引用数据类型，在没重写之前，比较的是地址值，底层依赖==号，但比较地址值是没有意义的，我们需要重写equals方法比较对象中的属性值。
*/	
	public static void main(String[] args) {
		Student s1 = new Student(1,"zs");
		Student s2 = new Student(1,"zs");
		boolean b = s1.equals(s2);			
		System.out.println(b);
		System.out.println(s1 == s2);
	}

}
