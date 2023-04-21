package com.cw.springscratchweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class SpringScratchWebApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext app = SpringApplication.run(SpringScratchWebApplication.class, args);
        //Prints out all the beans that Spring manages for us
        Arrays.stream(app.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
