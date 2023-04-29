package ConstructorInjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import SetterInjuction.Pan;
import SetterInjuction.Person;

public class MarkerDriver {
 public static void main(String[] args) {
	 ClassPathResource cpr=new ClassPathResource("core2.xml");
		BeanFactory bf=new XmlBeanFactory(cpr); 
		Marker m=(Marker)bf.getBean("myMarker");
		System.out.println("id:"+m.id);
		System.out.println("color:"+m.color);
		System.out.println("priec:"+m.price);
		
		
}
}
