/**
 * 
 */
package yq.it.task06;

import java.util.ArrayList;

/**
 * foreach循环：用来遍历集合或数组元素 格式 for (容器中元素 临时变量：容器变量){ 执行语句}
 *
 */
public class Example04 {
	public static void main(String[] args) {
		// 创建ArrayList集合
		ArrayList arrayList = new ArrayList();
		arrayList.add("Rose");
		arrayList.add("Jack");
		arrayList.add("Tom");
		// 采用foreach进行元素的遍历
		for (Object object : arrayList) {
			// object 记录着arrayList集合中的元素
			System.out.println(object);

		}
	}

}
