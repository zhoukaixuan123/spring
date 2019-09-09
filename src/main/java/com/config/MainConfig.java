package com.config;

import com.bean.Preson;
import com.controller.BookController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;


/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/9/9$
 * @description 配置类
 */
//@ComponentScan(value = "com")  指定要扫描的包
@Configuration  //告诉spring这是个配置类
//@ComponentScan(value = "com",excludeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
//})   //根据注解类型  排除一个对象

@ComponentScan(value = "com",includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})
},useDefaultFilters = false)
public class MainConfig {
//给容器中注册一个bean preson类
    @Bean(value = "person")
  public Preson preson01(){
      return  new Preson("白雪","25");
  }
}
