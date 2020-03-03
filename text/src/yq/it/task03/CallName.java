package yq.it.task03;

import java.util.Random;
import java.util.Scanner;

/**
 * 随机点名器
 * 1.录入全班同学的姓名
 * 2.浏览全班同学姓名
 * 3.随机点名
 *
 */
public class CallName {
	
	/**
	 * 1.存储全班同学的姓名
	 */
	public static void addStudentName(String[] students){
//		通过键盘输入多个学生的姓名并且存储到容器中
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<students.length;i++){
			System.out.println("存储第"+(i+1)+"个姓名");
			students[i]=sc.next();
		}
		sc.close();
	}
	
	/**
	 * @param students
	 * 2.遍历全班同学姓名
	 */
	public static void printStudentName(String[] students) {
//		遍历数组，得到每个同学的姓名
		for(int i=0;i<students.length;i++) {
			String name=students[i];
			System.out.println("第"+(i+1)+"个学生姓名："+name);
		}
	}
	public static String guessName(String[] students) {
//		根据数组长度获得随机索引
		int index=new Random().nextInt(students.length);
		String name=students[index];
		return name;
	}
	public static void main(String[] args) {
//		数组静态初始化
		String[] students=new String[4];
		addStudentName(students);
		printStudentName(students);	
		String name=guessName(students);	
		System.out.println("被随机点到的学生姓名是："+name);
	}

}
