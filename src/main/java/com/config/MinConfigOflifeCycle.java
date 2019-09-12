package com.config;

import com.bean.Car;
import com.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *  bean 的生命周期
 *     bean的创建   初始化  和销毁
 *
 *     容器管理bean的生命周期
 *     我们们可以自定初始化和销毁方法，容器在bean进行
 *     到当前的生命周期中来
 *
 * 指定初始化和销毁方法
 *   指定 init-method  destroy-method
 *
 */
@ComponentScan("com.bean")
@Configuration
public class MinConfigOflifeCycle {

    @Bean(initMethod = "init",destroyMethod = "detory")
  public Car car(){
      return  new Car();
  }


}
