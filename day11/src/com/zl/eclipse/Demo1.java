package com.zl.eclipse;

import com.zl.animal.Cat;

/**
 * A:�½� ctrl + n
 * B:��ʽ��  ctrl+shift+f
 * C:�����  ctrl+shift+o 
 * D:ע��  ctrl+/,ctrl+shift+/,ctrl+shift+\
 * E:���������ƶ� ѡ�д���alt+��/�¼�ͷ
 * F:�鿴Դ��  ѡ������(F3����Ctrl+�����)
 * G:���Ҿ������ ctrl + shift + tF
 * H:���Ҿ�����ľ��巽�� ctrl + o
 * I:������ ctrl+1,�����ұ�������ߵ���������,���ɷ���
 * J:ɾ������ ctrl + d
 * K:��ȡ����alt + shift + m 
 * L:����alt + shift + r 
 * */
public class Demo1 {
	public static void main(String[] args) {
		/*int sum = 0;
		for (int i = 1; i < 6; i++) {
			sum = sum + i;			
		}
			System.out.println(sum);*/
			
		Cat c = new Cat();
		c.eat();
		c.sleep();
	}

}
