/*
* A:������ʾ
	* �������������������������е�ÿһ��Ԫ�ء�
	* ���������:arr.length����ĳ���
	* ������������:arr.length - 1;
*/
class Demo4_Array {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};

		for (int i = 0;i < arr.length ;i++ ) {
			System.out.println(arr[i]);
		}
		int[] arr2 ={6,7,8,9};
		arrPrint(arr2);
	}

	/*��������ķ���:
	1������ֵ����void
	2�������б�int[] arr
	*/
	public static void arrPrint(int[] arr) {
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print("\t" + arr[i]);
		}
	}
}
