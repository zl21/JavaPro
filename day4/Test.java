class Test {
	public static void main(String[] args) {
		/*
		//4��5��
		for (int i = 1;i <= 4 ;i++) {
			for (int j = 1;j <= 5 ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		     
		//ֱ��������
		for (int i = 1;i <= 5;i++ ) {
			for (int j = 1;j <= i;j++ ) {
				System.out.print("* ");
			}
			System.out.println();
		}
		*/
		//�žų˷���
		for (int i = 1;i <=9;i++ ) {
			for (int j = 1;j <= i ;j++) {
				System.out.print("\t" + j + "*" + i + "=" + (i*j));
			}
			System.out.println();
		}

	}
}
