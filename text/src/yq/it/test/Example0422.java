/**
 * 
 */
package yq.it.test;

/**
 * @author dell
 *
 */
/**
 * @author dell ����ӿ���
 *
 */
interface AnimalListWang {
	void shout();
}

class CatMao implements AnimalListWang {

	@Override
	public void shout() {
		System.out.println("������������");

	}

	void sleep() {
		System.out.println("è˯��");
	}

}

class DogWeng implements AnimalListWang {

	@Override
	public void shout() {
		System.out.println("����������");

	}

	/**
	 * 
	 */
	void sleep() {
		System.out.println("��˯��");

	}

}

/**
 * 
 * @author dell ����������
 *
 */
public class Example0422 {
	public static void main(String[] args) {
		DogWeng dog12 = new DogWeng();
		animalShoutWang(dog12);
	}

	/**
	 * ���徲̬����������һ��animal���͵Ĳ���
	 */
	/**
	 * 
	 */
	public static void animalShoutWang(AnimalListWang animalListWang) {
		// TODO Auto-generated method stub
		DogWeng dog13 = (DogWeng) animalListWang;
		dog13.shout();
		dog13.sleep();

	}

}
