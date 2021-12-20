package com.chinamobile.rt.ws.bdoc_demo.conditional;

import com.chinamobile.rt.ws.bdoc_demo.bean.DogFood;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Title
 * @Author Administrator
 * @Date 2021-08-18 11:15
 * @Description
 * @Since V1.0
 */
@Configuration
@Conditional(RTConditonal.class)
public class RTConfiguration {

    @Bean
    @ConditionalOnBean
    public DogFood dogFood(){
        return new DogFood();
    }
}
