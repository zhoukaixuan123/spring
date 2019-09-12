package com.config;

import com.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportBEanDefinitonRegister implements ImportBeanDefinitionRegistrar {
    /**
     *
     *
     * AnnotationMetadata
     * @param annotationMetadata 当前类注解的注册信息
     * @param beanDefinitionRegistry  注册类
     * 自定义注册组件
     */

    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        boolean red = beanDefinitionRegistry.containsBeanDefinition("red");
        boolean blue = beanDefinitionRegistry.containsBeanDefinition("com.bean.Blue");
        if(red || blue){
            //这个对象是固定的
            RootBeanDefinition definition = new RootBeanDefinition(RainBow.class);
            beanDefinitionRegistry.registerBeanDefinition("rainBow",definition);
        }
    }
}
