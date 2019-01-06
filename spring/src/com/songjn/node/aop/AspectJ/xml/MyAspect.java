package com.songjn.node.aop.AspectJ.xml;

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
public class MyAspect {
	public void myBefore(){
		System.out.println("执行前置通知1。");
	}
	public void myBefore(JoinPoint jp){
		System.out.println("执行前置通知2。jp="+jp);
	}
	
	public void myafter(){
		System.out.println("执行后置通知1。");
	}
	public void myafter(Object result){
		System.out.println("执行后置通知2。result="+result);
	}
	public Object myAround(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("执行环绕通知：执行目标方法之前。");
		Object result = pjp.proceed();
		System.out.println("执行环绕通知：执行目标方法之后。");
		if(result!=null){
			result=((String)result).toUpperCase();
		}
		return result;
	}
	public void afterThrowing(){
		System.out.println("执行异常通知1。");
	}
	public void myAfterThrowing(Exception ex){
		System.out.println("执行异常通知2。ex="+ex.getMessage());
	}
	public void after(){
		System.out.println("执行最终通知。");
	}
}
