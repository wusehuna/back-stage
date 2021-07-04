/**
 * 
 */
package yq.it.task06;

import java.util.HashSet;

/**
 * @author dell
 *
 */
class Student {
	String id;
	String name;

	public Student(String id, String name) {// 编写构造方法
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	// 重写toString方法(目的时为了打印出来的是它的值)
	public String toString() {
		return id + ":" + name;

	}
}

public class Example07 {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();// 创建一个HashSet集合
		// 创建学生对象
		Student student1 = new Student("1", "Jack");
		Student student2 = new Student("2", "Rose");
		Student student3 = new Student("2", "Rose");
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		System.out.println(hashSet);

	}

}
