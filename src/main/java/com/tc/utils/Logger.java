package com.tc.utils;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 时间：  2020/1/11
 * 创建者：  Administrator 钟文
 * 描述：   记录日志的类，里面提供了公共的方法
 * 参数：
 * 返回值：
 **/
public class Logger {

    public void beforePrintLog(){
        System.out.println("beforePrintLog log类增强方法");
    }
    public void AfterReturnPrintLog(){
        System.out.println("AfterReturnPrintLog log类增强方法");
    }

    public void AfterThrowingPrintLog(){
        System.out.println("AfterThrowingPrintLog log类增强方法");
    }

    public void AfterPrintLog(){
        System.out.println("AfterPrintLog log类增强方法");
    }

    /**
     * 配置了环绕通知以后，切入点的方法没有执行，但是增强的方法执行了
     *
     *  分析：动代理的的环绕通知有明确的切入点方法调用，而外面的方法没有
     *  解决：
     *  spring 为我们提供了一个接口，proceedingJointPoint. 该接口有一个方法，proceed()
     *  此方法就相当于明确调用切入点方法，该接口可以作为环绕通知的方法参数，在程序执行的时候，spring为我们提供
     *  该接口的实现类供我们使用。
     *
     *  所以spring环绕通知是一种可以让程序员自己定义增强方法执行的位置的调整类型
     */
    public Object AroundPrintLog(ProceedingJoinPoint pjp){
       Object retvalue=null;
        try {
            System.out.println("AroundPrintLog log类增强方法---前置-----");
            //获取方法执行所需要的参数
            Object[] args = pjp.getArgs();
           retvalue = pjp.proceed(args);
            System.out.println("AroundPrintLog log类增强方法---后置-----");
            return retvalue;
        } catch (Throwable e) {
            e.printStackTrace();
            System.out.println("AroundPrintLog log类增强方法---异常-----");
            throw new RuntimeException("环绕异常");
        }finally {
            System.out.println("AroundPrintLog log类增强方法---最终-----");
        }
    }


}
