/**
 * 
 */
package yq.it.test05;

import java.util.Random;

/**
 *
 * 
 * Random类中的常用方法
 * 
 * public float nextFloat() 随机生成0.0-1.0之间的float小数
 * 
 * public double nextDouble() 随机生成0.0-1.0之间的double小数
 * 
 * public int nextInt(int n)
 *
 */
public class Example18 {
	public static void main(String[] args) {
		Random rmRandom = new Random();
		System.out.println("产生的float类型随机数：" + rmRandom.nextFloat());

		System.out.println("产生的double类型随机数：" + rmRandom.nextDouble());

		System.out.println("产生的0-100int类型随机数：" + rmRandom.nextInt(100));

	}

}
