package br.com.ifba;

import br.com.ifba.curso.view.CursoListar;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Prg03SpringApplication {

    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        SpringApplication.run(Prg03SpringApplication.class, args);
                
        ConfigurableApplicationContext context = new SpringApplicationBuilder(Prg03SpringApplication.class)
                                                        .headless(false).run(args);

        CursoListar telaListar = context.getBean(CursoListar.class);
        telaListar.setVisible(true);
    }
}
