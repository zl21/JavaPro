class Demo_While {
	public static void main(String[] args) {
		/*
		int x = 1;
		while (x < 2) {
			System.out.println("Hello World!");
			break;
		}
		*/
		//100以内的和
		int i = 1;
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println("sum = " + sum);

	}
}
