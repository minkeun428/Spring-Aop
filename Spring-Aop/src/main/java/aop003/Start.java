package aop003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


//스프링AOP는 인터페이스를 기반으로 하기 때문에
//boy와 girl은 Person 인터페이스를 구현하고 있다. 
public class Start {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop003.xml/aop003.xml");
		
		Person romeo = context.getBean("boy", Person.class);
		Person juliet = context.getBean("girl", Person.class);
		
		romeo.runSomething();
		juliet.runSomething();
	}

}
