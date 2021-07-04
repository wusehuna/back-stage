/**
 * StringBuffer的构造方法
 * 1.public StringBuffer()空参构造方法
 * 2.public StringBuffer(String data)创建带有内容的字符串缓冲区
 * 
 * 
 * StringBuffer类的常用方法：
 * public StringBuffer append(Sting str) 向字符串缓冲区的末尾添加数据，返回当前的StringBuffer对象自身
 * public StringBuffer insert(int index,string str) 将字符串缓冲区指定的位置上，插入指定的数据
 * public StringBuffer delete(int start,int end) 删除字符串缓冲区指定范围区的数据
 * public StringBuffer deleteCharAt(int index) 删除字符串缓冲区指定位置上的数据
 * pulic int length() 获取字符串缓冲区的长度
 * public StringBuffer replace(int start,int end,String str) 替换字符串缓冲区指定范围内的字符串
 * public StringBuffer setCharAt(int index,char ch) 替换字符串缓冲区指定位置上的字符
 * public StringBuffer reverse() 字符串缓冲区数据翻转方法
 * 
 */
package yq.it.test05;

/**
 * @author dell
 *
 */
public class Example08 {
	public static void main(String[] args) {
		System.out.println("1.添加：");
		add();
		System.out.println("2.删除：");
		deleted();
		System.out.println("3.修改/替换");
		modify();
	}

	public static void add() {
		// 定义一个字符串缓冲区
		StringBuffer sBuffer = new StringBuffer();
		// append添加：向字符串的末尾添加字符串
		sBuffer.append("14235652ffdafa");
		System.out.println("append添加方法后的字符串：" + sBuffer);
		// insert添加：向字符串指定位置添加：
		sBuffer.insert(2, "杨晴");
		System.out.println("insert添加方法后的字符串：" + sBuffer);
	}

	public static void deleted() {
		// 定义一个字符串缓冲区
		StringBuffer sBuffer1 = new StringBuffer("dalngkjalndfl");
		// delete删除是左开右闭区间，即就是删除时不包含开始的下标所代表的字符，包含结束下标所代表的字符
		// 返回值为删除后的新字符串
		StringBuffer newbuString = sBuffer1.delete(2, 5);
		System.out.println("delete方法删除后的字符串：" + newbuString);
		System.out.println(sBuffer1);
		StringBuffer newbString2 = sBuffer1.deleteCharAt(5);
		System.out.println("deleteCharAt方法删除后的字符串" + newbString2);
		System.out.println(sBuffer1);
		// 清空当前字符串缓冲区
		sBuffer1.delete(0, sBuffer1.length());
		System.out.println("清空字符串缓冲区数据后的结果：" + sBuffer1);
	}

	public static void modify() {
		// 定义一个字符串缓冲区
		StringBuffer sBuffer2 = new StringBuffer("篮球乒乓球排球足球各种求");
		// 修改/替换字符串缓冲区指定位置上的字符串：
		// replace替换是左闭右开区间，即就是替换时包含开始的下标所代表的字符，不包含结束下标所代表的字符
		sBuffer2.replace(4, 7, "秋哈哈哈哈");
		System.out.println("替换指定位置上的字符串：" + sBuffer2);
		// 由于setCharAt方法的第二个参数是char,char一般是指单引号中的字符，并且一般不超过两个子节
		sBuffer2.setCharAt(4, '啦');
		System.out.println("使用setCharAt插入的字符串：" + sBuffer2);
		// 字符串缓冲区数据翻转方法
		sBuffer2.reverse();
		System.out.println("reverse翻转后的字符串：" + sBuffer2);
	}

}
