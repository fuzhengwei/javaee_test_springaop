package 紫禁城.内务府.敬事房.利器库;

import org.springframework.stereotype.Component;

import 紫禁城.内务府.敬事房.膑.太监膑;
import 紫禁城.内务府.登记处.公务员;

/**
 * 
 * @author fuzhengwei
 * 
 * 相当于dao层，刀层
 */
@Component("切除")
public class 切除器具 {
	
	/**
	 * 军刺切
	 * 把一个好好的小伙变成太监
	 */
	public 太监膑 军刺切(太监膑 太监){
		
		太监.set性别(公务员.太监.name());
		System.out.println("。。。啊 ... ...老子被切了！");
		return 太监;
	}
	
	
}
