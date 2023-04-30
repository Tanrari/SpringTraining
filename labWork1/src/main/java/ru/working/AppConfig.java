package ru.working;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("ru.working")
@PropertySource("springer.properties")
public class AppConfig {

}
