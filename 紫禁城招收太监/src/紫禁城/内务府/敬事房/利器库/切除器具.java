package �Ͻ���.����.���·�.������;

import org.springframework.stereotype.Component;

import �Ͻ���.����.���·�.��.̫����;
import �Ͻ���.����.�ǼǴ�.����Ա;

/**
 * 
 * @author fuzhengwei
 * 
 * �൱��dao�㣬����
 */
@Component("�г�")
public class �г����� {
	
	/**
	 * ������
	 * ��һ���úõ�С����̫��
	 */
	public ̫���� ������(̫���� ̫��){
		
		̫��.set�Ա�(����Ա.̫��.name());
		System.out.println("�������� ... ...���ӱ����ˣ�");
		return ̫��;
	}
	
	
}
