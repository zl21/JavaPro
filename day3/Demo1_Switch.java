class Demo1_Switch {
	public static void main(String[] args) {
/*	���Խ��յĻ����������ͣ�byte��short��char��int
	���Խ��յ������������ͣ�ö�٣�JDK 1.5 ����
	JDK 1.7 ֮����Խ��� String�ַ�����
	
	* ִ�����̣�
		1���ȼ�����ʽ��ֵ
		2����case�����Ƥƥ�䣬true��ִ�е�ǰcase�µ���䣬���˶�Ϊfalse��ִ��default�µ����
	
	* ע�⣺
		1��case����ֻ���ǳ����������Ǳ��������case���ֵ������ͬ��
		2��������ʡ��default��
		3��һ��Ҫдbreak��û��break������case��͸��
*/
		String name = "����";
		String gender = "Ůʿ";
		switch (gender) {
		case "��ʿ":
			System.out.println(name + "��һλϲ���Է�˯����dota��" + gender);
		break;
		case "Ůʿ":
			System.out.println(name + "��һλϲ����ֹ���ˢ�Ա���" + gender);
		break;
		default:
			System.out.println(name + "��һλ����ۼ���ά����ò��" + gender);
		break;
		}		
	}
}
