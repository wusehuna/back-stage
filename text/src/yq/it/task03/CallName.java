package yq.it.task03;

import java.util.Random;
import java.util.Scanner;

/**
 * ���������
 * 1.¼��ȫ��ͬѧ������
 * 2.���ȫ��ͬѧ����
 * 3.�������
 *
 */
public class CallName {
	
	/**
	 * 1.�洢ȫ��ͬѧ������
	 */
	public static void addStudentName(String[] students){
//		ͨ������������ѧ�����������Ҵ洢��������
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<students.length;i++){
			System.out.println("�洢��"+(i+1)+"������");
			students[i]=sc.next();
		}
		sc.close();
	}
	
	/**
	 * @param students
	 * 2.����ȫ��ͬѧ����
	 */
	public static void printStudentName(String[] students) {
//		�������飬�õ�ÿ��ͬѧ������
		for(int i=0;i<students.length;i++) {
			String name=students[i];
			System.out.println("��"+(i+1)+"��ѧ��������"+name);
		}
	}
	public static String guessName(String[] students) {
//		�������鳤�Ȼ���������
		int index=new Random().nextInt(students.length);
		String name=students[index];
		return name;
	}
	public static void main(String[] args) {
//		���龲̬��ʼ��
		String[] students=new String[4];
		addStudentName(students);
		printStudentName(students);	
		String name=guessName(students);	
		System.out.println("������㵽��ѧ�������ǣ�"+name);
	}

}
