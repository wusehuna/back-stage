/**
 * 
 */
package yq.it.test04;

/**
 * @author dell �Զ����쳣
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

//	���涨��һ��������ʵ������������������������С��0�����׳��쳣
	public static int divide(int x, int y) throws DivideByMinusException {
		if (y < 0) {
			throw new DivideByMinusException("�����Ǹ���");

		}
		int result = x / y;
		return result;

	}

}
