package com.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Component;

@Component
public class Cat implements InitializingBean , DisposableBean {

    public Cat(){
        System.out.println("Cat Contructor....");
    }

    //初始化方法
    public void afterPropertiesSet() throws Exception {
        System.out.println("Cat............Cat.......");
    }

    public void destroy() throws Exception {
        System.out.println("Cat............destroy.......");
    }
}
