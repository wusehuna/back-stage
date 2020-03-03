package yq.it.test;

/**
 * 数组的静态初始化
 * 1.类型[] 数组名=new 类型[]{元素,元素,元素......}
 * 2.类型[] 数组名={元素,元素,元素......}
 */
public class Example17 {
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
}
