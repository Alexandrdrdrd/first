package com.example.eureka.clientFirst.first;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    ServiceFeignClientNBU serviceFeignClientNBU;


    @GetMapping("/first-service/hello")
    public String getHelloWorld() {

        return "Hello World form FIRST SERVICE "
                + serviceFeignClientNBU.getOtherService();
    }


}
