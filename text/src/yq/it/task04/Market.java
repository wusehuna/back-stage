/**
 * 
 */
package yq.it.task04;

/**
 * @author dell 定义超市类 描述超市事物 超市名字 超市的仓库，存储商品[] 售货方法
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

	// 卖货的方法
	Product sell(String name) {// 卖货，指定商品名
		for (int i = 0; i < productArr.length; i++) {
			if (productArr[i].getProName() == name) {
				return productArr[i];
			}
		}
		return null;
	}
}
