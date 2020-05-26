package com.cxw.service;


import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cxw.dao.AccountMapper;
import com.cxw.po.Account;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService extends ServiceImpl<AccountMapper, Account> {

    public List<Account> query(){
        return this.baseMapper.list();
    }


    public int add(Account account){
        insert(account);
        return account.getId();
    }

}
