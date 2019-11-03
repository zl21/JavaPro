/*
数组的反转
交换的次数=length/2
*/
class Demo6_Array {
	public static void main(String[] args) {
		int[] arr2 = {1,2,3,4,5,6,7,8,9,10};
		printArr(arr2);
		System.out.println();
		reverseArr(arr2);
		printArr(arr2);
	}

	/*数组遍历的方法:
	1、返回值类型void
	2、参数列表int[] arr
	*/
	public static void reverseArr(int[] arr) {
		for (int i = 0;i < arr.length/2 ;i++ ) {
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
	}

	/*print：
	1、返回值类型void
	2、参数列表int[] arr
	*/
	public static void printArr(int[] arr) {
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print(arr[i] + "\t");
		}
	}
}
