class Demo1_Switch {
	public static void main(String[] args) {
/*	可以接收的基本数据类型：byte、short、char、int
	可以接收的引用数据类型：枚举（JDK 1.5 ）。
	JDK 1.7 之后可以接收 String字符串。
	
	* 执行流程：
		1、先计算表达式的值
		2、与case后面的皮匹配，true就执行当前case下的语句，依此都为false就执行default下的语句
	
	* 注意：
		1、case后面只能是常量，不能是变量。多个case后的值不能相同。
		2、不建议省略default。
		3、一定要写break。没有break会遇到case穿透。
*/
		String name = "张三";
		String gender = "女士";
		switch (gender) {
		case "男士":
			System.out.println(name + "是一位喜欢吃饭睡觉打dota的" + gender);
		break;
		case "女士":
			System.out.println(name + "是一位喜欢逛街购物刷淘宝的" + gender);
		break;
		default:
			System.out.println(name + "是一位打雌雄激素维持美貌的" + gender);
		break;
		}		
	}
}
