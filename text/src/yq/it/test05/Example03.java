/**
 * 
 */
package yq.it.test05;

/**
 * @author dell �ַ������滻��ȥ���ո�Ĳ���
 *
 */
public class Example03 {
	public static void main(String[] args) {
		String str3 = " i t c a s t y q";
		String str4 = "itcastyq";
		System.out.println("ȥ�����˿ո�" + str3.trim());
		System.out.println("ȥ�����пո�" + str3.replace(" ", ""));
		System.out.println("ʹ��replace�滻�ִ���" + str4.replace("it", "it.cn"));
	}

}
