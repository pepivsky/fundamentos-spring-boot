package com.pepivsky.fundamentosspring.component;

import org.springframework.stereotype.Component;

@Component // anotacion para manejar las depdencencias y poderlas inyectar
public class ComponentImplement implements ComponentDependency{

    @Override
    public void saludar() {
        System.out.println("Hola mundo desde mi componente");
    }
}
