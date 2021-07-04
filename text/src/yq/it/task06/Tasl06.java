/**
 * 
 */
package yq.it.task06;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author dell KTV点歌系统
 *
 */
public class Tasl06 {
	public static void main(String[] args) {
		System.out.println("----------欢迎来到点歌系统");
		System.out.println("0.将歌曲添加至列表");
		System.out.println("1.将歌曲置顶");
		System.out.println("2.将歌曲前移一位");
		System.out.println("3.退出");
		// 创建用来存储歌曲列表的集合
		LinkedList lLinkedList = new LinkedList();
		// 添加一部分歌曲至歌曲列表中
		addMusicList(lLinkedList);
		while (true) {
			System.out.println("请输入要执行的操作序号：");
			Scanner scanner = new Scanner(System.in);
			int command = scanner.nextInt();// 接收键盘输入的功能选项序号
			// 执行序号对应的功能
			switch (command) {
			case 0:// 添加歌曲至列表
				addMusic(lLinkedList);
				break;
			case 1:// 将歌曲置顶
				setTop(lLinkedList);
				break;
			case 2:// 将歌曲前移一位
				setBefore(lLinkedList);
				break;
			case 3:// 退出
				exit();
				break;

			default:
				System.out.println("----------");
				System.out.println("功能选择有误，请输入正确的功能序号");
				break;
			}
			System.out.println("当前歌曲列表：" + lLinkedList);
		}

	}

	// 初始时添加歌曲名称
	private static void addMusicList(LinkedList lLinkedList) {
		lLinkedList.add("稻香");
		lLinkedList.add("夜曲");
		lLinkedList.add("夜的第七章");
		lLinkedList.add("听妈妈的话");
		lLinkedList.add("龙卷风");
		System.out.println("初始歌曲列表：" + lLinkedList);

	}

	// 添加歌曲
	private static void addMusic(LinkedList lLinkedList) {
		System.out.println("请输入要添加的歌曲名称：");
		String scanner = new Scanner(System.in).nextLine();
		lLinkedList.add(scanner);// 添加指定歌曲至列表的最后
		System.out.println("已添加歌曲：" + scanner);
		System.out.println("------------");

	}

	private static void setTop(LinkedList lLinkedList) {
		// 置顶的思路，先判断该歌曲是否存在，如果存在，先从集合中删除该歌曲，再把该歌曲插入集合的头部
		System.out.println("请输入要置顶的歌曲名称：");
		String musciNameString = new Scanner(System.in).nextLine();// 获取键盘输入内容
		int position = lLinkedList.indexOf(musciNameString);// 查找指定歌曲再集合中出现的位置
		if (position < 0) {
			// 判断输入的歌曲是否存在
			System.out.println("当前列表中没有输入的歌曲！");
		} else {
			// 1.移除指定的歌曲
			lLinkedList.remove(musciNameString);// 移除指定的歌曲
			// 2.将指定的歌曲放到第一位
			lLinkedList.addFirst(musciNameString);
		}
		System.out.println("已将歌曲" + musciNameString + "置顶！");
	}

	private static void setBefore(LinkedList linkedList) {
		System.out.println("请输入要前移一位的歌曲名称");
		String muString = new Scanner(System.in).nextLine();
		int position1 = linkedList.indexOf(muString);
		if (position1 < 0) {
			System.out.println("当前列表中没有输入的歌曲！");
		} else if (position1 == 0) {
			// 判断当前的歌曲是否已经再第一个位置
			System.out.println("当前歌曲已经在顶部！");
		} else {
			// 移除指定歌曲
			linkedList.remove(muString);
			// 将指定的歌曲往前移动一位
			linkedList.add(position1 - 1, muString);
		}
		System.out.println("已将歌曲" + muString + "前移了一位！");
	}

	private static void exit() {
		System.out.println("-------退出---------");
		System.out.println("您已退出系统");
		System.exit(0);// 结束正在运行的java系统

	}
}
