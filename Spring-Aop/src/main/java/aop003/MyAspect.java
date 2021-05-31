package aop003;

import org.aspectj.lang.JoinPoint;

//스프링 프레임워크에 의존하지 않는 POJO
//Plain Old Java Object
public class MyAspect {
	
	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 인식 확인: 문을 개방하라");
	 
	}

}
