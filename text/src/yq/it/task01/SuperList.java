package yq.it.task01;

/**
 * 商城库存清单程序设计
 * 打印出库存中每种商品的详细信息以及所有商品的汇总信息
 * 命名规范：包名：一般都是公司域名反写；包名所有字母小写
 * 		      类名：所有字母大写
 *
 */
public class SuperList {
	public static void main(String[] args) {
//		苹果笔记本电脑
		String macBrand="MacBookAir";
		double macSize=13.3;
		double macPrice=6988.88;
		String macConfig="i5处理器4GB内存128G固态硬盘";
		int macCount=5;
//联想笔记本电脑
		String thinkPadBrand="thinkPadBookAir";
		double thinkPadSize=14.0;
		double thinkPadPrice=5999.99;
		String thinkPadConfig="i5处理器4GB内存500G硬盘";
		int thinkPadCount=10;
//华硕笔记本电脑
		String ASUSBrand="ASUSBookAir";
		double ASUSSize=15.6;
		double ASUSPrice=4999.5;
		String ASUSConfig="i7处理器4GB内存128G固态硬盘";
		int ASUSCount=18;
//		列表顶部
		System.out.println("-------------------------商城库存清单---------------------------------");
	    System.out.println("品牌型号                               尺寸                 价格                   配置                                                 库存数");
//	    列表中部
	    System.out.println(macBrand+"        "+macSize+"   "+macPrice+"   "+macConfig+"       "+macCount);
	    System.out.println(thinkPadBrand+"   "+thinkPadSize+"   "+thinkPadPrice+"   "+thinkPadConfig+"              "+thinkPadCount);
	    System.out.println(ASUSBrand+"       "+ASUSSize+"   "+ASUSPrice+"    "+ASUSConfig+"       "+ASUSCount);
	    System.out.println("-------------------------------------------------------------------");
	    System.out.println("商品总库存数："+(macCount+thinkPadCount+ASUSCount));
	    System.out.println("商品总金额数："+(macPrice*macCount+thinkPadPrice*thinkPadCount+ASUSPrice*ASUSCount));

	}
}
