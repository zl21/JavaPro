/*
###10.02_�������(���Ķ��弰ע������)(����)
* A:������ĸ�ʽ
	* package ����;
	* �༶����.�ֿ�����
* B:�������ע������
	* A:package�������ǳ���ĵ�һ����ִ�еĴ���
	* B:package�����һ��java�ļ���ֻ����һ��
	* C:���û��package��Ĭ�ϱ�ʾ�ް���
* C:������ʾ
	* ���Ķ��弰ע������
###10.03_�������(����������������)(����)
* A:��α������д�������
	* a:javac�����ʱ�����-d����
		* javac -d . HelloWorld.java
	* b:ͨ��java����ִ�С�
		* java ����.HellWord
###10.05_�������(import�ؼ��ֵĸ�����ʹ��)(����)
* A:������ʾ
	* ΪʲôҪ��import
		* ��ʵ�������а�����Ե����߿ɼ�,����дȫ������ 
* B:������ʽ
	* import ����;
	* ע�⣺
	* ���ַ�ʽ�����ǵ�������ơ�
	* ��Ȼ�������д*�����ǲ����顣
* C:package,import,class��û��˳���ϵ(������)
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
