/*###10.13_�������(�����ڲ���ĸ�ʽ�����)
* A:�����ڲ���
	* �����ڲ���ļ�д����
* B:ǰ�᣺����һ������߽ӿ�
	* �����������Ǿ�����Ҳ�����ǳ����ࡣ
* C:��ʽ��
* 
		new �������߽ӿ���(){
			��д����;
		}
* D:������ʲô��?
	* ��һ���̳��˸������ʵ���˸ýӿڵ�������������
* E:������ʾ
	* ����Ҫ����һ�������ڲ���
*/
class Demo3_NoNameInnerClass {
	public static void main(String[] args) {
		Outer o = new Outer();
		o.method();
		System.out.println("-------------�ָ���-------------");
	}
}
interface Inter {
	public void print();
}
class Outer {
	class Inner implements Inter {
		public void print() {
			System.out.println("print");
		}
	}
	public void method() {
		Inner i = new Inner();
		i.print(); 
	}
}