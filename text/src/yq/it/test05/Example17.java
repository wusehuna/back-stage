/**
 * 
 */
package yq.it.test05;

import java.util.Random;

/**
 * @author dell
 * 
 *         ���췽��Random(long seed)���������
 *
 */
public class Example17 {
	public static void main(String[] args) {
		Random rmRandom = new Random(13);
		// �������10��[0-100]֮�������
		for (int i = 0; i < 10; i++) {
			System.out.println(rmRandom.nextInt(100));
		}

	}

}
