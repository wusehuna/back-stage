/**
 * 
 */
package yq.it.task06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 1.ʹ��iterator���������е�Ԫ�� 2.��Collection�ӿ��з��� 3.Iterator<E> iterator
 * ��ȡ������������Ԫ�صĵ���������Iterator
 *
 */
public class Example03 {
	public static void main(String[] args) {
		// ����ArrayList����
		ArrayList list = new ArrayList();
		// �򼯺������Ԫ��
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		// ��ȡ������������Ԫ�صĵ���������Iterator
		Iterator iterator = list.iterator();
		// ��ָ֪���������ж��ٸ�Ԫ�أ�ʹ��whileѭ������ѭ��
		while (iterator.hasNext()) {// �ж�ArrayList�������Ƿ������һ��Ԫ��
			// �������һ��Ԫ�أ���ȡ����һ��Ԫ��
			Object object = iterator.next();
			System.out.println(object);

		}

	}

}
