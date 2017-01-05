package com.codurance.tesco.bootcamp.spring.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by cx11 on 04/01/2017.
 */
@Controller
public class WebPages {

    private final HelloWorldService helloWorldService;

    @Autowired
    public WebPages(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @RequestMapping(value = "helloWorld.html",
    method = RequestMethod.GET,
            produces = MediaType.TEXT_HTML_VALUE
    )

    public String helloWorld(@RequestParam(value = "name",required = false,defaultValue = "World") String name,
                            Model model)
    {
        model.addAttribute("name",name);
        return "helloWorld";
    }

}
