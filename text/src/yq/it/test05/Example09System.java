/**
 * 
 */
package yq.it.test05;

import java.util.Properties;
import java.util.Set;

/**
 *
 * System����÷� 
 * public static Properties getProperties()
 *         �������ڻ�ȡ��ǰϵͳ��ȫ�����ԣ��÷����᷵��һ��Properties���͵�����
 *         ���з�װ��ϵͳ���������ԣ���Щ�������ԡ�������=����ֵ������ʽ���ڵ�
 * pubilc static String getProperty(String key) ��ȡָ����(������)����Ӧ��ϵͳ����ֵ
 * 
 *
 */
public class Example09System {
	public static void main(String[] args) {
		// ��ȡ��ǰϵͳ����
		Properties properties = System.getProperties();
		System.out.println(properties);
		// ��ȡ����ϵͳ���Ե�key(������)������set����
		Set<String> proStrings = properties.stringPropertyNames();
		// getProperty(string key) ����һ�����������Ϳ��Եõ������Զ�Ӧ��ϵͳ����
		for (String key : proStrings) {
			// ��ȡ��ǰ��key(������)����Ӧ��ֵ(����ֵ)
			String keyvalString = System.getProperty(key);
			System.out.println("��" + key + "������ֵΪ" + keyvalString);
		}

	}

}
