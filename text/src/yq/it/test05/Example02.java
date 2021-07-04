/**
 * 
 */
package yq.it.test05;

/**
 * @author dell 字符串的转换操作
 *
 */
public class Example02 {
	public static void main(String[] args) {
		String str1 = "anglamga";
		System.out.println("将字符串转换成字符数组的结果：");
		char[] charArray = str1.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (i != charArray.length - 1) {
				System.out.print(charArray[i] + ",");
			} else {
				System.out.print(charArray[i]);
			}

		}
		System.out.println(" ");
		System.out.println("将int值转化为String类型之后的结果：" + String.valueOf(12));
		System.out.println("将str1转换成大写：" + str1.toUpperCase());
	}

}
