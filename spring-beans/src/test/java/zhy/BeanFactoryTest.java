package zhy;

import org.apache.catalina.core.ApplicationContext;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * @author: zhangocean
 * @Date: 2019/1/19 21:01
 * Describe:
 */
public class BeanFactoryTest {

	@Test
	public void xmlBeanFactory(){
		//创建Resource对象，该对象中包含BeanDefinition信息
		ClassPathResource resource = new ClassPathResource("zhy/tiny-ioc.xml");
		//创建一个BeanFactory的默认实现
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
		//创建XmlBeanDefinitionReader，用来载入BeanDefinition
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory);
		//通过loadBeanDefinitions方法对获取的Resource中的BeanDefinition进行载入
		reader.loadBeanDefinitions(resource);
	}

	@Test
	public void ApplicationContextTest(){
	}

}
