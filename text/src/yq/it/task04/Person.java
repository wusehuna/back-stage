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

	// ����ķ���
	Product shopping(Market market, String name) {
		return market.sell(name);
	}

}
