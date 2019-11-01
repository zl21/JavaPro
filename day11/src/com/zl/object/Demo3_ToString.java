package com.zl.object;
import com.zl.bean.Student;
public class Demo3_ToString {
/*	继承调用Object类中的toString()方法运行的结果：com.zl.bean.Student@761da8fc
 * 	@左边是类名，右边是hashCode值
 *  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    toString()方法的作用：可以更方便地显示属性值
    getName()方法获取值之后可以做显示或赋值操作
*/
	public static void main(String[] args) {
		Student s= new Student(1,"zs");
		String str = s.toString();
		System.out.println(str);
	}

}
