package com.pepivsky.fundamentosspring.configuration;

import com.pepivsky.fundamentosspring.bean.MyBean;
import com.pepivsky.fundamentosspring.bean.MyBean2Implement;
import com.pepivsky.fundamentosspring.bean.MyBeanImplement;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean // implementacion del bean
    public MyBean beanOperation() {
        return new MyBean2Implement(); // devolviendo la implementacion
    }
}
