package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
/**
 * 可以在测试期间很方便的像编码一样注入变量
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot02ConfigApplicationTests {
    @Autowired
    Person person;
    @Test
    public void contextLoads() {
        System.out.println("person的值是：---" + person + "，当前方法=SpringBoot02ConfigApplicationTests.contextLoads()");
    }

}
