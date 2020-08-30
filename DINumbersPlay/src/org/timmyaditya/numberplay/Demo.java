package org.timmyaditya.numberplay;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.timmyaditya.numberplay.controller.Controller;


public class Demo {
	public static void main(String[] args) {
		
		  System.out.println("Application starts here");
		  
		  Resource resource=new ClassPathResource("applicationContext.xml");
		  BeanFactory beanFactory=new XmlBeanFactory(resource);
		  
		  Controller controller=(Controller)beanFactory.getBean("idController");
		  controller.doOperations(123);
	}

}
