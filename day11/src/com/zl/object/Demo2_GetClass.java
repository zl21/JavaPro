package com.zl.object;

import com.zl.bean.Student;

public class Demo2_GetClass {

	public static void main(String[] args) {
		Student s = new Student(13,"kl");
		Class clazz = s.getClass();		//��ȡ������ֽ����ļ�
		String name = clazz.getName();	//��ȡ�ֽ����ļ������֣���������
		System.out.println(s.getName());
		System.out.println(name);
		
	}

}
