package com.codurance.tesco.bootcamp.spring.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by cx11 on 03/01/2017.
 */

@Configuration
public class MyApplicationConfiguration {

    @Value("${hello.word}")
    private String helloWord;

    @Bean(name ="helloWord")
    public String helloWord(){
        return helloWord;

    }

}
