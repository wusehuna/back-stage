/**
 * 
 */
package yq.it.test05;

import java.util.Random;

/**
 * 使用构造方法Random()产生随机数
 * 
 * public int nextInt(int n) 产生一个0-n之间的随机整数【包括0不包括n】
 *
 */
public class Example16 {
	public static void main(String[] args) {
		Random rmRandom = new Random();
		// 随机产生10个[0-100]之间的整数
		for (int i = 0; i < 10; i++) {
			System.out.println(rmRandom.nextInt(100));
		}
	}
}
