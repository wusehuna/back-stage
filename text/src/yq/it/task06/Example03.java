/**
 * 
 */
package yq.it.task06;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 1.使用iterator迭代集合中的元素 2.在Collection接口中方法 3.Iterator<E> iterator
 * 获取用来遍历集合元素的迭代器对象Iterator
 *
 */
public class Example03 {
	public static void main(String[] args) {
		// 创建ArrayList集合
		ArrayList list = new ArrayList();
		// 向集合中添加元素
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		list.add("data_4");
		// 获取用来遍历集合元素的迭代器对象Iterator
		Iterator iterator = list.iterator();
		// 并指知道集合中有多少个元素，使用while循环进行循环
		while (iterator.hasNext()) {// 判断ArrayList集合中是否存在下一个元素
			// 如果有下一个元素，则取出下一个元素
			Object object = iterator.next();
			System.out.println(object);

		}

	}

}
