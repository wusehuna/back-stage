/**
 * 
 */
package yq.it.test;

/**
 * @author dell
 *
 */
public class Person1 {
	String name = "С��";

	public Person1(String name) {
		name = "С��";
	}

	public void show() {
		this.name = "С��";

	}

	public static void main(String[] args) {
		Person1 p = new Person1("С��");
		System.out.print(p.name);
		p.show();
		System.out.print(p.name);
	}
}
