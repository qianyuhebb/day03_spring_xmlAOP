package com.tc.utils;

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

    public void AroundPrintLog(){
        System.out.println("AroundPrintLog log类增强方法");
    }


}
