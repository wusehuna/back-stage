/**
 * 
 */
package yq.it.test05;

/**
 * @author dell �ַ������жϲ���
 *
 */
public class Example04 {
	public static void main(String[] args) {
		String str5 = "string";
		String str6 = "string";
		System.out.println("�ж��Ƿ���str��ͷ��" + str5.startsWith("str"));
		System.out.println("�ж�������str��β��" + str5.endsWith("str"));
		System.out.println("�ж��Ƿ����ng��" + str5.contains("ng"));
		System.out.println("�ж��ַ����Ƿ�Ϊ�գ�" + str5.isEmpty());
		System.out.println("�ж������ַ��Ƿ���ȣ�"+str5.equals(str6));
	}

}
