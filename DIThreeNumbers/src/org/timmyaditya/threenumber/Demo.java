package org.timmyaditya.threenumber;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.timmyaditya.threenumber.controller.Controller;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		
		
		Controller controller = (Controller)beanFactory.getBean("idController");
		controller.doCalc(1, 2, 3);

	}

}
