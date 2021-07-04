/**
 * 
 */
package yq.it.test05;

/**
 * 
 * Math��ĳ��÷���
 * 
 * public static int abs(int a) ���� �����ľ���ֵ�� ע�⣬����������� Integer.MIN_VALUE
 * ��ֵ�����ܹ���ʾ����С�� int ֵ������ô������ֵ��ͬ��Ϊ����
 * 
 * public static double ceil(double a) ���ش��ڲ�������С���������������ֵ�Ѿ�����ĳ����������ô�����ò�����ͬ��
 * �������Ϊ NaN��������� 0 �� 0����ô����������ͬ�� �������ֵС�� 0�����Ǵ��� -1.0����ô���Ϊ�� 0��
 * 
 * public static double floor(double a)����С�ڲ���������������������ֵ�Ѿ�����ĳ����������ô�����ò�����ͬ��
 * �������Ϊ NaN��������� 0 �� 0����ô����������ͬ����
 * 
 * public static int round(float a) �������롾������Ϊ���������κ�С�ڵ��� Integer.MIN_VALUE
 * ��ֵ����ô������� Integer.MIN_VALUE ��ֵ�� �������Ϊ���������κδ��ڵ��� Integer.MAX_VALUE ��ֵ����ô�������
 * Integer.MAX_VALUE ��ֵ����
 * 
 * public static int max(int a, int b) �������� int ֵ�нϴ��һ����
 * 
 * public static int min(int a, int b) �������� int ֵ�н�С��һ��
 * 
 * public static double random() ���ش��ڵ��� 0.0 ��С��1.0�����С��
 *
 */
public class Example15Math {
	public static void main(String[] args) {
		// �÷�����һ����̬���������Կ���ͨ�������ķ�ʽֱ�����
		System.out.println("�������ֵ��Ľ��:" + Math.abs(-60));
		// ���ش��ڲ�������С����ֵ
		System.out.println("����ڲ�������С������" + Math.ceil(-11.9));
		// ����С�ڲ������������
		System.out.println("С�ڲ��������������" + Math.floor(-20.4));
		// ��������
		System.out.println("�������룺" + Math.round(5.8));
		// �����������Ĵ�ֵ
		System.out.println("���������Ľϴ�ֵ��" + Math.max(-6.8, -8.9));
		// ������������Сֵ
		System.out.println("���������Ľϴ�ֵ��" + Math.min(-6.8, -8.9));
		// �������С��
		System.out.println("���С����" + Math.random());
	}

}
