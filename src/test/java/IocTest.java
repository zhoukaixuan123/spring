import com.config.MainConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
}
