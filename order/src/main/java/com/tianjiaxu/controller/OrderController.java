package com.tianjiaxu.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/order")
@RestController
public class OrderController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index() {
        return port;
    }
}
