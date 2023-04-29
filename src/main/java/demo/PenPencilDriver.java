package demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class PenPencilDriver {
	public static void main(String[] args) {
		ClassPathResource cpr=new ClassPathResource("Core.xml");
		BeanFactory bf=new XmlBeanFactory(cpr); // it is deprected
		Pen p=(Pen)bf.getBean("myPen"); //return type of getbean is object so need to downcast
		p.write();
		
		Pencil p1=new Pencil();
		p1.color();
	}

}
