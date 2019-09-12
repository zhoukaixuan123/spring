import com.bean.Preson;
import com.config.MainConfig;
import com.config.MainConfig2;
import com.config.MinConfigOflifeCycle;
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
public class beanTest {

    @Test
    public void getTest() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MinConfigOflifeCycle.class);
        context.close();
    }



}
