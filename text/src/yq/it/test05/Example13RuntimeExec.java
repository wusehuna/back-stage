/**
 * 
 */
package yq.it.test05;

import java.io.IOException;

/**
 * Runtime�����ṩ��һ��exec()�������÷�������ִ��һ��dos����Ӷ�ʵ�ֺ��������д���������dos����ͬ����Ч��
 *
 */
public class Example13RuntimeExec {
	public static void main(String[] args) throws IOException {
		// ��ȡRuntime�����
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad.exe");
	}

}
