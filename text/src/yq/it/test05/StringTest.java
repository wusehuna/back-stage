/**
 * 
 */
package yq.it.test05;

/**
 * @author dell
 *
 */
public class StringTest {
	public static void main(String[] args) {
		// 获取子串在整串中出现的次数：
		// 定义字串和整串
		String str = "kashgoankhgolnlashgoljkadfdsghgo";
		String key = "hgo";
		// 调用方法，获取次数
		int count = getKeyStringCount(str, key);
		System.out.println("字串在整串中出现的次数" + count);

	}

	public static int getKeyStringCount(String str, String key) {
		// 定义一个计数器用于计算次数
		int count = 0;
		// 判断字符串是否包含给定字符串，如果不包含，直接退出
		if (str.contains(key)) {
			// 如果包含给定字符串，循环查找
			for (int i = 0; i < str.length(); i++) {
				// 从整串的第一个下标开始检索，如果没有找到该字符串，则返回-1
				// indexOf返回值为整串中字串所在的下标
				System.out.println("str：" + str);
				if ((i = str.indexOf(key)) != -1) {
					// 截取
					str = str.substring(i + key.length());
					System.out.println("新的str：" + str);
					count++;
				}
			}
		} else {
			return count;
		}
		return count;

	}

}
