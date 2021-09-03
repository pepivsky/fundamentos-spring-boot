package com.pepivsky.fundamentosspring.bean;

import com.pepivsky.fundamentosspring.bean.MyBeanWithDependency;
import com.pepivsky.fundamentosspring.bean.MyOperation;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency { // este es un bean con dependencia

    // llamando dependencia myOperation
    MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) { // dependencia inyectada en el constructor
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        int numero = 1;
        System.out.println(myOperation.sum(numero));
        System.out.println("Hola desde la implementacion de un bean con dependencia");
    }
}
