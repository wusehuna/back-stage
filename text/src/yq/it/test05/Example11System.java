/**
 * 
 */
package yq.it.test05;

/**
 * arraycopy(Object src,int srcpos,object dest,int destPos,int length)
 * arraycopy()�������ڽ�һ�������е�Ԫ�ؿ��ٿ�������һ�����飬���еĲ��������������£� src:��ʾԴ���� dest:��ʾĿ������
 * scrPos:��ʾԭ�����п���Ԫ�ص���ʼλ�� destPos:��ʾ������Ŀ���������ʼλ�� length:��ʾ����Ԫ�صĸ���
 *
 */
public class Example11System {
	public static void main(String[] args) {
		int[] fromArray = { 101, 102, 103, 104, 105, 106 };// Դ����
		int[] toArray = { 201, 202, 203, 204, 205, 206 };// Ŀ������
		// ��������Ԫ�أ���fromArray����2�Ǳ�λ�ÿ�ʼ������4��Ԫ�أ���toArray����3�Ǳ�λ��
		System.arraycopy(fromArray, 2, toArray, 2, 4);
		for (int i = 0; i < toArray.length; i++) {
			System.out.println(i + ":" + toArray[i]);
		}

	}

}
