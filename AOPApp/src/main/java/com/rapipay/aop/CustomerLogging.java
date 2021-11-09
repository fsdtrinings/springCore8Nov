package com.rapipay.aop;

import java.time.LocalDateTime;
import java.time.LocalTime;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class CustomerLogging {

	public CustomerLogging() {
		System.out.println(" constructor aspect class");
	}

	public void doTransferFundLogging() {
		System.out.println("INFO :- Logging done :- " + LocalDateTime.now());
	}

	@AfterThrowing(pointcut = "execution(public String com.rapipay.aop.Customer.changeBankName(*))", throwing = "e")
	public void whenUserUpdate(JoinPoint joinPoint, Exception e) {
		System.out.println(" updation noted :- " + LocalDateTime.now());
		if (e != null) {

			Object arr[] = joinPoint.getArgs(); // 1
			for (Object methodArgValue : arr) {
				System.out.println(" Argument is :- " + methodArgValue); // new Bank Name
			}
			System.out.println("ERROR !!! Exception Raised " + e);
		}
	}

	@AfterReturning(pointcut = "execution(public String com.rapipay.aop.Customer.changeBankName(*))",
			returning = "result")
	public void whenUserUpdateSuccess(JoinPoint joinPoint, String result) // use string bcoz return type of actual method is string type
	{
		System.out.println("INFO :-  updation noted :- " + LocalDateTime.now()+" return msg "+result);
		
	}

	// @After("execution(public void com.rapipay.aop.*.set*(*))")
	@After("execution(public String com.rapipay.aop.Customer.changeBankName(*))")
	public void doAfterLogging() {
		System.out.println(" method execution completed " + LocalTime.now());
	}

	// @Before("execution(public void
	// com.rapipay.aop.Customer.displayCustomerInfo())")
	// @Before("execution(public * com.rapipay.aop.Customer.*())") // in case 2 arg
	// then use two * like (*,*) | ... :- 0 or more arguments
	@Before("execution(public void com.rapipay.aop.*.set*(*))")
	public void doUpdation() {
		System.out.println("INFO :- Updation done :- " + LocalDateTime.now());

	}

}
