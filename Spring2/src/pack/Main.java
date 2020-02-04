package pack;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;

public class Main {

	public static void main(String args[])
	{
		BeanFactory b=new XmlBeanFactory(new ClassPathResource("ApplicationContext.xml"));
		A obj=(A)b.getBean("a");
		//obj.display();
		obj.setMessage("hey");
		obj.getMessage();
		A obj1=(A)b.getBean("a");
		//
		obj1.setMessage("Hi");
	obj1.getMessage();
		}
}
