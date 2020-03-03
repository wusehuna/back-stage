/**
 * 
 */
package yq.it.test;

/**
 * @author dell
 *
 */
class Student {
	private String name;// 将name属性私有化
	private int age;// 将age属性私有化
	// 下面是共有的getXxx和setXxx方法

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int stuAge) {
		// 对传入的参数进行检查
		if (stuAge <= 0) {
			System.out.println("对不起，您输入的年龄不合法！");
		} else {
			age = stuAge;// 对属性赋值
		}

	}

	public void setName(String stuName) {
		name = stuName;
	}

	public void introduence() {
		System.out.println("大家好，我是" + name + ",我今年" + age + "岁");
	}

}

public class ExampleStudent {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(39);
		stu.setName("许三多");
		stu.introduence();

	}

}
