package com.zl.object;
import com.zl.bean.Student;
public class Demo3_ToString {
/*	�̳е���Object���е�toString()�������еĽ����com.zl.bean.Student@761da8fc
 * 	@������������ұ���hashCodeֵ
 *  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
    toString()���������ã����Ը��������ʾ����ֵ
    getName()������ȡֵ֮���������ʾ��ֵ����
*/
	public static void main(String[] args) {
		Student s= new Student(1,"zs");
		String str = s.toString();
		System.out.println(str);
	}

}
