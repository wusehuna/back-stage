/**
 * 
 */
package yq.it.test;

/**
 * @author dell super 关键字 使用super关键字访问父类的成员变量和方法 super.成员变量
 *         super.成员方法([参数1,参数2,....])
 *
 */
/**
 * 
 * 定义Animal类作为父类
 *
 */
class Animal {
	String name = "动物";

	void shout() {
		System.out.println("动物发出叫声");

	}
}

//Dog类继承父类Animal，需要使用extends
class Dog extends Animal {
	String name = "沙皮狗";

	// 重写父类的shout()方法
	void shout() {
		super.shout();//
	}

	void printName() {
		System.out.println("name=" + super.name);
	}
}

/**
 * 
 * 定义测试类
 *
 */
public class Example0403 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.shout();
		dog.printName();
	}

}
