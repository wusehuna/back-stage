/**
 * 
 */
package yq.it.test05;

/**
 * @author dell �ַ�����ת������
 *
 */
public class Example02 {
	public static void main(String[] args) {
		String str1 = "anglamga";
		System.out.println("���ַ���ת�����ַ�����Ľ����");
		char[] charArray = str1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i != charArray.length - 1) {
				System.out.print(charArray[i] + ",");
			} else {
				System.out.print(charArray[i]);
			}

		}
		System.out.println(" ");
		System.out.println("��intֵת��ΪString����֮��Ľ����" + String.valueOf(12));
		System.out.println("��str1ת���ɴ�д��" + str1.toUpperCase());
	}

}
