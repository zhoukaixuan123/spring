import com.bean.Preson;
import com.config.MainConfig;
import com.config.MainConfig2;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/9/9$
 * @description
 */
public class IocTest {

    @Test
    public void getTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
        String[] names = context.getBeanDefinitionNames();//获取所有bean的名字
        for (String name : names) {
            System.out.println(name);
        }
    }


    @Test
    public void getTest2() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
//        String[] names = context.getBeanDefinitionNames();//获取所有bean的名字
//        for (String name : names) {
//            System.out.println(name);
//        }
//        Preson preson = (Preson) context.getBean("preson");
//        Preson preson1 = (Preson) context.getBean("preson");
//        System.out.println(preson == preson1);

        System.out.println("IOC容器创建完成");
                Preson preson = (Preson) context.getBean("preson");
        Preson preson1 = (Preson) context.getBean("preson");
        System.out.println(preson == preson1);
    }




    @Test
    public void getTest3() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] namesForType = context.getBeanNamesForType(Preson.class);
        ConfigurableEnvironment environment = context.getEnvironment();
        String property = environment.getProperty("os.name");
        System.out.println(property);

        for (int i = 0; i < namesForType.length; i++) {
            System.out.println(namesForType[i]);
        }

        Map<String, Preson> ofType = context.getBeansOfType(Preson.class);

        System.out.println(ofType);
    }


    /**
     * import  导入
     */

    @Test
    public void getTest4() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig2.class);
        String[] namesForType = context.getBeanDefinitionNames();
        for (int i = 0; i < namesForType.length; i++) {
            System.out.println(namesForType[i]);
        }

        Map<String, Preson> ofType = context.getBeansOfType(Preson.class);

        System.out.println(ofType);
    }
}
