package xxnjdg.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/8/25 4:29
 */
@Component
public class MyDog {
	@Value("${my.dog.name}")
	private String name;
	@Value("${my.dog.age}")
	private Integer age;

	public MyDog() {
	}

	public MyDog(String name, Integer age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
