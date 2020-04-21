package com.enjoy.cap10.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
public class LogAspect {
	
	@Pointcut("execution(* com.enjoy.cap10.aop.Calculator.*(..))")
	public void pointCut() {
		
	};

	/**
     * 在切点方法之前执行
     * @param joinPoint
     */
    @Before(value="pointCut()")
    public void doBefore(JoinPoint joinPoint){
        System.out.println("@Before：切点方法之前执行.....");
    }

    
    /**
     * 在切点方法之后执行
     * @param joinPoint
     */
    @After(value="pointCut()")
    public void doAfter(JoinPoint joinPoint){
        System.out.println("@After：切点方法之后执行.....");
    }

    
    
    /**
    * 切点方法返回后执行
    *     如果第一个参数为JoinPoint，则第二个参数为返回值的信息
    *     如果第一个参数不为JoinPoint，则第一个参数为returning中对应的参数
    *     returning：限定了只有目标方法返回值与通知方法参数类型匹配时才能执行后置返回通知，否则不执行，
    *     参数为Object类型将匹配任何目标返回值
    */
    @AfterReturning(value = "pointCut()",returning = "result")
    public void doAfter(JoinPoint joinPoint,Object result){
        System.out.println("@AfterReturning：切点方法返回后执行.....");
        System.out.println("返回值："+result);
    }

    
    
    /**
     * 切点方法抛异常执行
     *     定义一个名字，该名字用于匹配通知实现方法的一个参数名，当目标方法抛出异常返回后，将把目标方法抛出的异常传给通知方法；
     *     throwing:限定了只有目标方法抛出的异常与通知方法相应参数异常类型时才能执行后置异常通知，否则不执行，
     *     对于throwing对应的通知方法参数为Throwable类型将匹配任何异常。
     * @param joinPoint
     * @param exception
     */
     @AfterThrowing(value = "pointCut()",throwing = "exception")
     public void doAfterThrowing(JoinPoint joinPoint,Throwable exception){
         System.out.println("@afterThrowing：切点方法抛异常执行.....");
     }
     
     
     /**
      * 
      * 属于环绕增强，能控制切点执行前，执行后，，用这个注解后，程序抛异常，会影响@AfterThrowing这个注解
      * 
      * org.aspectj.lang.JoinPoint 接口表示目标类连接点对象，它定义这些主要方法。
      * Object[] getArgs()：获取连接点方法运行时的入参列表。
      * Signature getSignature()：获取连接点的方法签名对象。
      * Object getTarget()：获取连接点所在的目标对象。
      * Object getThis()：获取代理对象。
      * @param pjp
      * @return
      * @throws Throwable 
      */
     @Around(value="pointCut()")
     public Object doAround(ProceedingJoinPoint pjp) throws Throwable{
         System.out.println("@Around：切点方法环绕start.....");
         Object[] args = pjp.getArgs();
         Object o = pjp.proceed(args);
         System.out.println("@Around：切点方法环绕end.....");
         return o;
     }


}
