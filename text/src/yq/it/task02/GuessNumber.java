package yq.it.task02;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
//		1.ͨ��Random���е�nextInt��int n������������һ��0~9�������
		int randNumber=new Random().nextInt(10);
		System.out.println("������Ѿ�����");
//		2.����µ�����
		System.out.println("�����������µ�����");
		Scanner sc=new Scanner(System.in);
		int enterNumber=sc.nextInt();
//		3.ͨ��ѭ���ж�
		while(enterNumber!=randNumber) {
			if(enterNumber>randNumber) {
				System.out.println("������˼�����µ����ִ���");
			}else {
				System.out.println("������˼�����µ�����С��");
			}
			System.out.println("���������µ�����");
			enterNumber=sc.nextInt();
		}
		System.out.println("��ϲ���������");
		
	}

}
