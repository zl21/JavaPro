package com.zl.object;

import com.zl.bean.Student;

public class Demo4_Equals {
/*�Ƚ����������Ƿ����
 *Object�еķ�����ͨ����ֵַ�Ƚ����������Ƿ���ȵģ�û������
 *public boolean equals(Object obj) {
	        return (this == obj);
	    }
 *��������Ҫ�Ƚϵ��Ƕ�������ԣ�����Ҫ��дequals()������
 *	==	��	equals	������
 *��ͬ�㣺�����ԱȽϣ�����ֵ����boolean
 *����1��==�ǱȽ���������ȿ��ԱȽϻ����������ͣ��Ƚϵ���ֵ����Ҳ���ԱȽ������������ͣ��Ƚϵ��ǵ�ֵַ����
 *	  2��equals����ֻ�ܱȽ������������ͣ���û��д֮ǰ���Ƚϵ��ǵ�ֵַ���ײ�����==�ţ����Ƚϵ�ֵַ��û������ģ�������Ҫ��дequals�����Ƚ϶����е�����ֵ��
*/	
	public static void main(String[] args) {
		Student s1 = new Student(1,"zs");
		Student s2 = new Student(1,"zs");
		boolean b = s1.equals(s2);			
		System.out.println(b);
		System.out.println(s1 == s2);
	}

}
