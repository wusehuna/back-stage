/**
 * StringBuffer�Ĺ��췽��
 * 1.public StringBuffer()�ղι��췽��
 * 2.public StringBuffer(String data)�����������ݵ��ַ���������
 * 
 * 
 * StringBuffer��ĳ��÷�����
 * public StringBuffer append(Sting str) ���ַ�����������ĩβ������ݣ����ص�ǰ��StringBuffer��������
 * public StringBuffer insert(int index,string str) ���ַ���������ָ����λ���ϣ�����ָ��������
 * public StringBuffer delete(int start,int end) ɾ���ַ���������ָ����Χ��������
 * public StringBuffer deleteCharAt(int index) ɾ���ַ���������ָ��λ���ϵ�����
 * pulic int length() ��ȡ�ַ����������ĳ���
 * public StringBuffer replace(int start,int end,String str) �滻�ַ���������ָ����Χ�ڵ��ַ���
 * public StringBuffer setCharAt(int index,char ch) �滻�ַ���������ָ��λ���ϵ��ַ�
 * public StringBuffer reverse() �ַ������������ݷ�ת����
 * 
 */
package yq.it.test05;

/**
 * @author dell
 *
 */
public class Example08 {
	public static void main(String[] args) {
		System.out.println("1.��ӣ�");
		add();
		System.out.println("2.ɾ����");
		deleted();
		System.out.println("3.�޸�/�滻");
		modify();
	}

	public static void add() {
		// ����һ���ַ���������
		StringBuffer sBuffer = new StringBuffer();
		// append��ӣ����ַ�����ĩβ����ַ���
		sBuffer.append("14235652ffdafa");
		System.out.println("append��ӷ�������ַ�����" + sBuffer);
		// insert��ӣ����ַ���ָ��λ����ӣ�
		sBuffer.insert(2, "����");
		System.out.println("insert��ӷ�������ַ�����" + sBuffer);
	}

	public static void deleted() {
		// ����һ���ַ���������
		StringBuffer sBuffer1 = new StringBuffer("dalngkjalndfl");
		// deleteɾ�������ұ����䣬������ɾ��ʱ��������ʼ���±���������ַ������������±���������ַ�
		// ����ֵΪɾ��������ַ���
		StringBuffer newbuString = sBuffer1.delete(2, 5);
		System.out.println("delete����ɾ������ַ�����" + newbuString);
		System.out.println(sBuffer1);
		StringBuffer newbString2 = sBuffer1.deleteCharAt(5);
		System.out.println("deleteCharAt����ɾ������ַ���" + newbString2);
		System.out.println(sBuffer1);
		// ��յ�ǰ�ַ���������
		sBuffer1.delete(0, sBuffer1.length());
		System.out.println("����ַ������������ݺ�Ľ����" + sBuffer1);
	}

	public static void modify() {
		// ����һ���ַ���������
		StringBuffer sBuffer2 = new StringBuffer("����ƹ�����������������");
		// �޸�/�滻�ַ���������ָ��λ���ϵ��ַ�����
		// replace�滻������ҿ����䣬�������滻ʱ������ʼ���±���������ַ��������������±���������ַ�
		sBuffer2.replace(4, 7, "���������");
		System.out.println("�滻ָ��λ���ϵ��ַ�����" + sBuffer2);
		// ����setCharAt�����ĵڶ���������char,charһ����ָ�������е��ַ�������һ�㲻���������ӽ�
		sBuffer2.setCharAt(4, '��');
		System.out.println("ʹ��setCharAt������ַ�����" + sBuffer2);
		// �ַ������������ݷ�ת����
		sBuffer2.reverse();
		System.out.println("reverse��ת����ַ�����" + sBuffer2);
	}

}
