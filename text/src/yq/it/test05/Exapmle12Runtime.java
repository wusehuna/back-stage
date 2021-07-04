/**
 * 
 */
package yq.it.test05;

/**
 * Runtime类的使用 ： public int availableProcessors() 向 Java 虚拟机返回可用处理器的数目。 public
 * static Runtime getRuntime()返回与当前 Java 应用程序相关的运行时对象。 public long freeMemory()
 * 返回 Java 虚拟机中的空闲内存量 public long maxMemory() 返回 Java 虚拟机试图使用的最大内存量
 * 
 *
 */
public class Exapmle12Runtime {
	public static void main(String[] args) {
		// 获取一个Runtime类对象
		Runtime rtRuntime = Runtime.getRuntime();
		// 获取处理器的个数
		System.out.println("处理器的个数：" + rtRuntime.availableProcessors());
		// java虚拟机能使用的空闲内存量
		System.out.println("空闲内存量：" + rtRuntime.freeMemory() / 1024 / 1024 + "M");
		// java虚拟机试图使用的最大内存量
		System.out.println("最大内存量：" + rtRuntime.maxMemory() / 1020 / 1024 + "M");

	}

}
