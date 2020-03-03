/**
 * 
 */
package yq.it.test;

/**
 * @author dell
 * 使用super关键字访问父类的构造方法
 *
 */
/**
 * 
 * @author dell 定义一个AnimalList父类
 *
 */
class AnimalList {
	// 定义父类的构造方法
	public AnimalList(String name) {
		System.out.println("我是一只" + name);
	}

	public AnimalList() {
		System.out.println("我是一只动物");

	}

}

/**
 * 
 * @author dell 定义一个Cat子类继承AnimalList父类
 *
 */
class Cat extends AnimalList {
	public Cat() {
		// super("狸花猫");
	}

}

/**
 * 
 * @author dell 测试类
 *
 */
public class Example0404 {
	public static void main(String[] args) {
		Cat cat = new Cat();
	}

}
