package com.zl.object;

import com.zl.bean.Student;

public class Demo2_GetClass {

	public static void main(String[] args) {
		Student s = new Student(13,"kl");
		Class clazz = s.getClass();		//获取对象的字节码文件
		String name = clazz.getName();	//获取字节码文件的名字（即类名）
		System.out.println(s.getName());
		System.out.println(name);
		
	}

}
