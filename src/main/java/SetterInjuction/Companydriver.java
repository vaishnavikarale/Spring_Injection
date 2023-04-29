package SetterInjuction;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class Companydriver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("Core.xml");
	BeanFactory bf=new XmlBeanFactory(cpr);
	Company c=(Company)bf.getBean("comp");
	System.out.println("id: "+c.getId());
	System.out.println("Company name: "+c.getName());
	System.out.println("NoOfEmployee: "+c.getNoOfEmp());
	System.out.println("Turnover: "+c.getTurnover());
}
}
