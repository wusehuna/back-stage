/**
 * 
 */
package yq.it.test;

/**
 * @author dell ����ӿ���
 *
 */
interface AnimalListSec {
	void shout();
}

class CatMiao implements AnimalListSec {

	@Override
	public void shout() {
		System.out.println("������������");

	}

	void sleep() {
		System.out.println("è˯��");
	}

}

class DogWang implements AnimalListSec {

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
public class Example0421 {
	public static void main(String[] args) {
		DogWang dog12 = new DogWang();
		animalShout(dog12);

	}

	/**
	 * ���徲̬����������һ��animal���͵Ĳ���
	 */
	/**
	 * 
	 */
	public static void animalShout(AnimalListSec animalLisStSec) {
		// TODO Auto-generated method stub
		DogWang dog13 = (DogWang) animalLisStSec;
		dog13.shout();
		dog13.sleep();

	}

}
