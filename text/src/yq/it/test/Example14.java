package yq.it.test;

public class Example14 {
	public static void main(String[] args) {
//		使用方法打印三个不同长宽高的矩形
		printRectangle(3,10);
		printRectangle(5,8);
	}
	public static void printRectangle(int height, int width) {
		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}
}
