package com.cn.pojo;

/**
 * @author Syen
 * @date 2019/7/23 0023-下午 17:09
 */
public class Girl {
    private String name;
    private Integer age;
    private Dog dog;

    public Girl() {
        /*用.xml文件注入一定要有无参构造函数*/
        System.out.println("i come in.....");
    }

    public Girl(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void classDress(){
        System.out.println("我要卸妆了。。。。。。");
    }
    public void dess(){
        System.out.println("我要先化个状");
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
