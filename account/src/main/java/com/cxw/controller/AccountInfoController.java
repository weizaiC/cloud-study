package com.cxw.controller;

import cn.hutool.json.JSONUtil;
import com.cxw.po.Account;
import com.cxw.service.AccountService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class AccountInfoController {
    @Autowired
    private AccountService accountService;



    @GetMapping("/getList")
    public List<Account> getList(){
        List<Account> userInfoEntityList = accountService.query();
        log.info("data:{}", JSONUtil.toJsonStr(userInfoEntityList));
        return userInfoEntityList;
    }

    @PostMapping("/add")
    public int add(@RequestBody Account account){
        return  accountService.add(account);
    }



}
