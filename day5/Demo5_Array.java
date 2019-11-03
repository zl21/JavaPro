/*
获取数组中的最值
*/
class Demo5_Array {
	public static void main(String[] args) {
		int[] arr2 ={6,7,8,9,10,11,12};
		System.out.print(getMax(arr2) + "\t");
	}

	/*数组遍历求最值的方法:
	1、返回值类型int
	2、参数列表int[] arr
	*/
	public static int getMax(int[] arr) {
		int max = arr[0];
		for (int i = 1;i < arr.length ;i++ ) {	//从数组的第二个元素开始遍历
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}
}
