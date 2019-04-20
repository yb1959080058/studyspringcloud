package com.greatge.ribbonserver.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired RestTemplate restTemplate;

    public String getHelloContent() {
        return restTemplate.getForObject("http://service-eureka-client/",String.class);
    }
}