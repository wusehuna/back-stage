/**
 * 
 */
package yq.it.test;

/**
 * @author dell
 * ʹ��super�ؼ��ַ��ʸ���Ĺ��췽��
 *
 */
/**
 * 
 * @author dell ����һ��AnimalList����
 *
 */
class AnimalList {
	// ���常��Ĺ��췽��
	public AnimalList(String name) {
		System.out.println("����һֻ" + name);
	}

	public AnimalList() {
		System.out.println("����һֻ����");

	}

}

/**
 * 
 * @author dell ����һ��Cat����̳�AnimalList����
 *
 */
class Cat extends AnimalList {
	public Cat() {
		// super("�껨è");
	}

}

/**
 * 
 * @author dell ������
 *
 */
public class Example0404 {
	public static void main(String[] args) {
		Cat cat = new Cat();
	}

}
