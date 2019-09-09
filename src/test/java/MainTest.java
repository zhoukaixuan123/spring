import com.bean.Preson;
import com.config.MainConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/9/9$
 * @description 测试
 */
public class MainTest {
    public static void main(String[] args) {
        //beans.xml  获取配置对象的方式
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Preson person = (Preson) context.getBean("preson");
//        System.out.println(person);


        //注解式  Context获取对象
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);
        Preson bean = applicationContext.getBean(Preson.class);
        String[] namesForType = applicationContext.getBeanNamesForType(Preson.class);
        for (String s : namesForType) {
            System.out.println(s);
        }
        System.out.println(bean);
    }
}
