/*
###10.02_面向对象(包的定义及注意事项)(掌握)
* A:定义包的格式
	* package 包名;
	* 多级包用.分开即可
* B:定义包的注意事项
	* A:package语句必须是程序的第一条可执行的代码
	* B:package语句在一个java文件中只能有一个
	* C:如果没有package，默认表示无包名
* C:案例演示
	* 包的定义及注意事项
###10.03_面向对象(带包的类编译和运行)(掌握)
* A:如何编译运行带包的类
	* a:javac编译的时候带上-d即可
		* javac -d . HelloWorld.java
	* b:通过java命令执行。
		* java 包名.HellWord
###10.05_面向对象(import关键字的概述和使用)(掌握)
* A:案例演示
	* 为什么要有import
		* 其实就是让有包的类对调用者可见,不用写全类名了 
* B:导包格式
	* import 包名;
	* 注意：
	* 这种方式导入是到类的名称。
	* 虽然可以最后写*，但是不建议。
* C:package,import,class有没有顺序关系(面试题)
*/
package com.zl ;
import com.hb.Person;
import java.util.*;
class Demo1_Define {
	public static void main(String[] args) {
		com.hb.Person p = new com.hb.Person("zhangsan",23);
		System.out.println(p.getName() + "........." + p.getAge());
	}
}
