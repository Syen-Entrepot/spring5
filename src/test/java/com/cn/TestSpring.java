package com.cn;

import com.cn.pojo.Car;
import com.cn.pojo.Dog;
import com.cn.pojo.Girl;
import com.cn.pojo.Pay;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Syen
 * @date 2019/7/23 0023-上午 3:22
 */
public class TestSpring {
    @Test
    public void m_girl(){
        //1.获取上下文对象，spring里面声明对象需要通过上下文对象获取

        ApplicationContext cts=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过这个对象获取我们的girl

        Girl girl= (Girl) cts.getBean("girl");
        System.out.println(girl);


    }

    @Test
    public void m_pay(){
        //1.获取上下文对象，spring里面声明对象需要通过上下文对象获取

        ApplicationContext cts=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.通过这个对象获取我们的girl

        Pay pay= (Pay) cts.getBean("pay1");
        pay.pay();
        Pay pay1= (Pay) cts.getBean("pay");
        pay1.pay();


    }

    @Test
    public void scalxml(){
       /*读取多个配置文件*/
        ApplicationContext cts=new ClassPathXmlApplicationContext
                (new String[]{"beans.xml","beans1.xml"});

           /*下面的方式由于指定了class不需要强转*/
        Girl g=cts.getBean("mygirl",Girl.class);
        // Girl g1=cts.getBean("yourgirl",Girl.class);
        Girl g3=cts.getBean("hisgirl",Girl.class);


        System.out.println(g3);
       // ((ClassPathXmlApplicationContext) cts).close();
      // ((ClassPathXmlApplicationContext) cts).refresh();
       // ((ClassPathXmlApplicationContext) cts).destroy();

    }

    @Test
    public void scal(){
        /*读取多个配置文件*/
        ApplicationContext cts=new ClassPathXmlApplicationContext
                (new String[]{"beans.xml","beans1.xml"});

        /*下面的方式由于指定了class不需要强转*/
        /*t是hisgirl的别名*/
        /*下面只化一次妆，是spring默认是单例的模式*/
        Girl g3=cts.getBean("t",Girl.class);
        Girl g1=cts.getBean("t1",Girl.class);
        Girl g2=cts.getBean("t2",Girl.class);

        System.out.println(g3);
        System.out.println(g1);
        System.out.println(g2);


    }
    @Test
    public void lazy_init(){
        /*读取多个配置文件*/
        ApplicationContext cts=new ClassPathXmlApplicationContext
                (new String[]{"beans2.xml"});

          Girl t=cts.getBean("girl",Girl.class);

    }
    @Test
    public void init(){
        /*读取多个配置文件*/
        ApplicationContext cts=new ClassPathXmlApplicationContext
                (new String[]{"beans2.xml"});
      /*直接通过类类型获取*/
       Dog bean=cts.getBean(Dog.class);
       Girl girl=cts.getBean(Girl.class);

      // System.out.println(bean.getName());
        System.out.println(girl.getDog().getName());

    }
    @Test
    public void m1(){/*构造器注入*/
        /*读取多个配置文件*/
        ApplicationContext cts=new ClassPathXmlApplicationContext
                (new String[]{"beans2.xml"});
        /*直接通过类类型获取*/
        Dog dog2=cts.getBean("dog1",Dog.class);


        // System.out.println(bean.getName());
        System.out.println(dog2.getName());

    }
    @Test
    public void m2(){/*构造器注入*/
        /*读取多个配置文件*/
        ApplicationContext cts=new ClassPathXmlApplicationContext
                (new String[]{"beans2.xml"});
        /*直接通过类类型获取*/
       Car car= cts.getBean("car",Car.class);


        // System.out.println(bean.getName());
        System.out.println(car);

    }
}
