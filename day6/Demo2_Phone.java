/*
object-oriented
�������ķ�װ���á��̳С���̬��
��Ա���������ԣ�����Ա��������Ϊ����
���������ʵ����
�����ࣺ�������������кͷ����⣻������Ҫstatic
*/
class Demo2_Phone {
	public static void main(String[] args) {
		Phone p = new Phone();
		p.brand = "iphone";
		p.price = 8000;
		System.out.println(p.brand + "..." + p.price);
		p.call();
		p.sendMessage();
		p.playGame();		
	}
}

class Phone {
	//���з����������
	String brand;	//Ʒ��
	int price;

	//������Ϊ����
	public void call() {
		System.out.println("��绰");
	}
	public void sendMessage() {
		System.out.println("����Ϣ");
	}
	public void playGame() {
		System.out.println("����Ϸ");
	}

}