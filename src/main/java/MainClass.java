import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import springapp.collectionPackage.Question2;
import springapp.collectionPackage.Question3;
import springapp.personPackage.Employee;
import springapp.personPackage.Student;

public class MainClass {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(resource);

		System.out.println("======================");
		Student student = (Student) factory.getBean("studentbean");
		student.displayInfo();

		System.out.println("=======================");
		Employee e1 = (Employee) factory.getBean("e2");
		e1.show();

		System.out.println("========================");
		Employee e2 = (Employee) factory.getBean("emp");
		e2.show();
		System.out.println("=========================");

//		Question q = (Question) factory.getBean("q");
//		q.displayInfo();
		System.out.println("==========================");

		Question2 q2 = (Question2) factory.getBean("q2");
		q2.displayInfo();
		
		System.out.println("==========================");
		 Question3 q3=(Question3)factory.getBean("q3");  
		    q3.displayInfo();  

	}

}
