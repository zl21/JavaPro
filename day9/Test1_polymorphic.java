class Test1_polymorphic {
	public static void main(String[] args) {
		Fu f = new Zi();	//���������ָ���������
		//f.method();		//����:���뿴��ߣ����п��ұߡ������벻ͨ����
		f.show();			//���뿴��ߣ����п��ұߡ���ͨ����
	}
}
class Fu {
	public void show() {
		System.out.println("fu show");
	} 
}
class Zi extends Fu {
	public void show() {
		System.out.println("Zi show");
	}
	public void method() {
		System.out.println("Zi method");
	}
}

