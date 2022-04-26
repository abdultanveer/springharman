package aop;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logging {
	
	//@Before("execution(public void aop.ImplementAspect.aspectCall())")
	@Before("allStudentMethods()")
	public void loggingAdvice1() {
		System.out.println("log--before method is executed");
	}

	/*
	 * @Before("execution(public * get*())") public void loggingAdviceGet() {
	 * System.out.println("log--before getter is executed"); }
	 */
	
	
	@Before("execution(* aop..*.*(..))")
	public void loggingAdviceAllClassesMethods() {
		System.out.println("all log");
	//+ joinpoint.toString());
	}
	
	@Pointcut("within(aop.Student)")
	public void allStudentMethods() {}


}
