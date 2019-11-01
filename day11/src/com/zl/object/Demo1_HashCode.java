package com.zl.object;

import com.zl.bean.Student;

public class Demo1_HashCode {

	public static void main(String[] args) {
		Object ob = new Object();
		int hC = ob.hashCode();
		System.out.println(hC);

		Student s1 = new Student(12, "lisi");
		Student s2 = new Student(18, "xhb");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
