package com.codurance.tesco.bootcamp.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration

/**
 * Created by cx11 on 03/01/2017.
 */
public class Endpoints {

    private final HelloWorldService helloWorldService;

    @Autowired
    public Endpoints(HelloWorldService helloWorldService){


        this.helloWorldService = helloWorldService;
    }



    @RequestMapping(value = "/helloWorld", method = RequestMethod.GET,
    produces = MediaType.TEXT_PLAIN_VALUE)

    public String helloWorld(){
        return helloWorldService.sayHello("World");
    }

    @RequestMapping(value = "/helloWorld.json",
    method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Message helloWorldMessage(@RequestParam(value="name",required=false,
                                     defaultValue ="World") String name) {

        return new Message(helloWorldService.sayHello("World"));
    }
}
