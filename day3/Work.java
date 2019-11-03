import java.util.Scanner;
class Work {
	public static void main(String[] args) {
/*
//——————Work_1
int x = 1,y = 1;
if(x++ == 2 & ++y == 2) {
	x =7;
}
System.out.println("x="+ x + ",y=" + y);


//——————work_2
int x = 1,y = 1;
if(x++==2 && ++y==2) {
	x =7;
}
System.out.println("x="+x+",y="+y);


//——————work_3
int x = 1,y = 1;
if(x++==1 | ++y==1) {
	x =7;
}
System.out.println("x="+x+",y="+y);
*/

//——————work_4
int x = 1,y = 1;
if(x++==1 || ++y==1) {
	x =7;
}
System.out.println("x="+x+",y="+y);
	}
}
/*
//——————work_5
int x = 2,y=3;
switch(x)
{
	default:
		y++;
	case 3:
		y++;
		break;
	case 4:
		y++;
}
System.out.println("y="+y);


//——————work_6
Scanner sc = new Scanner(System.in);
System.out.println("请输入一个成绩：");
int x = sc.nextInt();
if (x < 0 || x > 100) {
	System.out.println("不在范围内！");
}else if (x >= 90 && x <= 100) {
	System.out.println("A等！");
}else if (x >= 80 && x <= 89) {
	System.out.println("B等！");
}else if (x >= 70 && x <= 79) {
	System.out.println("C等！");
}else if (x >= 60 && x <= 69) {
	System.out.println("D等！");
}else if (x >= 0 && x <= 59) {
	System.out.println("E等！");
}

*/