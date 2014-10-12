package 紫禁城.内务府.敬事房.掌刀;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import 紫禁城.内务府.敬事房.刑房处.太监刑;
import 紫禁城.内务府.敬事房.膑.太监膑;
import 紫禁城.内务府.登记处.公务员;

/**
 * 
 * @author fuzhengwei
 *
 * 掌刀人负责切
 * 
 * 欢迎加入 东软帝国群 5307307
 * 群官网 http://www.yuyueqianli.com
 */
public class 张三丰掌刀 {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("皇太极.xml");
		
		太监刑 太监行刑 = ctx.getBean("太监刑",太监刑.class);

		太监膑 太监 = new 太监膑();
		太监.set姓名("小德张");
		太监.set年龄("9");
		太监.set性别(公务员.男.name());
		
		太监 = 太监行刑.执行切除(太监);
		
		System.out.println("\r\n切除状态："+太监);
	}

}
