/**
 * 
 */
package yq.it.test05;

/**
 * arraycopy(Object src,int srcpos,object dest,int destPos,int length)
 * arraycopy()方法用于将一个数组中的元素快速拷贝到另一个数组，其中的参数具体作用如下： src:表示源数组 dest:表示目标数组
 * scrPos:表示原数组中拷贝元素的起始位置 destPos:表示拷贝到目标数组的起始位置 length:表示拷贝元素的个数
 *
 */
public class Example11System {
	public static void main(String[] args) {
		int[] fromArray = { 101, 102, 103, 104, 105, 106 };// 源数组
		int[] toArray = { 201, 202, 203, 204, 205, 206 };// 目标数组
		// 拷贝数组元素，从fromArray数组2角标位置开始，拷贝4个元素，到toArray数组3角标位置
		System.arraycopy(fromArray, 2, toArray, 2, 4);
		for (int i = 0; i < toArray.length; i++) {
			System.out.println(i + ":" + toArray[i]);
		}

	}

}
