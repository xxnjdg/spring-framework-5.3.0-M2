package xxnjdg.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/8/25 4:27
 */
@Component
public class MyBean {

	@Autowired
	private MyDog myDog;

	public void printMyDog(){
		System.out.println(myDog.getAge());
		System.out.println(myDog.getName());
	}

}