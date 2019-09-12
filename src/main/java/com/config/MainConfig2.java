package com.config;

import com.bean.Color;
import com.bean.ColorFactoryBean;
import com.bean.MyImportSelector;
import com.bean.Preson;
;
import org.springframework.context.annotation.*;

@Configuration
@Import({ MyImportSelector.class,MyImportBEanDefinitonRegister.class})
public class MainConfig2 {

    /**
     * prototype  多实例  项目启动时 不会调用方法创建实例  每次请求才会创建对象放到容器当中
     * singleton  单实例  单实例ioc启动会调用方法创建对象放到IOC容器中，以后每次从容器中拿
     * request  同一次请求创建一个实例
     * session  同一个session创建一个实例
     * @return
     *
     *
     *  懒加载
     *
     *     单实例bean 默认容器启动时候创建对象
     *     懒加载，就是容器启动时候不创建bean
     *
     *
     *  如果是windows  给容器注册 bill
     *  如果是linux  给容器注册linux
     *
     *Conditional({Condition})
     */
   // @Scope("prototype")
    //@Lazy
    @Bean(value = "preson")
    public Preson preson(){
        System.out.println("调用preson对象");
        return  new Preson("张三","25");
    }


    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Preson preson01(){
        return new Preson("Bill Gates","63");
    }
    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Preson preson02(){
        return new Preson("linus","45");
    }

    @Bean
    public ColorFactoryBean  colorFactoryBean(){
     return  new ColorFactoryBean();
    }
}
