/**
 * 
 */
package yq.it.test;

/**
 * @author dell
 *
 */

abstract class Car {
	public void run() {
		System.out.println("car run...");
	}
}

public class Example0424 {
	public static void main(String[] args) {

		Example0424 demo = new Example0424();
		demo.show(new Car() {
			public void run() {
				System.out.println("demo run");
			}
		});
	}

	public void show(Car c) {
		c.run();
	}

}
