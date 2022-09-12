package com.example.eureka.clientFirst.first.controllers;


import com.example.eureka.clientFirst.first.feign_clients.ServiceFeignClientNBU;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    ServiceFeignClientNBU serviceFeignClientNBUImpl;


    @GetMapping("/first-service/hello")
    public String getHelloWorld() {

        return "Hello World form FIRST SERVICE \n" +
                "and look at this info from NBU"
                + serviceFeignClientNBUImpl.getOtherService().get(0);
    }


}
