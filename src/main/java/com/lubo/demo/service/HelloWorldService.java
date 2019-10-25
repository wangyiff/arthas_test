package com.lubo.demo.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {

    public String getHelloMessage() {
        return "Hello world";
    }

}