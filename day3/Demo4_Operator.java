/*
	* a:����
			* ��ʽ�� import java.util.Scanner; 
			* λ�ã� ��class���档
	* b:��������¼�����
		* ��ʽ�� Scanner sc = new Scanner(System.in);
	* c:ͨ�������ȡ����	
		* ��ʽ�� int x = sc.nextInt();		
*/
import java.util.Scanner;
class Demo4_Operator {	//����¼��
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);	//��������¼�����
		System.out.println("������һ��������");
		int x = sc.nextInt();
		System.out.println(x);

		//Text_1:¼����������
		System.out.println("������ڶ���������");
		int y = sc.nextInt();
		System.out.println(y);

		//Test_2:������������Ͳ����
		int sum = x + y;
		System.out.println("x + y = " + sum);

		//��ȡ�������е����ֵ
		int max = (x > y) ? x : y;
		System.out.println("max = " + max);

	}
}
