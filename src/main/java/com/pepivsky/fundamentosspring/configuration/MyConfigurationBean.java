package com.pepivsky.fundamentosspring.configuration;

import com.pepivsky.fundamentosspring.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {

    @Bean // implementacion del bean
    public MyBean beanOperation() {
        return new MyBean2Implement(); // devolviendo la implementacion
    }

    @Bean // implementacion del bean
    public MyOperation beanOperationOpe() {
        return new MyOperationImplement(); // devolviendo la implementacion
    }

    @Bean // implementacion del bean
    public MyBeanWithDependency beanOperationWithDependency(MyOperation myOperation) { // pasandole la dependencia que necesita por constructor
        return new MyBeanWithDependencyImplement(myOperation); // devolviendo la implementacion
    }
}
