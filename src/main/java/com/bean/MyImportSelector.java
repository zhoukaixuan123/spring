package com.bean;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
//自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {
    public String[] selectImports(AnnotationMetadata annotationMetadata) {
        //返回值 就是导入到容器中的组件全类名
        //方法不能返回null
        return new String[]{"com.bean.Yellow","com.bean.Blue"};
    }
}
