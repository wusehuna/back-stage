package yq.it.test;

public class Example14 {
	public static void main(String[] args) {
//		ʹ�÷�����ӡ������ͬ����ߵľ���
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
