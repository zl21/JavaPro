class Test {
	public static void main(String[] args) {
		/*
		//4行5列
		for (int i = 1;i <= 4 ;i++) {
			for (int j = 1;j <= 5 ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		     
		//直角三角形
		for (int i = 1;i <= 5;i++ ) {
			for (int j = 1;j <= i;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		//九九乘法表
		for (int i = 1;i <=9;i++ ) {
			for (int j = 1;j <= i ;j++) {
				System.out.print("\t" + j + "*" + i + "=" + (i*j));
			}
			System.out.println();
		}

	}
}
