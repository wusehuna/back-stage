/**
 * 
 */
package yq.it.task06;

import java.util.HashSet;

/**
 * @author dell
 *
 */
class StudentList {
	String id;
	String name;

	public StudentList(String id, String name) {// 编写构造方法
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}

	// 重写toString方法(目的时为了打印出来的是它的值)
	public String toString() {
		return id + ":" + name;

	}
}

public class Example08 {
	public static void main(String[] args) {
		HashSet hashSet = new HashSet();// 创建一个HashSet集合
		// 创建学生对象
		StudentList student1 = new StudentList("1", "Jack");
		StudentList student2 = new StudentList("2", "Rose");
		StudentList student3 = new StudentList("2", "Rose");
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		System.out.println(hashSet);
	}

}
