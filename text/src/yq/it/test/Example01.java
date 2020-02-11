package yq.it.test;

public class Example01 {
	public static void main(String[] args) {
		//强制类型转换
				int num=4;
			    byte n=(byte)num;
		/*
		 * byte n=num;这种写法是错误的，
		 * num是int类型 取值范围大于byte 
		 * 需要强制类型转换
		*/
			    

			    System.out.println(n);
			}

}
