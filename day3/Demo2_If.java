class Demo2_If {
	public static void main(String[] args) {
		//if ����Ƕ��
		int a = 10;
		int b = 20;
		int c = 30;

		if (a > b) {
			if (a > c) {
				System.out.println(a + "�����ģ�");
			}else {
				System.out.println(c + "�����ģ�");
			}
		}else {	//b >= a
			if (b > c) {
				System.out.println(b + "�����ģ�");
			}else {
				System.out.println(c + "�����ģ�");
			}
		}
	}
}
