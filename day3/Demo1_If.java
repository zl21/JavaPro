/*
class Demo1_If {
	public static void main(String[] args) {
		int age = 17;
		if (age >= 18) {
			System.out.println("���Ա�����ʻ֤!");
		}else {
			System.out.println("����δ�ﵽ�������䣡");
		}

		//Test_1��������
		int a = 10;
		int b = 20;
		int max;
		if (a > b) {
			max = a;
		}else {
			max = b;
		}
		System.out.println(max);

		//Test_2���ж���ż��
		int x = 10;
		if (x % 2 == 0) {
			System.out.println(x + "��ż����");
		}else {
			System.out.println(x + "��������");		
		}
*/

		//Test_3������¼��һ���ɼ����жϲ�����ɼ��ĵȼ�
import java.util.Scanner;
class Demo1_If {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ĳɼ���");
		int x = sc.nextInt();
			if(x >= 90 & x <= 100) {
			System.out.println("���㣡");
			}else if (x < 90) {
				System.out.println("������");
			}else {
				System.out.println("�����Ǹ��ٵĳɼ���");
				}
	}

}