/*
��ȡ�����е���ֵ
*/
class Demo5_Array {
	public static void main(String[] args) {
		int[] arr2 ={6,7,8,9,10,11,12};
		System.out.print(getMax(arr2) + "\t");
	}

	/*�����������ֵ�ķ���:
	1������ֵ����int
	2�������б�int[] arr
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1;i < arr.length ;i++ ) {	//������ĵڶ���Ԫ�ؿ�ʼ����
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
