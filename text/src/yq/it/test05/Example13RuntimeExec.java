/**
 * 
 */
package yq.it.test05;

import java.io.IOException;

/**
 * Runtime类中提供了一个exec()方法，该方法用于执行一个dos命令，从而实现和在命令行窗口中输入dos命令同样的效果
 *
 */
public class Example13RuntimeExec {
	public static void main(String[] args) throws IOException {
		// 获取Runtime类对象
		Runtime runtime = Runtime.getRuntime();
		runtime.exec("notepad.exe");
	}

}
