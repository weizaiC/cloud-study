package com.cxw.controller;

import com.cxw.openapi.account.IAccountClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @Autowired
    private IAccountClient iAccountClient;

    @PostMapping("/hello")
    public String hello(String id) {
        return "hello";
    }
}
