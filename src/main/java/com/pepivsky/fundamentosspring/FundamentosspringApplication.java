package com.pepivsky.fundamentosspring;

import com.pepivsky.fundamentosspring.component.ComponentDependency;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FundamentosspringApplication implements CommandLineRunner {
    // inyectando la dependencia de la interfaz (vamos a segregar la implementacion a la interfaz)
    private ComponentDependency componentDependency;

    // constructor de la clase que recibe la dependencia para poderla inyectar
    //se puede omitir la notacion @Autowired en las nuevas versiones de Spring
    public FundamentosspringApplication(@Qualifier("componentTwoImplement") ComponentDependency componentDependency) { // qualifier indica que dependencia queremos usar cuando existe mas de una implementacion
        this.componentDependency = componentDependency; // inyectando la dependencia en el constructor
    }


    public static void main(String[] args) {
        SpringApplication.run(FundamentosspringApplication.class, args);
    }

    @Override // metodo de la interfaz
    public void run(String... args) {
        // llamando a la implementacion de la dependencia inyectada
        componentDependency.saludar();
    }
}
