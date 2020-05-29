package com.cxw.controller;

import com.cxw.openapi.account.IAccountClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("consumer")
public class TestController {

    @Autowired
    private IAccountClient iAccountClient;

    @GetMapping("test")
    public String getAccount(){
        return  iAccountClient.getAccount();
    }
}
