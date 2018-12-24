/*
* A:案例演示
	* 数组遍历：就是依次输出数组中的每一个元素。
	* 数组的属性:arr.length数组的长度
	* 数组的最大索引:arr.length - 1;
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

	/*数组遍历的方法:
	1、返回值类型void
	2、参数列表int[] arr
	*/
	public static void arrPrint(int[] arr) {
		for (int i = 0;i < arr.length ;i++ ) {
			System.out.print("\t" + arr[i]);
		}
	}
}
