/**
 * 
 */
package yq.it.test;

/**
 * @author dell super �ؼ��� ʹ��super�ؼ��ַ��ʸ���ĳ�Ա�����ͷ��� super.��Ա����
 *         super.��Ա����([����1,����2,....])
 *
 */
/**
 * 
 * ����Animal����Ϊ����
 *
 */
class Animal {
	String name = "����";

	void shout() {
		System.out.println("���﷢������");

	}
}

//Dog��̳и���Animal����Ҫʹ��extends
class Dog extends Animal {
	String name = "ɳƤ��";

	// ��д�����shout()����
	void shout() {
		super.shout();//
	}

	void printName() {
		System.out.println("name=" + super.name);
	}
}

/**
 * 
 * ���������
 *
 */
public class Example0403 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.shout();
		dog.printName();
	}

}
