package SetterInjuction;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import demo.Pen;

public class Pen1Driver {
public static void main(String[] args) {
	ClassPathResource cpr=new ClassPathResource("Core.xml");
	BeanFactory bf=new XmlBeanFactory(cpr); 
	Pen1 p=(Pen1)bf.getBean("myPen1");
	p.penDetails();
}
}
