package pack;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.*;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		BeanClass1 obj=(BeanClass1)context.getBean("b");
		obj.getMessage();
		context.registerShutdownHook();
		
	}

}
