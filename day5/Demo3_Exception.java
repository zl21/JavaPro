/*
(�����������������С����Խ��Ϳ�ָ��)
* A:������ʾ
	* a:Array Index Out Of Bounds Exception:��������Խ���쳣
		* ԭ��������˲����ڵ�������
	* b:Null Pointer Exception:��ָ���쳣
		* ԭ�������Ѿ�����ָ����ڴ��ˡ����㻹��������ȥ����Ԫ�ء�
		* int[] arr = {1,2,3};
		* arr = null;
		* System.out.println(arr[0]);
*/
class Demo3_Exception {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println(arr[-1]);	//�����������в����ڵ�����ʱ�����������Խ���쳣

		arr = null;
		System.out.println(arr[0]);		//���������ø�ֵΪnullʱ���������е�Ԫ�ؾͻ���ֿ�ָ���쳣
	}
}
