/**
 * 
 */
package yq.it.task06;

/**
 * foreachѭ������ͨforѭ��������
 * 
 * @author dell
 *
 */
public class Example05 {
	public static void main(String[] args) {

		String[] strings = { "aaa", "bbb", "ccc" };
		// foreach ѭ����������
		for (String string : strings) {
			string = "ddd";
		}
		System.out.println("foreachѭ����Ľ����" + strings[0] + "," + strings[1] + "," + strings[2]);
		// ��ͨforѭ����������
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "ddd";

		}
		System.out.println("��ͨforѭ����Ľ����" + strings[0] + "," + strings[1] + "," + strings[2]);
	}

}
