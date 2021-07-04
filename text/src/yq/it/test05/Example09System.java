/**
 * 
 */
package yq.it.test05;

import java.util.Properties;
import java.util.Set;

/**
 *
 * System类的用法 
 * public static Properties getProperties()
 *         方法用于获取当前系统的全部属性，该方法会返回一个Properties类型的容器
 *         其中封装了系统的所有属性，这些属性是以“属性名=属性值”的形式存在的
 * pubilc static String getProperty(String key) 获取指定键(属性名)所对应的系统属性值
 * 
 *
 */
public class Example09System {
	public static void main(String[] args) {
		// 获取当前系统属性
		Properties properties = System.getProperties();
		System.out.println(properties);
		// 获取所有系统属性的key(属性名)，返回set对象
		Set<String> proStrings = properties.stringPropertyNames();
		// getProperty(string key) 传入一个属性名，就可以得到该属性对应的系统属性
		for (String key : proStrings) {
			// 获取当前键key(属性名)所对应的值(属性值)
			String keyvalString = System.getProperty(key);
			System.out.println("第" + key + "的属性值为" + keyvalString);
		}

	}

}
