/*
�����ڲ����ڿ����е�Ӧ��
*/
class Test2_NoNameInnerClass {
	public static void main(String[] args) {
		Outer.method().show();	//������÷�����˵�������Ǿ�̬�ģ�
								//.show()˵��Outer.method()��һ������,��Inter���������
		//��������
		Inter i = Outer.method();
		i.show();				//���������ָ���������
	}
}
interface Inter {
	void show();
}

/*����
class Outer { //������� 
	public static Inter method(new Inter() {
		public void show() {
			System.out.println("��д");
		}
	});
}
*/

class Outer {
	//������.���ã�˵�������Ǿ�̬�ġ�
	public static Inter method() {	//����ֵ������Inter���������
		return new Inter() {
			public void show() {
				System.out.println("newһ��Inter��������������");
			}
		};

	}
}
