package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		StudentDao s=(StudentDao)ap.getBean("s");
		int count=s.saveStudent(new Student(101,"meg"));
		System.out.println(count+"rows updated");
		
	}

}
