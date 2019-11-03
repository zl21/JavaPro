class Demo2_Operator {
	public static void main(String[] args) {
		//实现两个整数变量的交换（交换红酒和白酒）
		int r = 5;
		int w = 10;

		//需要用到第三方变量
		int temp;	//空杯子
		temp = r;	//红酒放到空杯子里
		r = w;		//白酒放到红酒杯里面
		w = temp;	//空杯子里的红酒放到白酒杯里面
		System.out.println("r = " + r + "，w = " + w);

		//不需要用到第三方变量，可能会溢出
		r = r + w;		//5 + 10 = 15
		w = r - w;		//15 - 10 = 5
		r = r - w;		//15 - 5 = 10
		System.out.println("r = " + r + "，w = " + w);

		//不需要用到第三方变量，通过亦或
		r = r ^ w;		//r = 5 ^ 10
		w = r ^ w;		//w = 5 ^ 10 ^ 10
		r = r ^ w;		//r = 5 ^ 10 ^ 5
		System.out.println("r = " + r + "，w = " + w);

		//^的特点：一个数对另一个数 位异或 两次，该数本身不变。
	}
}
