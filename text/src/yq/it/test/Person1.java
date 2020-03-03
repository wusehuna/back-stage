/**
 * 
 */
package yq.it.test;

/**
 * @author dell
 *
 */
public class Person1 {
	String name = "小芳";

	public Person1(String name) {
		name = "小兰";
	}

	public void show() {
		this.name = "小翠";

	}

	public static void main(String[] args) {
		Person1 p = new Person1("小凤");
		System.out.print(p.name);
		p.show();
		System.out.print(p.name);
	}
}
