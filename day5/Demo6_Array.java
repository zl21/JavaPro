/*
����ķ�ת
�����Ĵ���=length/2
*/
class Demo6_Array {
	public static void main(String[] args) {
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		printArr(arr2);
		System.out.println();
		reverseArr(arr2);
		printArr(arr2);
	}

	/*��������ķ���:
	1������ֵ����void
	2�������б�int[] arr
	*/
	public static void reverseArr(int[] arr) {
		for (int i = 0;i < arr.length/2 ;i++ ) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}

	/*print��
	1������ֵ����void
	2�������б�int[] arr
	*/
	public static void printArr(int[] arr) {
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i] + "\t");
		}
	}
}
