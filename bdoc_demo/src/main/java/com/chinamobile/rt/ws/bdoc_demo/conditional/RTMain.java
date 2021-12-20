package com.chinamobile.rt.ws.bdoc_demo.conditional;

import com.chinamobile.rt.ws.bdoc_demo.bean.DogFood;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Title
 * @Author Administrator
 * @Date 2021-08-18 11:19
 * @Description
 * @Since V1.0
 */
public class RTMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(RTConfiguration.class);
        System.out.println(context.getBean(DogFood.class));
    }
}
