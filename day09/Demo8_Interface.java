class Demo8_Interface {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
		System.out.println(Inter.num);		//��static��̬�ģ�����ͨ����.���ʡ�
	}
}
interface Inter {
	/*public static final*/ int num = 10;	//�������η���ϵͳĬ�ϣ���˳���޹�
	//public Inter() {}						//�ӿ���û�й��췽����
	//public void print() {}				//�ӿ��еķ��������ǳ����
}

//�����඼Ĭ�ϼ̳�Object�࣬implement(����)Inter�ӿ�ֻ�Ǹɵ�
class Demo /*extends Object*/ implements Inter {	
	public void print() {
		//num = 20;							//��final���������ܱ��޸ġ�			
		System.out.println(num);
	}
	public Demo() {
		super();
	}
}
