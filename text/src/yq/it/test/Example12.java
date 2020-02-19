package yq.it.test;

public class Example12 {
	public static void main(String[] args) {
	int area=getArea(3,15);
		System.out.println("这个矩形的面积是:"+area);
	}
	public static int getArea(int x, int y) {
		int temp=x*y;
		return temp;
	}

}
