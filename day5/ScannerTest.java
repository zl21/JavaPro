import java.util.Scanner;
class ScannerTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数：");
		int x = sc.nextInt();
		for (int a = 1;a <= x;a++ ) {
			for (int b = 1;b <= a ;b++ ) {
				System.out.print("\t" + b + "*" + a + "=" + a * b);
			}
			System.out.println();
		}
	}
}
