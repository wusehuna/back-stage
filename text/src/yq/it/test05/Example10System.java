/**
 * 
 */
package yq.it.test05;

/**
 * @author dell public static long currentTimeMillis()
 *         方法返回一个long类型的值，该值表示当前时间与1970年1月1日0点0分0秒之间的时间差，单位是毫秒，通常也将该值称作时间戳
 *
 */
public class Example10System {
	public static void main(String[] args) {
		// 计算程序在进行求和操作时所消耗的时间
		// 在for循环之前获取一次时间，结束后获取一次时间，差值即为消耗时间
		// 循环开始时的当前时间
		long startTime = System.currentTimeMillis();
		int sum = 0;
		for (int i = 0; i < 100000; i++) {
			sum += i;

		}
		// 循环开始时的当前时间
		long endTime = System.currentTimeMillis();
		System.out.println("当前程序运行所消耗的时间：" + (endTime - startTime) + "毫秒");

	}

}
