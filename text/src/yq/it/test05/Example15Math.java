/**
 * 
 */
package yq.it.test05;

/**
 * 
 * Math类的常用方法
 * 
 * public static int abs(int a) 返回 参数的绝对值。 注意，如果参数等于 Integer.MIN_VALUE
 * 的值（即能够表示的最小负 int 值），那么结果与该值相同且为负。
 * 
 * public static double ceil(double a) 返回大于参数的最小的整数【如果参数值已经等于某个整数，那么结果与该参数相同。
 * 如果参数为 NaN、无穷大、正 0 或负 0，那么结果与参数相同。 如果参数值小于 0，但是大于 -1.0，那么结果为负 0】
 * 
 * public static double floor(double a)返回小于参数的最大整数【如果参数值已经等于某个整数，那么结果与该参数相同。
 * 如果参数为 NaN、无穷大、正 0 或负 0，那么结果与参数相同。】
 * 
 * public static int round(float a) 四舍五入【如果结果为负无穷大或任何小于等于 Integer.MIN_VALUE
 * 的值，那么结果等于 Integer.MIN_VALUE 的值。 如果参数为正无穷大或任何大于等于 Integer.MAX_VALUE 的值，那么结果等于
 * Integer.MAX_VALUE 的值。】
 * 
 * public static int max(int a, int b) 返回两个 int 值中较大的一个。
 * 
 * public static int min(int a, int b) 返回两个 int 值中较小的一个
 * 
 * public static double random() 返回大于等于 0.0 且小于1.0的随机小数
 *
 */
public class Example15Math {
	public static void main(String[] args) {
		// 该方法是一个静态方法，所以可以通过类名的方式直接输出
		System.out.println("计算绝对值后的结果:" + Math.abs(-60));
		// 返回大于参数的最小整数值
		System.out.println("求大于参数的最小整数：" + Math.ceil(-11.9));
		// 返回小于参数的最大整数
		System.out.println("小于参数的最大整数：" + Math.floor(-20.4));
		// 四舍五入
		System.out.println("四舍五入：" + Math.round(5.8));
		// 返回两个数的大值
		System.out.println("求两个数的较大值：" + Math.max(-6.8, -8.9));
		// 返回两个数的小值
		System.out.println("求两个数的较大值：" + Math.min(-6.8, -8.9));
		// 返回随机小数
		System.out.println("随机小数：" + Math.random());
	}

}
