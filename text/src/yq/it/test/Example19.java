package yq.it.test;

/**
 * @author dell
 *
 */
public class Example19 {
	public static void main(String[] args) {
		int[] array = new int[] { 2, 5, 3, 89 };
		System.out.print("ð������ǰ�����飺");
		printArray(array);
		bubbleSort(array);
		System.out.print("ð�����������飺");
		printArray(array);
	}

	/*
	 * ��ӡ����ķ���
	 */
	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\n");
	}

	/*
	 * ð������ķ���
	 */
	public static void bubbleSort(int[] array) {
//		���ѭ������ѭ������
		for (int i = 0; i < array.length - 1; i++) {
//			�ڲ�ѭ�����ƱȽϴ���
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
			System.out.print("��" + (i + 1) + "�������");
			printArray(array);
		}

	}
}
