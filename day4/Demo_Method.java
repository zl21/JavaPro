		/*
		�����ĸ�ʽ: 
		���η� ����ֵ���� ������(�������� ������1,�������� ������2...) {
			���������;
			return ����ֵ; 
		} 
	�����ĸ�ʽ˵��:
	* ���η���Ŀǰ���� public static��������������ϸ�Ľ������������η���
	* ����ֵ���ͣ����ǹ��ܽ�����������͡�
	* �������������������򼴿ɡ��������ǵĵ��á�
	* ������
		* ʵ�ʲ���������ʵ�ʲ�������ġ�
		* ��ʽ���������Ƿ��������ϵģ����ڽ���ʵ�ʲ����ġ�
	* �������ͣ����ǲ�������������
	* �����������Ǳ�����
	* ��������䣺������ɹ��ܵĴ��롣
	* return�����������ġ�
	* ����ֵ�����ǹ��ܵĽ������return���������ߡ�
		*/
		
import java.util.Scanner;
class Demo_Method {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������:");
		int row = sc.nextInt();
		System.out.println("����������:");
		int column = sc.nextInt();
		outPut(row,column);


		/*
		System.out.println("������a:");
		int a = sc.nextInt();
		System.out.println("������b:");
		int b = sc.nextInt();
		//int max = getMax(a,b); 
		//boolean p = isEqual(a,b);
		System.out.println(p);
		*/
	}
		//Test_1:���ؽϴ�ֵ
		public static int getMax(int x,int y) {
			return x > y ? x : y ;
		}
		//Test_2:�ж��������Ƿ����
		public static boolean isEqual(int x,int y) {
			return x == y;
		}
		//�������¼�������
		/*1����ȷ����ֵ���ͣ�2����ȷ�����б�*/
		public static void outPut(int x,int y) {
			for (int i = 1;i <= x ;i++ ) {
				for (int j = 1;j <= y ;j++ ) {
					System.out.print("*");
				}
				System.out.println();
			}
			return ;							//����ֵ����Ϊvoid��return��ʡ�ԡ�
		}
}
