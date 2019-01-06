package com.songjn.node.aop.AspectJ.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**  
 * @author songjn 
 * @date Sep 4, 2018 - 8:35:00 AM  
 * @desc 切面类
 */
@Aspect  //切面注解
public class MyAspect {
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void before(){
		System.out.println("执行前置通知1。");
	}
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void before(JoinPoint jp){
		System.out.println("执行前置通知2。jp="+jp);
	}
	
	@AfterReturning(value="execution(* *..ISomeService.doSecond(..))")
	public void myafter(){
		System.out.println("执行后置通知1。");
	}
	@AfterReturning(value="execution(* *..ISomeService.doSecond(..))", returning="result")
	public void myafter(Object result){
		System.out.println("执行后置通知2。result="+result);
	}
	@Around("execution(* *..ISomeService.doThird(..))")
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("执行环绕通知：执行目标方法之前。");
		Object result = pjp.proceed();
		System.out.println("执行环绕通知：执行目标方法之后。");
		if(result!=null){
			result=((String)result).toUpperCase();
		}
		return result;
	}
	@AfterThrowing("execution(* *..ISomeService.doSecond(..))")
	public void afterThrowing(){
		System.out.println("执行异常通知1。");
	}
	@AfterThrowing(value="execution(* *..ISomeService.doThird(..))",throwing="ex")
	public void myAfterThrowing(Exception ex){
		System.out.println("执行异常通知2。ex="+ex.getMessage());
	}
	@After("doThirdPointcut()")
	public void after(){
		System.out.println("执行最终通知。");
	}
	//定义切入点:doThirdPointcut()
	@Pointcut("execution(* *..ISomeService.doSecond(..))")
	public void doThirdPointcut(){}
}
