class Demo8_Interface_Class {
	public static void main(String[] args) {
		Demo d = new Demo();
		d.print();
	}
}
interface InterA {
	public abstract void print();
}
interface InterB {
	public abstract void print();
}
interface InterC extends InterA,InterB {	//�ӿ���ӿ�֮���Ǽ̳й�ϵ�����Ե��̳�Ҳ���Զ�̳�
}

//�����඼Ĭ�ϼ̳�Object�࣬implement(����)Inter�ӿ�ֻ�Ǹɵ�
class Demo /*extends Object*/ implements InterA,InterB {	//����ӿ�֮����ʵ�ֹ�ϵ�����Ե�ʵ��Ҳ���Զ�ʵ��
	public void print() {
		System.out.println("������д�������еĳ��󷽷�");
	}
	
}
