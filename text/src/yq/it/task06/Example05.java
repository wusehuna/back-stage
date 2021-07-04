/**
 * 
 */
package yq.it.task06;

/**
 * foreach循环与普通for循环的区别
 * 
 * @author dell
 *
 */
public class Example05 {
	public static void main(String[] args) {

		String[] strings = { "aaa", "bbb", "ccc" };
		// foreach 循环遍历数组
		for (String string : strings) {
			string = "ddd";
		}
		System.out.println("foreach循环后的结果：" + strings[0] + "," + strings[1] + "," + strings[2]);
		// 普通for循环遍历数组
		for (int i = 0; i < strings.length; i++) {
			strings[i] = "ddd";

		}
		System.out.println("普通for循环后的结果：" + strings[0] + "," + strings[1] + "," + strings[2]);
	}

}
