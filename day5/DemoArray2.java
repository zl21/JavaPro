/*
静态初始化的格式：
	* 格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…};
	* 简化格式：数据类型[] 数组名 = {元素1,元素2,…};
*/
class DemoArray2 {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3,4,5};	//声明并赋值
		int[] arr2 = {1,2,3,4,5};			//常用

		System.out.println(arr2);
		System.out.println(arr2[1] + arr2[2]);
	}
}
