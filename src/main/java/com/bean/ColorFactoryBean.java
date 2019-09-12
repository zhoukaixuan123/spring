package com.bean;

import org.springframework.beans.factory.FactoryBean;

public class ColorFactoryBean implements FactoryBean<Color> {

    /**
     * 返回一个Color对象
     * @return
     * @throws Exception
     */
    public Color getObject() throws Exception {
        System.out.println("BeanFactory");
        return new Color();
    }

    public Class<?> getObjectType() {
        return null;
    }

    /**
     * 设置是否是单例
     * @return  true是单实例
     *          false 多实例
     */
    public boolean isSingleton() {
        return false;
    }
}
