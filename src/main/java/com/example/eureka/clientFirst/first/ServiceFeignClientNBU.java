package com.example.eureka.clientFirst.first;

import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "eureka-feign-client-nbu")

public interface ServiceFeignClientNBU {

    @GetMapping("feign-client-nbu/hello")
    String getOtherService();
}
