package com.cn.pojo;

/**
 * @author Syen
 * @date 2019/7/26 0026-下午 13:04
 */
public class Dog {
    private String name;

    public Dog(String name) {/*构造注入*/
        this.name = name;
    }

    public Dog() {
        System.out.println("好狗.......");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
