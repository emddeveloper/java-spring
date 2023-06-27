package aurowire.xml.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWiredXML {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("aurowire/xml/config/config.xml");
		Employee emp1 = (Employee) context.getBean("emp1");
		System.out.println(emp1);
	}
}
