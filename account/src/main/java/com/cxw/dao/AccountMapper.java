package com.cxw.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.cxw.po.Account;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AccountMapper extends BaseMapper<Account> {
    List<Account> list();
}
