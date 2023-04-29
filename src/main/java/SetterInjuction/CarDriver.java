package SetterInjuction;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CarDriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("Core.xml");
	BeanFactory bf=new XmlBeanFactory(cpr); 
	car c=(car)bf.getBean("myCar");
	System.out.println("id:"+c.getId());
	System.out.println("brand:"+c.getBrand());
	System.out.println("price:"+c.getPrice());
	System.out.println("=======================");
	
	Engine e=c.getE();
	 e.start();
}
}
