package yq.it.test;

/**
 * 数组操作
 * 1.数组遍历
 * 2.数组最值
 * 3.数组冒泡排序
 * 4.数组选择排序
 */
public class Example18 {
	/**
	 * @param num
	 * 1.数组遍历
	 * 当参数是一个数组时，参数应该是 类型[] 数组名
	 */
	public static void traverse(int[] num) {
		for(int i=0;i<num.length;i++) {
			System.out.println("该数组的变量都有："+" "+" "+num[i]);
		}
	}
//
	/**
	 * @param num
	 * @return max
	 * 2.数组最值
	 *  方法有返回值时，在主函数里面应该定义一个变量来接收该返回值
	 */
	public static int getMax(int[] num) {
		int max=num[0];
		for(int i=1;i<num.length;i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr1=new int[]{89,74,100,25};
		traverse(arr1);
		int maxNum=getMax(arr1);
		System.out.println("这个数组中最大的数字是："+maxNum);

	}

}
