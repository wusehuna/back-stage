/**
 * 
 */
package yq.it.test05;

/**
 * @author dell
 *
 */
public class StringTest {
	public static void main(String[] args) {
		// ��ȡ�Ӵ��������г��ֵĴ�����
		// �����ִ�������
		String str = "kashgoankhgolnlashgoljkadfdsghgo";
		String key = "hgo";
		// ���÷�������ȡ����
		int count = getKeyStringCount(str, key);
		System.out.println("�ִ��������г��ֵĴ���" + count);

	}

	public static int getKeyStringCount(String str, String key) {
		// ����һ�����������ڼ������
		int count = 0;
		// �ж��ַ����Ƿ���������ַ����������������ֱ���˳�
		if (str.contains(key)) {
			// ������������ַ�����ѭ������
			for (int i = 0; i < str.length(); i++) {
				// �������ĵ�һ���±꿪ʼ���������û���ҵ����ַ������򷵻�-1
				// indexOf����ֵΪ�������ִ����ڵ��±�
				System.out.println("str��" + str);
				if ((i = str.indexOf(key)) != -1) {
					// ��ȡ
					str = str.substring(i + key.length());
					System.out.println("�µ�str��" + str);
					count++;
				}
			}
		} else {
			return count;
		}
		return count;

	}

}
