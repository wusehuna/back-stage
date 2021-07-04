/**
 * 
 */
package yq.it.task06;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author dell HashSet集合的用法
 *
 */
public class Example06 {
	public static void main(String[] args) {
		// 创建HashSet集合
		HashSet hashSet = new HashSet();
		hashSet.add("Jack");
		hashSet.add("Rose");
		hashSet.add("Back");
		hashSet.add("Rose");// 向集合中添加重复元素
		Iterator iterator = hashSet.iterator();
		while (iterator.hasNext()) {// 通过while循环，判断集合中是否有元素
			Object object = iterator.next();// 如果有元素，则通过迭代器的next()方法获取新元素
			System.out.println(object);

		}

	}

}
