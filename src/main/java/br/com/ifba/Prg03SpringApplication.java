package br.com.ifba;

import br.com.ifba.curso.view.CursoListar;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Prg03SpringApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                new SpringApplicationBuilder(Prg03SpringApplication.class)
                        .headless(false).run(args);

        CursoListar telaCursoListar = context.getBean(CursoListar.class);
        telaCursoListar.setVisible(true);
    }
}
