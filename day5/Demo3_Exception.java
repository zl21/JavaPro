/*
(数组操作的两个常见小问题越界和空指针)
* A:案例演示
	* a:Array Index Out Of Bounds Exception:数组索引越界异常
		* 原因：你访问了不存在的索引。
	* b:Null Pointer Exception:空指针异常
		* 原因：数组已经不在指向堆内存了。而你还用数组名去访问元素。
		* int[] arr = {1,2,3};
		* arr = null;
		* System.out.println(arr[0]);
*/
class Demo3_Exception {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr[-1]);	//当访问数组中不存在的索引时，会出现索引越界异常

		arr = null;
		System.out.println(arr[0]);		//当数组引用赋值为null时调用数组中的元素就会出现空指针异常
	}
}
