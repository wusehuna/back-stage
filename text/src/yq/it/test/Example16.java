package yq.it.test;
//����������
public class Example16 {
	public static void main(String[] args) {
		int sum1=add(1,2);
		int sum2=add(1,2,3);
		double sum3=add(1.6,2.8);
		System.out.println("������ӡ�Ľ����"+sum1);
		System.out.println("����������ӡ�Ľ����"+sum2);
		System.out.println("С����ӡ�Ľ����"+sum3);
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
