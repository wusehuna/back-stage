/**
 * 
 */
package yq.it.task06;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author dell KTV���ϵͳ
 *
 */
public class Tasl06 {
	public static void main(String[] args) {
		System.out.println("----------��ӭ�������ϵͳ");
		System.out.println("0.������������б�");
		System.out.println("1.�������ö�");
		System.out.println("2.������ǰ��һλ");
		System.out.println("3.�˳�");
		// ���������洢�����б�ļ���
		LinkedList lLinkedList = new LinkedList();
		// ���һ���ָ����������б���
		addMusicList(lLinkedList);
		while (true) {
			System.out.println("������Ҫִ�еĲ�����ţ�");
			Scanner scanner = new Scanner(System.in);
			int command = scanner.nextInt();// ���ռ�������Ĺ���ѡ�����
			// ִ����Ŷ�Ӧ�Ĺ���
			switch (command) {
			case 0:// ��Ӹ������б�
				addMusic(lLinkedList);
				break;
			case 1:// �������ö�
				setTop(lLinkedList);
				break;
			case 2:// ������ǰ��һλ
				setBefore(lLinkedList);
				break;
			case 3:// �˳�
				exit();
				break;

			default:
				System.out.println("----------");
				System.out.println("����ѡ��������������ȷ�Ĺ������");
				break;
			}
			System.out.println("��ǰ�����б�" + lLinkedList);
		}

	}

	// ��ʼʱ��Ӹ�������
	private static void addMusicList(LinkedList lLinkedList) {
		lLinkedList.add("����");
		lLinkedList.add("ҹ��");
		lLinkedList.add("ҹ�ĵ�����");
		lLinkedList.add("������Ļ�");
		lLinkedList.add("�����");
		System.out.println("��ʼ�����б�" + lLinkedList);

	}

	// ��Ӹ���
	private static void addMusic(LinkedList lLinkedList) {
		System.out.println("������Ҫ��ӵĸ������ƣ�");
		String scanner = new Scanner(System.in).nextLine();
		lLinkedList.add(scanner);// ���ָ���������б�����
		System.out.println("����Ӹ�����" + scanner);
		System.out.println("------------");

	}

	private static void setTop(LinkedList lLinkedList) {
		// �ö���˼·�����жϸø����Ƿ���ڣ�������ڣ��ȴӼ�����ɾ���ø������ٰѸø������뼯�ϵ�ͷ��
		System.out.println("������Ҫ�ö��ĸ������ƣ�");
		String musciNameString = new Scanner(System.in).nextLine();// ��ȡ������������
		int position = lLinkedList.indexOf(musciNameString);// ����ָ�������ټ����г��ֵ�λ��
		if (position < 0) {
			// �ж�����ĸ����Ƿ����
			System.out.println("��ǰ�б���û������ĸ�����");
		} else {
			// 1.�Ƴ�ָ���ĸ���
			lLinkedList.remove(musciNameString);// �Ƴ�ָ���ĸ���
			// 2.��ָ���ĸ����ŵ���һλ
			lLinkedList.addFirst(musciNameString);
		}
		System.out.println("�ѽ�����" + musciNameString + "�ö���");
	}

	private static void setBefore(LinkedList linkedList) {
		System.out.println("������Ҫǰ��һλ�ĸ�������");
		String muString = new Scanner(System.in).nextLine();
		int position1 = linkedList.indexOf(muString);
		if (position1 < 0) {
			System.out.println("��ǰ�б���û������ĸ�����");
		} else if (position1 == 0) {
			// �жϵ�ǰ�ĸ����Ƿ��Ѿ��ٵ�һ��λ��
			System.out.println("��ǰ�����Ѿ��ڶ�����");
		} else {
			// �Ƴ�ָ������
			linkedList.remove(muString);
			// ��ָ���ĸ�����ǰ�ƶ�һλ
			linkedList.add(position1 - 1, muString);
		}
		System.out.println("�ѽ�����" + muString + "ǰ����һλ��");
	}

	private static void exit() {
		System.out.println("-------�˳�---------");
		System.out.println("�����˳�ϵͳ");
		System.exit(0);// �����������е�javaϵͳ

	}
}
