class Demo2_Operator {
	public static void main(String[] args) {
		//ʵ���������������Ľ�����������ƺͰ׾ƣ�
		int r = 5;
		int w = 10;

		//��Ҫ�õ�����������
		int temp;	//�ձ���
		temp = r;	//��Ʒŵ��ձ�����
		r = w;		//�׾Ʒŵ���Ʊ�����
		w = temp;	//�ձ�����ĺ�Ʒŵ��׾Ʊ�����
		System.out.println("r = " + r + "��w = " + w);

		//����Ҫ�õ����������������ܻ����
		r = r + w;		//5 + 10 = 15
		w = r - w;		//15 - 10 = 5
		r = r - w;		//15 - 5 = 10
		System.out.println("r = " + r + "��w = " + w);

		//����Ҫ�õ�������������ͨ�����
		r = r ^ w;		//r = 5 ^ 10
		w = r ^ w;		//w = 5 ^ 10 ^ 10
		r = r ^ w;		//r = 5 ^ 10 ^ 5
		System.out.println("r = " + r + "��w = " + w);

		//^���ص㣺һ��������һ���� λ��� ���Σ����������䡣
	}
}
