/**
 * 
 */
package yq.it.test05;

/**
 * @author dell String ��һЩ��������
 *
 */
public class Example01 {
	public static void main(String[] args) {
		String string = "aeongmahdkngaesonnaedsa";
		String str2 = "abcdefg";
		System.out.println("�ַ�c���ַ�����һ�γ��ֵ�λ�ã�" + string.indexOf('c'));
		System.out.println("��ȡ�ַ�����" + str2.subSequence(2, 5));
		System.out.println("��ȡ�ַ����ĳ��ȣ�" + string.length());
		System.out.println("�ַ�n���һ�γ��ֵ�λ�ã�" + string.lastIndexOf('n'));
		System.out.println("���ַ�����һ�γ��ֵ�λ�ã�" + string.indexOf("ae"));
		System.out.println("���ַ������һ�γ��ֵ�λ�ã�" + string.lastIndexOf("ae"));
	}

}
