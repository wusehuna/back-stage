package yq.it.task02;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
//		1.通过Random类中的nextInt（int n）方法，生成一个0~9的随机数
		int randNumber=new Random().nextInt(10);
		System.out.println("随机数已经生成");
//		2.输入猜的数字
		System.out.println("请您输入您猜的数字");
		Scanner sc=new Scanner(System.in);
		int enterNumber=sc.nextInt();
//		3.通过循环判断
		while(enterNumber!=randNumber) {
			if(enterNumber>randNumber) {
				System.out.println("不好意思，您猜的数字大了");
			}else {
				System.out.println("不好意思，您猜的数字小了");
			}
			System.out.println("请输入您猜的数字");
			enterNumber=sc.nextInt();
		}
		System.out.println("恭喜您，答对了");
		
	}

}
