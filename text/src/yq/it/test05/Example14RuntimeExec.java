/**
 * 
 */
package yq.it.test05;

/**
 * 打开的记事本在3秒后自动关闭
 * 
 * public Process exec(String command) throws IOException 在单独的进程中执行指定的字符串命令。
 *
 */
public class Example14RuntimeExec {
	public static void main(String[] args) throws Exception {
		// 获取Runtime对象
		Runtime runtime1 = Runtime.getRuntime();

		// 得到一个表示进程的Process对象
		Process process = runtime1.exec("notepad.exe");
		Thread.sleep(3000);// 程序休眠3秒
		process.destroy();// 杀掉当前进程

	}

}
