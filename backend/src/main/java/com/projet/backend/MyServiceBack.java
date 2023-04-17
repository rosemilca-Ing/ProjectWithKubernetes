package com.projet.backend;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyServiceBack {

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String welcome(){
        return "Happy to see you";
    }

}

