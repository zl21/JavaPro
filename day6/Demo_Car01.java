class Demo_Car01 {
	public static void main(String[] args) {
/*
	��Ҫ10��red��8������ꤵĳ���
	��ô�죿new 10��������emmmm...̫�鷳��8��
*/
		Car c1 = new Car();
		c1.color = "red";
		c1.num = 8;
		c1.run();
		//��ȡ��
		method(c1);

		Car c2 = new Car();
		c2.color = "red";
		c2.num = 8;
		c2.run();
		method(c2);

		System.out.println("-------------�ָ���-------------");
	}
		//emmm...new 10 �Σ���
		//����Ҫ�У���ȡ������ߴ���ĸ����ԣ��ľ��򰡣�
		public static void method(Car c) {
			c.color = "red";
			c.num = 8;
			c.run();
		}		
}

class Car {
	String color;
	int num;
	public void run() {
		System.out.println(color + "......" + num);
	}
}