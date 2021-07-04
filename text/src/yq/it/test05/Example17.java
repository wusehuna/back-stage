/**
 * 
 */
package yq.it.test05;

import java.util.Random;

/**
 * @author dell
 * 
 *         构造方法Random(long seed)产生随机数
 *
 */
public class Example17 {
	public static void main(String[] args) {
		Random rmRandom = new Random(13);
		// 随机产生10个[0-100]之间的整数
		for (int i = 0; i < 10; i++) {
			System.out.println(rmRandom.nextInt(100));
		}

	}

}
