/*
###10.08_�������(�ڲ�������ͷ����ص�)(�˽�)
* A:�ڲ������
* B:�ڲ�������ص�
	* a:�ڲ������ֱ�ӷ����ⲿ��ĳ�Ա������˽�С�
	* b:�ⲿ��Ҫ�����ڲ���ĳ�Ա�����봴������
	* �ⲿ����.�ڲ����� ������ = �ⲿ�����.�ڲ������;
* C:������ʾ
	* �ڲ��༫������ص�
*/
class Demo2_InnerClass {
	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();		//�����ڲ������
		oi.method();
		
		System.out.println("-------------�ָ���-------------");
	}
}
class Outer {
	private int num = 10;
	class Inner {
		public void method() {
			System.out.println(num + "......khzsgjozdjgdsdhdxhxh");
		}
	}
}