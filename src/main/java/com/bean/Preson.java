package com.bean;

/**
 * 功能描述
 *
 * @author zhoukx
 * @date 2019/9/9$
 * @description
 */
public class Preson {

    private  String name;
    private  String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Preson(String name, String age) {
        this.name = name;
        this.age = age;
    }

    public Preson(String name) {
        this.name = name;
    }

    public Preson() {
    }

    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
