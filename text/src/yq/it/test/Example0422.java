/**
 * 
 */
package yq.it.test;

/**
 * @author dell
 *
 */
/**
 * @author dell 定义接口类
 *
 */
interface AnimalListWang {
	void shout();
}

class CatMao implements AnimalListWang {

	@Override
	public void shout() {
		System.out.println("喵喵。。。。");

	}

	void sleep() {
		System.out.println("猫睡觉");
	}

}

class DogWeng implements AnimalListWang {

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
public class Example0422 {
	public static void main(String[] args) {
		DogWeng dog12 = new DogWeng();
		animalShoutWang(dog12);
	}

	/**
	 * 定义静态方法，接收一个animal类型的参数
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
