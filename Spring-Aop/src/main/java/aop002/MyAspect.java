package aop002;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;


//이 클래스를 이제 AOP에서 사용하겠다.
@Aspect
public class MyAspect {
	
	//대상 메서드 실행 전에 이 메서드를 먼저 실행하겠다.
	@Before("execution(* runSomething())")
	public void before(JoinPoint joinPoint) {   //JoinPoint = aop002.Boy.runSomething();
		System.out.println("얼굴 인식 확인: 문을 개방하라");
		//System.out.println("열쇠로 문을 열고 집에 들어간다.");
		
	}
}
