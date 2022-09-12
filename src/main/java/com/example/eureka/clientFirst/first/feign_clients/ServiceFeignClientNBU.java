package com.example.eureka.clientFirst.first.feign_clients;

import com.example.eureka.clientFirst.first.NBUEntity.UAHToForeign;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FeignClient;

import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "eureka-feign-client-nbu")

public interface ServiceFeignClientNBU {

    @GetMapping("/feign-client-nbu/exchange")
    List<UAHToForeign> getOtherService();
}
