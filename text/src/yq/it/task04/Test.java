/**
 * 
 */
package yq.it.task04;

/**
 * @author dell
 *
 */
public class Test {
	public static void main(String[] args) {
		// ������Ʒ�࣬����Ʒ�������Ը�ֵ
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		Product p4 = new Product();
		Product p5 = new Product();
		p1.setPorName("������");
		p2.setPorName("���ӻ�");
		p3.setPorName("΢��¯");
		p4.setPorName("���̻�");
		p5.setPorName("�����");

		// ���峬���࣬���������Ƹ�ֵ�����ֿ⸳ֵ
		Market market = new Market();
		market.setmarkName("����");
		market.setproductArr(new Product[] { p1, p2, p3, p4, p5 });

		// ���������˵Ķ��󣬸������˵����ָ�ֵ
		Person person = new Person();
		person.setName("������");

		// ���ù���ķ�����ָ������������Ʒ�����õ����� ���
		Product result = person.shopping(market, "�����");
		// ���ݽ�������ж�
		if (result != null) {
			System.out.println(person.getName() + "��" + market.getmarkName() + "����" + result.getProName());
		} else {
			System.out.println(person.getName() + "������һ�ˣ���" + market.getmarkName() + "ʲôҲû����");
		}

	}

}
