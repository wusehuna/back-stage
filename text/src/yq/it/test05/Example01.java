/**
 * 
 */
package yq.it.test05;

/**
 * @author dell String 的一些基本操作
 *
 */
public class Example01 {
	public static void main(String[] args) {
		String string = "aeongmahdkngaesonnaedsa";
		String str2 = "abcdefg";
		System.out.println("字符c在字符串第一次出现的位置：" + string.indexOf('c'));
		System.out.println("截取字符串：" + str2.subSequence(2, 5));
		System.out.println("获取字符串的长度：" + string.length());
		System.out.println("字符n最后一次出现的位置：" + string.lastIndexOf('n'));
		System.out.println("子字符串第一次出现的位置：" + string.indexOf("ae"));
		System.out.println("子字符串最后一次出现的位置：" + string.lastIndexOf("ae"));
	}

}
