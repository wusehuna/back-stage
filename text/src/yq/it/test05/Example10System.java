/**
 * 
 */
package yq.it.test05;

/**
 * @author dell public static long currentTimeMillis()
 *         ��������һ��long���͵�ֵ����ֵ��ʾ��ǰʱ����1970��1��1��0��0��0��֮���ʱ����λ�Ǻ��룬ͨ��Ҳ����ֵ����ʱ���
 *
 */
public class Example10System {
	public static void main(String[] args) {
		// ��������ڽ�����Ͳ���ʱ�����ĵ�ʱ��
		// ��forѭ��֮ǰ��ȡһ��ʱ�䣬�������ȡһ��ʱ�䣬��ֵ��Ϊ����ʱ��
		// ѭ����ʼʱ�ĵ�ǰʱ��
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
			sum += i;

		}
		// ѭ����ʼʱ�ĵ�ǰʱ��
		long endTime = System.currentTimeMillis();
		System.out.println("��ǰ�������������ĵ�ʱ�䣺" + (endTime - startTime) + "����");

	}

}
