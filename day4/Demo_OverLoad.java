/*
���أ���������ͬ�������б�ͬ���뷵��ֵ�����޹�
eg:���������ĺ������������ĺͣ�����������add��ֻ����ӵĸ�����һ������
���صķ��ࣺ
	1������������ͬ
	2���������Ͳ�ͬ
*/
class Demo_OverLoad {
	public static void main(String[] args) {
/*
		int sum1 = add(10,20);
		System.out.println(sum1);

		int sum2 = add(10,20,30);
		System.out.println(sum2);
	}
	public static int add(int a,int b) {
		return a + b;
	}
	public static int add(int a,int b,int c) {
		return a + b + c;
	}
*/
		boolean a = isEqual(2,2);
		System.out.println(a);

		boolean b = isEqual(2.0,2.0);
		System.out.println(b);
	}
//�ֱ�Ƚ�����int���͵ĺ�����double���͵��Ƿ����
	public static boolean isEqual(int a,int b) {
		return a == b;
	}
	public static boolean isEqual(double a,double b) {
		return a == b;
	}
}
