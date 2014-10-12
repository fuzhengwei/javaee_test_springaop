package 紫禁城.内务府.监管处;

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

import 紫禁城.内务府.敬事房.膑.太监膑;

@Aspect
@Component
public class 敬事监管 {

	@Pointcut("execution(public * 紫禁城.内务府.敬事房.利器库..*.军刺切(..))")
	public void 监管员(){
		
	}
	
	@Before("监管员()")
	public void 敬事前(){
		System.out.println("敬事前:---------准备下刀... ...");
	}
	
	@After("监管员()")
	public void 敬事后(){
		System.out.println("敬事后:---------切除完成... ...");
	}
	
	@SuppressWarnings("deprecation")
	@Around("监管员()")
	public Object aroundMethod(ProceedingJoinPoint pjp) throws Throwable {
        
		System.out.println("待切身份："+pjp.getArgs()[0]);
		System.out.println("执行工具："+pjp.getSignature().getName());
		
		//获得传递对象，并做处理
		太监膑 太监 = (太监膑) pjp.getArgs()[0];
		SimpleDateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd");
		太监.set敬事日期(timeFormat.format(new Date()));
		
		//此处可以传递更改后的参数
		Object obj = pjp.proceed(new Object[]{太监});
		
		return obj;
		
	}
	
	
	/** 
     * 根据类和方法名得到方法 
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
