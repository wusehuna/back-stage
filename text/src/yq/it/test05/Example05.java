/**
 * 
 */
package yq.it.test05;

/**
 * @author dell �ַ����ķָ�ͽ�ȡ
 *
 */
public class Example05 {
	public static void main(String[] args) {
		String str7 = "����-ƹ����-����";
		System.out.println("�ӵ�3���ַ���ȡ��ĩβ�Ľ����" + str7.substring(3));
//ʹ��substring��ȡʱ�������������������ȡֵȡ��������ҿ�����
		System.out.println("��ȡ�ӵ�3������6���Ľ����" + str7.substring(3, 6));
//		�������ַ����ָ����
		System.out.println("�ָ����ַ�������Ԫ������Ϊ��");
		String[] strArrayStrings = str7.split("-");
		for (int i = 0; i < strArrayStrings.length; i++) {
			if (i != strArrayStrings.length - 1) {
				System.out.print(strArrayStrings[i] + ",");
			} else {
				System.out.print(strArrayStrings[i]);
			}
		}

	}

}
