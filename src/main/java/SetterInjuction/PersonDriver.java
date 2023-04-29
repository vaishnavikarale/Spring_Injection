package SetterInjuction;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PersonDriver {
 public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("Core.xml");
	BeanFactory bf=new XmlBeanFactory(cpr); 
	Person p=(Person)bf.getBean("per");
	System.out.println("id:"+p.getId());
	System.out.println("name:"+p.getName());
	System.out.println("panno:"+p.getPanno());
	
	Pan pa=p.getP();
	pa.create();
	
}
}
