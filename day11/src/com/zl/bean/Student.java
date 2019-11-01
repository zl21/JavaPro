package com.zl.bean;

public class Student {
	private int age;
	private String name;

	public Student() {
		super();
	}

	public Student(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
	}
	
	//��дequals()������
	public boolean equals(Object obj) {
		Student s = (Student)obj;
		return this.name.equals(s.name) && this.age==s.age;
	}
	
	//��дtoString()������
	/*public String toString() {

		return "my name is " + name + " and age is " + age;
	}*/
	

}
