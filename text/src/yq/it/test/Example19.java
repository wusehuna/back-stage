package yq.it.test;

/**
 * @author dell
 *
 */
public class Example19 {
	public static void main(String[] args) {
		int[] array = new int[] { 2, 5, 3, 89 };
		System.out.print("冒泡排序前的数组：");
		printArray(array);
		bubbleSort(array);
		System.out.print("冒泡排序后的数组：");
		printArray(array);
	}

	/*
	 * 打印数组的方法
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
	}

	/*
	 * 冒泡排序的方法
	 */
	public static void bubbleSort(int[] array) {
//		外层循环控制循环轮数
		for (int i = 0; i < array.length - 1; i++) {
//			内层循环控制比较次数
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			System.out.print("第" + (i + 1) + "轮排序后：");
			printArray(array);
		}

	}
}
