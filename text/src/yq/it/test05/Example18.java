/**
 * 
 */
package yq.it.test05;

import java.util.Random;

/**
 *
 * 
 * Random���еĳ��÷���
 * 
 * public float nextFloat() �������0.0-1.0֮���floatС��
 * 
 * public double nextDouble() �������0.0-1.0֮���doubleС��
 * 
 * public int nextInt(int n)
 *
 */
public class Example18 {
	public static void main(String[] args) {
		Random rmRandom = new Random();
		System.out.println("������float�����������" + rmRandom.nextFloat());

		System.out.println("������double�����������" + rmRandom.nextDouble());

		System.out.println("������0-100int�����������" + rmRandom.nextInt(100));

	}

}
