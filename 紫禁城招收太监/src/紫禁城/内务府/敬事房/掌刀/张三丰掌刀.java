package �Ͻ���.����.���·�.�Ƶ�;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import �Ͻ���.����.���·�.�̷���.̫����;
import �Ͻ���.����.���·�.��.̫����;
import �Ͻ���.����.�ǼǴ�.����Ա;

/**
 * 
 * @author fuzhengwei
 *
 * �Ƶ��˸�����
 * 
 * ��ӭ���� ����۹�Ⱥ 5307307
 * Ⱥ���� http://www.yuyueqianli.com
 */
public class �������Ƶ� {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("��̫��.xml");
		
		̫���� ̫������ = ctx.getBean("̫����",̫����.class);

		̫���� ̫�� = new ̫����();
		̫��.set����("С����");
		̫��.set����("9");
		̫��.set�Ա�(����Ա.��.name());
		
		̫�� = ̫������.ִ���г�(̫��);
		
		System.out.println("\r\n�г�״̬��"+̫��);
	}

}
