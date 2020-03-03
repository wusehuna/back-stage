package yq.it.test;
//方法的重载
public class Example16 {
	public static void main(String[] args) {
		int sum1=add(1,2);
		int sum2=add(1,2,3);
		double sum3=add(1.6,2.8);
		System.out.println("整数打印的结果："+sum1);
		System.out.println("三个整数打印的结果："+sum2);
		System.out.println("小数打印的结果："+sum3);
	}
	public static int add(int x,int y) {
		int sum=x+y;
		return sum;
		
	}
	public static int add(int x,int y,int z) {
		int sum=x+y+z;
		return sum;
		
	}
	public static double add(double x,double y) {
		double sum=x+y;
		return sum;
		
	}

}
