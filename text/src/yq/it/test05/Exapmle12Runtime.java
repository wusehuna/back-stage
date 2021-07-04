/**
 * 
 */
package yq.it.test05;

/**
 * Runtime���ʹ�� �� public int availableProcessors() �� Java ��������ؿ��ô���������Ŀ�� public
 * static Runtime getRuntime()�����뵱ǰ Java Ӧ�ó�����ص�����ʱ���� public long freeMemory()
 * ���� Java ������еĿ����ڴ��� public long maxMemory() ���� Java �������ͼʹ�õ�����ڴ���
 * 
 *
 */
public class Exapmle12Runtime {
	public static void main(String[] args) {
		// ��ȡһ��Runtime�����
		Runtime rtRuntime = Runtime.getRuntime();
		// ��ȡ�������ĸ���
		System.out.println("�������ĸ�����" + rtRuntime.availableProcessors());
		// java�������ʹ�õĿ����ڴ���
		System.out.println("�����ڴ�����" + rtRuntime.freeMemory() / 1024 / 1024 + "M");
		// java�������ͼʹ�õ�����ڴ���
		System.out.println("����ڴ�����" + rtRuntime.maxMemory() / 1020 / 1024 + "M");

	}

}
