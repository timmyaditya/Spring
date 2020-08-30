package org.timmyaditya.diaccountsmapexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory bf = new XmlBeanFactory(resource);
		
		Account acc = (Account)bf.getBean("idAccount");
		acc.displayAccount();

	}
}
