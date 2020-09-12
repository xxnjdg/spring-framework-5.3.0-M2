package xxnjdg.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.*;


/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/8/24 21:38
 */
public class ContextTest {

	@Test
	public void testAutowiredConfigurationMethodDependenciesWithOptionalAndNotAvailable() {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(MyConfiguration.class);

		MyBean myBean = context.getBean("myBean", MyBean.class);
		myBean.printMyDog();
	}

	@Configuration
	@ComponentScan("xxnjdg")
	@PropertySource("classpath:/xxnjdg/test/myConfiguration.properties")
	public static class MyConfiguration{
	}

}
