package �Ͻ���.����.���·�.�̷���;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import �Ͻ���.����.���·�.������.�г�����;
import �Ͻ���.����.���·�.��.̫����;

/**
 * 
 * @author fuzhengwei
 * 
 * רΪ�˸�̫��������
 */
@Component("̫����")
public class ̫���� {

	private �г����� �г�;
	
	
	public �г����� get�г�() {
		return �г�;
	}

	@Resource(name="�г�") 
	public void set�г�(�г����� �г�) {
		this.�г� = �г�;
	}

	public ̫���� ִ���г�(̫���� ̫��){
		return �г�.������(̫��);
	}
	
}
