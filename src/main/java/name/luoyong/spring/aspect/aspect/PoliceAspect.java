package name.luoyong.spring.aspect.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class PoliceAspect {

	public void watch() {
		System.out.println("Police is watching fox");
	}
	
	public void catch2(ProceedingJoinPoint pjp) throws Throwable {
		pjp.proceed();
		System.out.println("Police Catched fox");
	}

}
