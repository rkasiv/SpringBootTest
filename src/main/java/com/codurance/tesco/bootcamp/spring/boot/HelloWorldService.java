package com.codurance.tesco.bootcamp.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
/**
 * Created by cx11 on 03/01/2017.
 */

@Service
public class HelloWorldService {

    private final String helloWord;

    @Autowired

    public HelloWorldService(@Qualifier("helloWord") String helloWord){
        this.helloWord = helloWord;

    }


    public String sayHello(String name)
    {
        return helloWord+ "hello"+name+"World service";

    }
}
