/**
 * 
 */
package yq.it.task04;

/**
 * @author dell ���峬���� ������������ �������� ���еĲֿ⣬�洢��Ʒ[] �ۻ�����
 *
 */
public class Market {
	private String markName;
	private Product[] productArr;

	public String getmarkName() {
		return markName;
	}

	public void setmarkName(String markName) {
		this.markName = markName;

	}

	public Product[] getProducts() {
		return productArr;
	}

	public void setproductArr(Product[] productArr) {
		this.productArr = productArr;
	}

	// �����ķ���
	Product sell(String name) {// ������ָ����Ʒ��
		for (int i = 0; i < productArr.length; i++) {
			if (productArr[i].getProName() == name) {
				return productArr[i];
			}
		}
		return null;
	}
}
