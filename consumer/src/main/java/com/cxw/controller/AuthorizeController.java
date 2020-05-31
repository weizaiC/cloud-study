package com.cxw.controller;

import com.cxw.util.JwtHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthorizeController  {

    @Autowired
    private JwtHelper jwtHelper;

    @PostMapping("/login")
    public Object login(String loginName,String password) {
        Map<String, Object> claims = new HashMap<String, Object>();
        claims.put("loginName", loginName);
        if ("1".equals(password)) {

            return jwtHelper.generateToken(claims);
        } else {
            return "登录帐号或者登录密码错误";
        }
    }
}
