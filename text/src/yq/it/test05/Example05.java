/**
 * 
 */
package yq.it.test05;

/**
 * @author dell 字符串的分割和截取
 *
 */
public class Example05 {
	public static void main(String[] args) {
		String str7 = "篮球-乒乓球-排球";
		System.out.println("从第3个字符截取到末尾的结果：" + str7.substring(3));
//使用substring截取时，如果是两个参数，则取值取的是左闭右开区间
		System.out.println("截取从第3个到第6个的结果：" + str7.substring(3, 6));
//		下面是字符串分割操作
		System.out.println("分割后的字符串数组元素依次为：");
		String[] strArrayStrings = str7.split("-");
		for (int i = 0; i < strArrayStrings.length; i++) {
			if (i != strArrayStrings.length - 1) {
				System.out.print(strArrayStrings[i] + ",");
			} else {
				System.out.print(strArrayStrings[i]);
			}
		}

	}

}
