/**
 * 
 */
package yq.it.test04;

/**
 * @author dell 自定义异常
 *
 */
public class Example41 {
	public static void main(String[] args) {
		int result;
		try {
			result = divide(5, -2);
			System.out.println(result);
		} catch (DivideByMinusException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}

	}

//	下面定义一个方法，实现两个整数相除，如果被除数小于0，则抛出异常
	public static int divide(int x, int y) throws DivideByMinusException {
		if (y < 0) {
			throw new DivideByMinusException("除数是负数");

		}
		int result = x / y;
		return result;

	}

}
