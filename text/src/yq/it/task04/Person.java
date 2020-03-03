/**
 * 
 */
package yq.it.task04;

/**
 * @author dell
 *
 */
public class Person {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 购物的方法
	Product shopping(Market market, String name) {
		return market.sell(name);
	}

}
