/**
 * 
 */
package yq.it.test;

/**
 * @author dell
 *
 */
class Student {
	private String name;// ��name����˽�л�
	private int age;// ��age����˽�л�
	// �����ǹ��е�getXxx��setXxx����

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int stuAge) {
		// �Դ���Ĳ������м��
		if (stuAge <= 0) {
			System.out.println("�Բ�������������䲻�Ϸ���");
		} else {
			age = stuAge;// �����Ը�ֵ
		}

	}

	public void setName(String stuName) {
		name = stuName;
	}

	public void introduence() {
		System.out.println("��Һã�����" + name + ",�ҽ���" + age + "��");
	}

}

public class ExampleStudent {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setAge(39);
		stu.setName("������");
		stu.introduence();

	}

}
