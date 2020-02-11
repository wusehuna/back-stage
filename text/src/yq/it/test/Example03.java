package yq.it.test;

public class Example03 {
	public static void main(String[] args) {
		int x=29;
		{
			int y=34;
			System.out.println("x="+x);
			System.out.println("y="+y);
			System.out.println("x+y="+(x+y));
		}
//		系统报错，找不到y这个变量
//		y=x;
		
		System.out.println("x="+x);
		
	}
}
