package com.qingyu.spring.testinit.scope;

import com.qingyu.spring.scope.ExampleBean;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testExample02 {
    public static void main(String[] args) {
        String conf = "applicationContext.xml";
        AbstractApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println("测试lazy-init 取对象之前");
        ExampleBean e1 = ac.getBean("e1", ExampleBean.class);
        e1.execute();
        ExampleBean e2 = ac.getBean("e1", ExampleBean.class);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e1 == e2);
        ac.close();
    }
}
