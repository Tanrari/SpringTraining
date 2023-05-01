package ru.homeworktwo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;


@Configuration
@PropertySource("classpath:appresources.properties")
@ComponentScan("ru.homeworktwo")
public class AppConfiguration {


    @Bean
    @Scope(scopeName = "prototype")
    public Circle circle(){
        return new Circle(coords());
    }

    @Bean
    @Scope("prototype")
    public Coords coords(){
        return new Coords();
    }

    @Bean
    @Scope("prototype")
    public Point point(){
        return new Point();

    }

    @Bean
    @Scope("singleton")
    public Scene scene(){
        return Scene.getInstance();
    }



}
