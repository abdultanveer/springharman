package aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Logging {
	
	@Before("execution(public void aop.ImplementAspect.aspectCall())")
	public void loggingAdvice1() {
		System.out.println("log--before method is executed");
	}
	
	

}
