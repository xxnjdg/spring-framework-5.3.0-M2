package org.springframework.beans.factory.xml;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.testfixture.beans.FactoryMethods;
import org.springframework.beans.testfixture.beans.TestBean;
import org.springframework.core.io.ClassPathResource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author xxnjdg
 * @version 1.0
 * @date 2020/8/23 22:26
 */
public class XxnjdgTest {

	@Test
	public void testFactoryMethodsSingletonOnTargetClass() {
		DefaultListableBeanFactory xbf = new DefaultListableBeanFactory();
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(xbf);
		reader.loadBeanDefinitions(new ClassPathResource("xxnjdg.xml", getClass()));
		FactoryMethods fm = (FactoryMethods) xbf.getBean("default");
	}

}
