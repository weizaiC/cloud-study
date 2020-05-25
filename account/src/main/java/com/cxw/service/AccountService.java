package com.cxw.service;

import com.cxw.dao.AccountMapper;
import com.cxw.po.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public List<Account>  getList(){
        List<Account> list = accountMapper.list();
        System.out.println(list.size());
        return list;
    }
}
