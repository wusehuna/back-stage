/**
 * 
 */
package yq.it.task06;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author dell HashSet���ϵ��÷�
 *
 */
public class Example06 {
	public static void main(String[] args) {
		// ����HashSet����
		HashSet hashSet = new HashSet();
		hashSet.add("Jack");
		hashSet.add("Rose");
		hashSet.add("Back");
		hashSet.add("Rose");// �򼯺�������ظ�Ԫ��
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {// ͨ��whileѭ�����жϼ������Ƿ���Ԫ��
			Object object = iterator.next();// �����Ԫ�أ���ͨ����������next()������ȡ��Ԫ��
			System.out.println(object);

		}

	}

}
