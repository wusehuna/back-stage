/**
 * 
 */
package yq.it.test;

/**
 * @author dell
 *
 */
public class Example0423 {
	public static void main(String[] args) {
		new Father() {
			public void show() {
				System.out.println("helloworld");
			}
		}.show();
		;

	}

}

class Father {
	public void show() {
		System.out.println("hellofather");
	}
}
