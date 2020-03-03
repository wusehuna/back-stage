/**
 * 
 */
package yq.it.task04;

/**
 * @author dell
 *
 */
public class Test {
	public static void main(String[] args) {
		// 定义商品类，给商品名称属性赋值
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		p1.setPorName("豆浆机");
		p2.setPorName("电视机");
		p3.setPorName("微波炉");
		p4.setPorName("酸奶机");
		p5.setPorName("吹风机");

		// 定义超市类，给超市名称赋值，给仓库赋值
		Market market = new Market();
		market.setmarkName("大润发");
		market.setproductArr(new Product[] { p1, p2, p3, p4, p5 });

		// 创建购买人的对象，给购买人的名字赋值
		Person person = new Person();
		person.setName("韩明明");

		// 调用购买的方法，指定超市名和商品名，得到购买 结果
		Product result = person.shopping(market, "发电机");
		// 根据结果进行判断
		if (result != null) {
			System.out.println(person.getName() + "在" + market.getmarkName() + "买到了" + result.getProName());
		} else {
			System.out.println(person.getName() + "白跑了一趟，在" + market.getmarkName() + "什么也没有买到");
		}

	}

}
