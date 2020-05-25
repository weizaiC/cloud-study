package com.cxw.controller;

import com.cxw.po.Account;
import com.cxw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountInfoController {
    @Autowired
    private AccountService accountService;


    /**
     * 查询全部信息
     * @Author Sans
     * @CreateTime 2019/6/8 16:35
     * @Param  userId  用户ID
     * @Return List<UserInfoEntity> 用户实体集合
     */
    @GetMapping("/getList")
    public List<Account> getList(){
        List<Account> userInfoEntityList = accountService.getList();
        return userInfoEntityList;
    }

}
