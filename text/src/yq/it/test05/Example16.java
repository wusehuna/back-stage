/**
 * 
 */
package yq.it.test05;

import java.util.Random;

/**
 * ʹ�ù��췽��Random()���������
 * 
 * public int nextInt(int n) ����һ��0-n֮����������������0������n��
 *
 */
public class Example16 {
	public static void main(String[] args) {
		Random rmRandom = new Random();
		// �������10��[0-100]֮�������
		for (int i = 0; i < 10; i++) {
			System.out.println(rmRandom.nextInt(100));
		}
	}
}
