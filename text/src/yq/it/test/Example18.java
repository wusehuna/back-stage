package yq.it.test;

/**
 * �������
 * 1.�������
 * 2.������ֵ
 * 3.����ð������
 * 4.����ѡ������
 */
public class Example18 {
	/**
	 * @param num
	 * 1.�������
	 * ��������һ������ʱ������Ӧ���� ����[] ������
	 */
	public static void traverse(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.println("������ı������У�"+" "+" "+num[i]);
		}
	}
//
	/**
	 * @param num
	 * @return max
	 * 2.������ֵ
	 *  �����з���ֵʱ��������������Ӧ�ö���һ�����������ո÷���ֵ
	 */
	public static int getMax(int[] num) {
		int max=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr1=new int[]{89,74,100,25};
		traverse(arr1);
		int maxNum=getMax(arr1);
		System.out.println("������������������ǣ�"+maxNum);

	}

}
