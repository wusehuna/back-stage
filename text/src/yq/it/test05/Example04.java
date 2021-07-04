/**
 * 
 */
package yq.it.test05;

/**
 * @author dell 字符串的判断操作
 *
 */
public class Example04 {
	public static void main(String[] args) {
		String str5 = "string";
		String str6 = "string";
		System.out.println("判断是否以str开头：" + str5.startsWith("str"));
		System.out.println("判断是由以str结尾：" + str5.endsWith("str"));
		System.out.println("判断是否包含ng：" + str5.contains("ng"));
		System.out.println("判断字符串是否为空：" + str5.isEmpty());
		System.out.println("判断两个字符是否相等："+str5.equals(str6));
	}

}
