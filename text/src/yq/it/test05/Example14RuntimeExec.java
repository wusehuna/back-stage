/**
 * 
 */
package yq.it.test05;

/**
 * �򿪵ļ��±���3����Զ��ر�
 * 
 * public Process exec(String command) throws IOException �ڵ����Ľ�����ִ��ָ�����ַ������
 *
 */
public class Example14RuntimeExec {
	public static void main(String[] args) throws Exception {
		// ��ȡRuntime����
		Runtime runtime1 = Runtime.getRuntime();

		// �õ�һ����ʾ���̵�Process����
		Process process = runtime1.exec("notepad.exe");
		Thread.sleep(3000);// ��������3��
		process.destroy();// ɱ����ǰ����

	}

}
