/**
 * 
 */
package yq.it.test;

/**
 * @author dell 定义接口类
 *
 */
interface AnimalListSec {
	void shout();
}

class CatMiao implements AnimalListSec {

	@Override
	public void shout() {
		System.out.println("喵喵。。。。");

	}

	void sleep() {
		System.out.println("猫睡觉");
	}

}

class DogWang implements AnimalListSec {

	@Override
	public void shout() {
		System.out.println("往往。。。");

	}

	/**
	 * 
	 */
	void sleep() {
		System.out.println("狗睡觉");

	}

}

/**
 * 
 * @author dell 创建测试类
 *
 */
public class Example0421 {
	public static void main(String[] args) {
		DogWang dog12 = new DogWang();
		animalShout(dog12);

	}

	/**
	 * 定义静态方法，接收一个animal类型的参数
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
