package �Ͻ���.����.��ܴ�;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import �Ͻ���.����.���·�.��.̫����;

@Aspect
@Component
public class ���¼�� {

	@Pointcut("execution(public * �Ͻ���.����.���·�.������..*.������(..))")
	public void ���Ա(){
		
	}
	
	@Before("���Ա()")
	public void ����ǰ(){
		System.out.println("����ǰ:---------׼���µ�... ...");
	}
	
	@After("���Ա()")
	public void ���º�(){
		System.out.println("���º�:---------�г����... ...");
	}
	
	@SuppressWarnings("deprecation")
	@Around("���Ա()")
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        
		System.out.println("������ݣ�"+pjp.getArgs()[0]);
		System.out.println("ִ�й��ߣ�"+pjp.getSignature().getName());
		
		//��ô��ݶ��󣬲�������
		̫���� ̫�� = (̫����) pjp.getArgs()[0];
		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd");
		̫��.set��������(timeFormat.format(new Date()));
		
		//�˴����Դ��ݸ��ĺ�Ĳ���
		Object obj = pjp.proceed(new Object[]{̫��});
		
		return obj;
		
	}
	
	
	/** 
     * ������ͷ������õ����� 
     */  
    public Method getMethodByClassAndName(Class c , String methodName){  
        Method[] methods = c.getDeclaredMethods();  
        for (Method method : methods) {  
            if(method.getName().equals(methodName)){  
                return method ;  
            }  
        }  
        return null;  
    }  
}
