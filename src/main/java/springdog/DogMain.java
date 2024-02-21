package springdog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DogMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context =new ClassPathXmlApplicationContext("Dog.xml");
		Dog white=(Dog) context.getBean("dog");
		System.out.println(white);

	}

}
