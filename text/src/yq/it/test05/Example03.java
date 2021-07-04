/**
 * 
 */
package yq.it.test05;

/**
 * @author dell 字符串的替换和去除空格的操作
 *
 */
public class Example03 {
	public static void main(String[] args) {
		String str3 = " i t c a s t y q";
		String str4 = "itcastyq";
		System.out.println("去除两端空格：" + str3.trim());
		System.out.println("去除所有空格：" + str3.replace(" ", ""));
		System.out.println("使用replace替换字串：" + str4.replace("it", "it.cn"));
	}

}
