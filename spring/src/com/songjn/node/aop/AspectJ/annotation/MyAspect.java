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
 * @desc ������
 */
@Aspect  //����ע��
public class MyAspect {
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void before(){
		System.out.println("ִ��ǰ��֪ͨ1��");
	}
	@Before("execution(* *..ISomeService.doFirst(..))")
	public void before(JoinPoint jp){
		System.out.println("ִ��ǰ��֪ͨ2��jp="+jp);
	}
	
	@AfterReturning(value="execution(* *..ISomeService.doSecond(..))")
	public void myafter(){
		System.out.println("ִ�к���֪ͨ1��");
	}
	@AfterReturning(value="execution(* *..ISomeService.doSecond(..))", returning="result")
	public void myafter(Object result){
		System.out.println("ִ�к���֪ͨ2��result="+result);
	}
	@Around("execution(* *..ISomeService.doThird(..))")
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("ִ�л���֪ͨ��ִ��Ŀ�귽��֮ǰ��");
		Object result = pjp.proceed();
		System.out.println("ִ�л���֪ͨ��ִ��Ŀ�귽��֮��");
		if(result!=null){
			result=((String)result).toUpperCase();
		}
		return result;
	}
	@AfterThrowing("execution(* *..ISomeService.doSecond(..))")
	public void afterThrowing(){
		System.out.println("ִ���쳣֪ͨ1��");
	}
	@AfterThrowing(value="execution(* *..ISomeService.doThird(..))",throwing="ex")
	public void myAfterThrowing(Exception ex){
		System.out.println("ִ���쳣֪ͨ2��ex="+ex.getMessage());
	}
	@After("doThirdPointcut()")
	public void after(){
		System.out.println("ִ������֪ͨ��");
	}
	//���������:doThirdPointcut()
	@Pointcut("execution(* *..ISomeService.doSecond(..))")
	public void doThirdPointcut(){}
}
