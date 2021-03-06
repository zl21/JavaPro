/*
* A:为什么要有数组(容器):为了存储同种数据类型的多个值
* B:数组概念
	* 数组是存储同一种数据类型多个元素的集合。也可以看成是一个容器。
	* 数组既可以存储基本数据类型，也可以存储引用数据类型。
*/

class Demo_Array {
	public static void main(String[] args) {
//数组定义格式:	数据类型[] 数组名 = new 数据类型[数组的长度];
		int[] arr = new int[5];		//动态初始化，即在内存中开辟连续的5块空间，并赋初值。

		System.out.println(arr[0]);	//输出0。说明系统给出了默认初始化值，int型的都为0.
	}
}



/* 
* B:如何对数组进行初始化
	* a:动态初始化 只指定长度，由系统给出初始化值
		* int[] arr = new int[5]; 	
	* b:静态初始化 给出初始化值，由系统决定长度
*/
