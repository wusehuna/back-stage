package yq.it.task01;

/**
 * �̳ǿ���嵥�������
 * ��ӡ�������ÿ����Ʒ����ϸ��Ϣ�Լ�������Ʒ�Ļ�����Ϣ
 * �����淶��������һ�㶼�ǹ�˾������д������������ĸСд
 * 		      ������������ĸ��д
 *
 */
public class SuperList {
	public static void main(String[] args) {
//		ƻ���ʼǱ�����
		String macBrand="MacBookAir";
		double macSize=13.3;
		double macPrice=6988.88;
		String macConfig="i5������4GB�ڴ�128G��̬Ӳ��";
		int macCount=5;
//����ʼǱ�����
		String thinkPadBrand="thinkPadBookAir";
		double thinkPadSize=14.0;
		double thinkPadPrice=5999.99;
		String thinkPadConfig="i5������4GB�ڴ�500GӲ��";
		int thinkPadCount=10;
//��˶�ʼǱ�����
		String ASUSBrand="ASUSBookAir";
		double ASUSSize=15.6;
		double ASUSPrice=4999.5;
		String ASUSConfig="i7������4GB�ڴ�128G��̬Ӳ��";
		int ASUSCount=18;
//		�б���
		System.out.println("-------------------------�̳ǿ���嵥---------------------------------");
	    System.out.println("Ʒ���ͺ�                               �ߴ�                 �۸�                   ����                                                 �����");
//	    �б��в�
	    System.out.println(macBrand+"        "+macSize+"   "+macPrice+"   "+macConfig+"       "+macCount);
	    System.out.println(thinkPadBrand+"   "+thinkPadSize+"   "+thinkPadPrice+"   "+thinkPadConfig+"              "+thinkPadCount);
	    System.out.println(ASUSBrand+"       "+ASUSSize+"   "+ASUSPrice+"    "+ASUSConfig+"       "+ASUSCount);
	    System.out.println("-------------------------------------------------------------------");
	    System.out.println("��Ʒ�ܿ������"+(macCount+thinkPadCount+ASUSCount));
	    System.out.println("��Ʒ�ܽ������"+(macPrice*macCount+thinkPadPrice*thinkPadCount+ASUSPrice*ASUSCount));

	}
}
