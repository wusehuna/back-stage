/**
 * 
 */
package yq.it.task06;

import java.util.ArrayList;

/**
 * foreachѭ���������������ϻ�����Ԫ�� ��ʽ for (������Ԫ�� ��ʱ��������������){ ִ�����}
 *
 */
public class Example04 {
	public static void main(String[] args) {
		// ����ArrayList����
		ArrayList arrayList = new ArrayList();
		arrayList.add("Rose");
		arrayList.add("Jack");
		arrayList.add("Tom");
		// ����foreach����Ԫ�صı���
		for (Object object : arrayList) {
			// object ��¼��arrayList�����е�Ԫ��
			System.out.println(object);

		}
	}

}
