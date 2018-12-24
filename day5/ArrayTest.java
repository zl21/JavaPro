//三个引用两个数组
class ArrayTest {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		int[] arr2 = new int[3];
		int[] arr3 = arr2;

		System.out.println("arr1 = "  + arr1);
		System.out.println("arr2 = "  + arr2);
		System.out.println("arr3 = "  + arr3);

		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;


		System.out.println("arr1[0] = " + arr1[0]);		
		System.out.println("arr1[1] = " + arr1[1]);
		System.out.println("arr1[2] = " + arr1[2]);
		System.out.println("-------------------------");

		System.out.println("arr2[0] = " + arr2[0]);
		System.out.println("arr2[1] = " + arr2[1]);
		System.out.println("arr2[1] = " + arr2[2]);
		System.out.println("-------------------------");

		System.out.println("arr3[0] = " + arr3[0]);
		System.out.println("arr3[1] = " + arr3[1]);
		System.out.println("arr3[2] = " + arr3[2]);
		System.out.println("-------------------------");

	}
}
